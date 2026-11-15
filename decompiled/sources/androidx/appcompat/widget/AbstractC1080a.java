package androidx.appcompat.widget;

import O.AbstractC0845c0;
import O.C0861k0;
import O.InterfaceC0863l0;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1080a extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final C0136a f8173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f8174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f8175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C1082c f8176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f8177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected C0861k0 f8178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8180h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0136a implements InterfaceC0863l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8181a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8182b;

        protected C0136a() {
        }

        @Override // O.InterfaceC0863l0
        public void a(View view) {
            this.f8181a = true;
        }

        @Override // O.InterfaceC0863l0
        public void b(View view) {
            if (this.f8181a) {
                return;
            }
            AbstractC1080a abstractC1080a = AbstractC1080a.this;
            abstractC1080a.f8178f = null;
            AbstractC1080a.super.setVisibility(this.f8182b);
        }

        @Override // O.InterfaceC0863l0
        public void c(View view) {
            AbstractC1080a.super.setVisibility(0);
            this.f8181a = false;
        }

        public C0136a d(C0861k0 c0861k0, int i10) {
            AbstractC1080a.this.f8178f = c0861k0;
            this.f8182b = i10;
            return this;
        }
    }

    AbstractC1080a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8173a = new C0136a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(p060g.a.f43855a, typedValue, true) || typedValue.resourceId == 0) {
            this.f8174b = context;
        } else {
            this.f8174b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i10, int i11, boolean z9) {
        return z9 ? i10 - i11 : i10 + i11;
    }

    protected int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, LinearLayoutManager.INVALID_OFFSET), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int e(View view, int i10, int i11, int i12, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z9) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z9 ? -measuredWidth : measuredWidth;
    }

    public C0861k0 f(int i10, long j10) {
        C0861k0 c0861k0 = this.f8178f;
        if (c0861k0 != null) {
            c0861k0.c();
        }
        if (i10 != 0) {
            C0861k0 c0861k0B = AbstractC0845c0.e(this).b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            c0861k0B.e(j10);
            c0861k0B.g(this.f8173a.d(c0861k0B, i10));
            return c0861k0B;
        }
        if (getVisibility() != 0) {
            setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        C0861k0 c0861k0B2 = AbstractC0845c0.e(this).b(1.0f);
        c0861k0B2.e(j10);
        c0861k0B2.g(this.f8173a.d(c0861k0B2, i10));
        return c0861k0B2;
    }

    public int getAnimatedVisibility() {
        return this.f8178f != null ? this.f8173a.f8182b : getVisibility();
    }

    public int getContentHeight() {
        return this.f8177e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, p060g.j.f44150a, p060g.a.f43857c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(p060g.j.f44195j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1082c c1082c = this.f8176d;
        if (c1082c != null) {
            c1082c.H(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8180h = false;
        }
        if (!this.f8180h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f8180h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8180h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8179g = false;
        }
        if (!this.f8179g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f8179g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8179g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            C0861k0 c0861k0 = this.f8178f;
            if (c0861k0 != null) {
                c0861k0.c();
            }
            super.setVisibility(i10);
        }
    }
}
