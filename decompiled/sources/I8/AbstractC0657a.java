package I8;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: I8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0657a extends H0 implements B0, p169q8.b, O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f1755c;

    public AbstractC0657a(CoroutineContext coroutineContext, boolean z9, boolean z10) {
        super(z10);
        if (z9) {
            i0((B0) coroutineContext.get(B0.f1699o));
        }
        this.f1755c = coroutineContext.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // I8.H0
    public String I() {
        return T.a(this) + " was cancelled";
    }

    protected void L0(Object obj) {
        z(obj);
    }

    public final void O0(Q q10, Object obj, Function2 function2) {
        q10.d(function2, obj, this);
    }

    @Override // p169q8.b
    public final CoroutineContext getContext() {
        return this.f1755c;
    }

    @Override // I8.O
    public CoroutineContext getCoroutineContext() {
        return this.f1755c;
    }

    @Override // I8.H0
    public final void h0(Throwable th) {
        M.a(this.f1755c, th);
    }

    @Override // I8.H0, I8.B0
    public boolean isActive() {
        return super.isActive();
    }

    @Override // I8.H0
    public String q0() {
        String strG = I.g(this.f1755c);
        if (strG == null) {
            return super.q0();
        }
        return '\"' + strG + "\":" + super.q0();
    }

    @Override // p169q8.b
    public final void resumeWith(Object obj) {
        Object objP0 = p0(E.b(obj));
        if (objP0 == I0.f1720b) {
            return;
        }
        L0(objP0);
    }

    @Override // I8.H0
    protected final void v0(Object obj) {
        if (!(obj instanceof C)) {
            N0(obj);
        } else {
            C c10 = (C) obj;
            M0(c10.f1702a, c10.a());
        }
    }

    protected void N0(Object obj) {
    }

    protected void M0(Throwable th, boolean z9) {
    }
}
