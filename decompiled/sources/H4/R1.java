package H4;

/* JADX INFO: loaded from: classes2.dex */
public final class R1 extends R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B4.o f1241a;

    public R1(B4.o oVar) {
        this.f1241a = oVar;
    }

    @Override // H4.S0
    public final void a6(o2 o2Var) {
        B4.o oVar = this.f1241a;
        if (oVar != null) {
            oVar.a(B4.g.d(o2Var.f1410b, o2Var.f1411c, o2Var.f1412d));
        }
    }

    @Override // H4.S0
    public final boolean b() {
        return this.f1241a == null;
    }
}
