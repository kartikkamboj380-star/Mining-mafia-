package J8;

import I8.C0666e0;
import I8.E0;
import I8.InterfaceC0670g0;
import I8.InterfaceC0683n;
import I8.O0;
import I8.Y;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f implements Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f2373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f2375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f2376e;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0683n f2377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f2378b;

        public a(InterfaceC0683n interfaceC0683n, e eVar) {
            this.f2377a = interfaceC0683n;
            this.f2378b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2377a.e(this.f2378b, Unit.f45918a);
        }
    }

    private e(Handler handler, String str, boolean z9) {
        super(null);
        this.f2373b = handler;
        this.f2374c = str;
        this.f2375d = z9;
        this.f2376e = z9 ? this : new e(handler, str, true);
    }

    private final void u1(CoroutineContext coroutineContext, Runnable runnable) {
        E0.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0666e0.b().l1(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(e eVar, Runnable runnable) {
        eVar.f2373b.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x1(e eVar, Runnable runnable, Throwable th) {
        eVar.f2373b.removeCallbacks(runnable);
        return Unit.f45918a;
    }

    @Override // I8.Y
    public void M(long j10, InterfaceC0683n interfaceC0683n) {
        final a aVar = new a(interfaceC0683n, this);
        if (this.f2373b.postDelayed(aVar, kotlin.ranges.b.h(j10, 4611686018427387903L))) {
            interfaceC0683n.f(new Function1() { // from class: J8.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return e.x1(this.f2371a, aVar, (Throwable) obj);
                }
            });
        } else {
            u1(interfaceC0683n.getContext(), aVar);
        }
    }

    @Override // I8.Y
    public InterfaceC0670g0 R(long j10, final Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f2373b.postDelayed(runnable, kotlin.ranges.b.h(j10, 4611686018427387903L))) {
            return new InterfaceC0670g0() { // from class: J8.c
                @Override // I8.InterfaceC0670g0
                public final void c() {
                    e.w1(this.f2369a, runnable);
                }
            };
        }
        u1(coroutineContext, runnable);
        return O0.f1734a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f2373b == this.f2373b && eVar.f2375d == this.f2375d;
    }

    public int hashCode() {
        return System.identityHashCode(this.f2373b) ^ (this.f2375d ? 1231 : 1237);
    }

    @Override // I8.K
    public void l1(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f2373b.post(runnable)) {
            return;
        }
        u1(coroutineContext, runnable);
    }

    @Override // I8.K
    public boolean n1(CoroutineContext coroutineContext) {
        return (this.f2375d && Intrinsics.b(Looper.myLooper(), this.f2373b.getLooper())) ? false : true;
    }

    @Override // I8.K
    public String toString() {
        String strR1 = r1();
        if (strR1 != null) {
            return strR1;
        }
        String string = this.f2374c;
        if (string == null) {
            string = this.f2373b.toString();
        }
        if (!this.f2375d) {
            return string;
        }
        return string + ".immediate";
    }

    @Override // I8.L0
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public e q1() {
        return this.f2376e;
    }

    public /* synthetic */ e(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public e(Handler handler, String str) {
        this(handler, str, false);
    }
}
