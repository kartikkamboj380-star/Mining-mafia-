package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C1356f0;
import com.facebook.react.uimanager.events.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends androidx.swiperefreshlayout.widget.c {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final C0351a f16139s0 = new C0351a(null);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f16140l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f16141m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f16142n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final int f16143o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f16144p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f16145q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f16146r0;

    /* JADX INFO: renamed from: com.facebook.react.views.swiperefresh.a$a, reason: collision with other inner class name */
    private static final class C0351a {
        public /* synthetic */ C0351a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0351a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f16143o0 = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private final boolean B(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f16144p0 = motionEvent.getX();
            this.f16145q0 = false;
        } else if (action == 2) {
            float fAbs = Math.abs(motionEvent.getX() - this.f16144p0);
            if (this.f16145q0 || fAbs > this.f16143o0) {
                this.f16145q0 = true;
                return false;
            }
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public boolean c() {
        View childAt = getChildAt(0);
        return childAt != null ? childAt.canScrollVertically(-1) : super.c();
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!B(ev) || !super.onInterceptTouchEvent(ev)) {
            return false;
        }
        q.b(this, ev);
        this.f16146r0 = true;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (this.f16140l0) {
            return;
        }
        this.f16140l0 = true;
        setProgressViewOffset(this.f16142n0);
        setRefreshing(this.f16141m0);
    }

    @Override // androidx.swiperefreshlayout.widget.c, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getActionMasked() == 1 && this.f16146r0) {
            q.a(this, ev);
            this.f16146r0 = false;
        }
        return super.onTouchEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z9);
        }
    }

    public final void setProgressViewOffset(float f10) {
        this.f16142n0 = f10;
        if (this.f16140l0) {
            int progressCircleDiameter = getProgressCircleDiameter();
            s(false, Math.round(C1356f0.i(f10)) - progressCircleDiameter, Math.round(C1356f0.i(f10 + 64.0f)) - progressCircleDiameter);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.c
    public void setRefreshing(boolean z9) {
        this.f16141m0 = z9;
        if (this.f16140l0) {
            super.setRefreshing(z9);
        }
    }
}
