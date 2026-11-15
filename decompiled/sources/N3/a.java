package N3;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C0063a f3633c = new C0063a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f3634a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f3635b;

    /* JADX INFO: renamed from: N3.a$a, reason: collision with other inner class name */
    private static final class C0063a {
        public /* synthetic */ C0063a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0063a() {
        }
    }

    private final void c() {
        ViewParent viewParent = this.f3635b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        this.f3635b = null;
    }

    @Override // N3.b
    public boolean a(ViewGroup view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = this.f3634a;
        return (i10 == -1 || event.getAction() == 1 || view.getId() != i10) ? false : true;
    }

    public final void b() {
        this.f3634a = -1;
        c();
    }

    public final void d(int i10, ViewParent viewParent) {
        this.f3634a = i10;
        c();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.f3635b = viewParent;
        }
    }
}
