package p127m6;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import kotlin.text.StringsKt;
import p087i6.g;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46426e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f46427f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f46428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f46429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f46430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f46431d;

    public static final class a {

        /* JADX INFO: renamed from: m6.i$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0473a extends k implements Function0 {
            C0473a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).p());
            }
        }

        /* synthetic */ class b extends k implements Function0 {
            b(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).q());
            }
        }

        /* synthetic */ class c extends k implements Function0 {
            c(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.receiver).r());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String h() {
            return "Must be called on a background thread, was called on " + i.f46426e.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String j() {
            return "Must be called on a blocking thread, was called on " + i.f46426e.o() + '.';
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String l() {
            return "Must not be called on a main thread, was called on " + i.f46426e.o() + '.';
        }

        private final void m(Function0 function0, Function0 function1) {
            if (((Boolean) function0.invoke()).booleanValue()) {
                return;
            }
            g.f().b((String) function1.invoke());
            n();
        }

        private final String o() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean p() {
            String strO = o();
            Intrinsics.checkNotNullExpressionValue(strO, "<get-threadName>(...)");
            return StringsKt.P(strO, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean q() {
            String strO = o();
            Intrinsics.checkNotNullExpressionValue(strO, "<get-threadName>(...)");
            return StringsKt.P(strO, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean r() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void g() {
            m(new C0473a(this), new Function0() { // from class: m6.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.a.h();
                }
            });
        }

        public final void i() {
            m(new b(this), new Function0() { // from class: m6.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.a.j();
                }
            });
        }

        public final void k() {
            m(new c(this), new Function0() { // from class: m6.g
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.a.l();
                }
            });
        }

        public final boolean n() {
            return i.f46427f;
        }

        public final void s(boolean z9) {
            i.f46427f = z9;
        }

        private a() {
        }
    }

    public i(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(blockingExecutorService, "blockingExecutorService");
        this.f46428a = new e(backgroundExecutorService);
        this.f46429b = new e(backgroundExecutorService);
        this.f46430c = new e(backgroundExecutorService);
        this.f46431d = new e(blockingExecutorService);
    }

    public static final void c() {
        f46426e.g();
    }

    public static final void d() {
        f46426e.i();
    }

    public static final void e() {
        f46426e.k();
    }

    public static final void f(boolean z9) {
        f46426e.s(z9);
    }
}
