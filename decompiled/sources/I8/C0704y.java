package I8;

/* JADX INFO: renamed from: I8.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C0704y extends H0 implements InterfaceC0702x {
    public C0704y(B0 b10) {
        super(true);
        i0(b10);
    }

    @Override // I8.W
    public Object R0(p169q8.b bVar) throws Throwable {
        Object objA = A(bVar);
        p179r8.b.e();
        return objA;
    }

    @Override // I8.InterfaceC0702x
    public boolean W(Throwable th) {
        return o0(new C(th, false, 2, null));
    }

    @Override // I8.InterfaceC0702x
    public boolean X(Object obj) {
        return o0(obj);
    }

    @Override // I8.H0
    public boolean Y() {
        return true;
    }

    @Override // I8.W
    public Object n() {
        return P();
    }
}
