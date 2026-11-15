package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class D implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f10138i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final D f10139j = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10141b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f10144e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10142c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10143d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1173t f10145f = new C1173t(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f10146g = new Runnable() { // from class: androidx.lifecycle.C
        @Override // java.lang.Runnable
        public final void run() {
            D.i(this.f10137a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F.a f10147h = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10148a = new a();

        private a() {
        }

        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a() {
            return D.f10139j;
        }

        public final void b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            D.f10139j.h(context);
        }

        private b() {
        }
    }

    public static final class c extends AbstractC1160f {

        public static final class a extends AbstractC1160f {
            final /* synthetic */ D this$0;

            a(D d10) {
                this.this$0 = d10;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@NotNull Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.AbstractC1160f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                F.f10152b.b(activity).e(D.this.f10147h);
            }
        }

        @Override // androidx.lifecycle.AbstractC1160f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            D.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            a.a(activity, new a(D.this));
        }

        @Override // androidx.lifecycle.AbstractC1160f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            D.this.g();
        }
    }

    public static final class d implements F.a {
        d() {
        }

        @Override // androidx.lifecycle.F.a
        public void a() {
            D.this.f();
        }

        @Override // androidx.lifecycle.F.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.F.a
        public void onResume() {
            D.this.e();
        }
    }

    private D() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(D this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    public static final r l() {
        return f10138i.a();
    }

    public final void d() {
        int i10 = this.f10141b - 1;
        this.f10141b = i10;
        if (i10 == 0) {
            Handler handler = this.f10144e;
            Intrinsics.c(handler);
            handler.postDelayed(this.f10146g, 700L);
        }
    }

    public final void e() {
        int i10 = this.f10141b + 1;
        this.f10141b = i10;
        if (i10 == 1) {
            if (this.f10142c) {
                this.f10145f.i(AbstractC1164j.a.ON_RESUME);
                this.f10142c = false;
            } else {
                Handler handler = this.f10144e;
                Intrinsics.c(handler);
                handler.removeCallbacks(this.f10146g);
            }
        }
    }

    public final void f() {
        int i10 = this.f10140a + 1;
        this.f10140a = i10;
        if (i10 == 1 && this.f10143d) {
            this.f10145f.i(AbstractC1164j.a.ON_START);
            this.f10143d = false;
        }
    }

    public final void g() {
        this.f10140a--;
        k();
    }

    @Override // androidx.lifecycle.r
    public AbstractC1164j getLifecycle() {
        return this.f10145f;
    }

    public final void h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10144e = new Handler();
        this.f10145f.i(AbstractC1164j.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f10141b == 0) {
            this.f10142c = true;
            this.f10145f.i(AbstractC1164j.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f10140a == 0 && this.f10142c) {
            this.f10145f.i(AbstractC1164j.a.ON_STOP);
            this.f10143d = true;
        }
    }
}
