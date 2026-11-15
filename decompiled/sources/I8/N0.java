package I8;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class N0 extends kotlin.coroutines.a implements B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0 f1733a = new N0();

    private N0() {
        super(B0.f1699o);
    }

    @Override // I8.B0
    public Object G(p169q8.b bVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // I8.B0
    public InterfaceC0670g0 Q(Function1 function1) {
        return O0.f1734a;
    }

    @Override // I8.B0
    public InterfaceC0696u S(InterfaceC0700w interfaceC0700w) {
        return O0.f1734a;
    }

    @Override // I8.B0
    public boolean isActive() {
        return true;
    }

    @Override // I8.B0
    public boolean isCancelled() {
        return false;
    }

    @Override // I8.B0
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // I8.B0
    public InterfaceC0670g0 w(boolean z9, boolean z10, Function1 function1) {
        return O0.f1734a;
    }

    @Override // I8.B0
    public CancellationException x() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // I8.B0
    public void c(CancellationException cancellationException) {
    }
}
