package K8;

import I8.AbstractC0657a;
import I8.C0;
import I8.H0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends AbstractC0657a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f2968d;

    public h(CoroutineContext coroutineContext, g gVar, boolean z9, boolean z10) {
        super(coroutineContext, z9, z10);
        this.f2968d = gVar;
    }

    @Override // I8.H0
    public void E(Throwable th) {
        CancellationException cancellationExceptionE0 = H0.E0(this, th, null, 1, null);
        this.f2968d.c(cancellationExceptionE0);
        C(cancellationExceptionE0);
    }

    protected final g P0() {
        return this.f2968d;
    }

    @Override // I8.H0, I8.B0
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C0(I(), null, this);
        }
        E(cancellationException);
    }

    @Override // K8.y
    public void d(Function1 function1) {
        this.f2968d.d(function1);
    }

    @Override // K8.y
    public Object g(Object obj) {
        return this.f2968d.g(obj);
    }

    @Override // K8.x
    public i iterator() {
        return this.f2968d.iterator();
    }

    @Override // K8.y
    public Object k(Object obj, p169q8.b bVar) {
        return this.f2968d.k(obj, bVar);
    }

    @Override // K8.x
    public Object l(p169q8.b bVar) {
        return this.f2968d.l(bVar);
    }

    @Override // K8.x
    public Object m() {
        return this.f2968d.m();
    }

    @Override // K8.y
    public boolean o(Throwable th) {
        return this.f2968d.o(th);
    }

    @Override // K8.x
    public Object p(p169q8.b bVar) {
        Object objP = this.f2968d.p(bVar);
        p179r8.b.e();
        return objP;
    }

    @Override // K8.y
    public boolean q() {
        return this.f2968d.q();
    }
}
