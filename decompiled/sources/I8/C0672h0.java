package I8;

/* JADX INFO: renamed from: I8.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0672h0 implements InterfaceC0681m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0670g0 f1785a;

    public C0672h0(InterfaceC0670g0 interfaceC0670g0) {
        this.f1785a = interfaceC0670g0;
    }

    @Override // I8.InterfaceC0681m
    public void a(Throwable th) {
        this.f1785a.c();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f1785a + ']';
    }
}
