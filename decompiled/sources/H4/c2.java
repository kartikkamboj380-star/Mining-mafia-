package H4;

/* JADX INFO: loaded from: classes2.dex */
public final class c2 extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B4.e f1265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f1266b;

    public c2(B4.e eVar, Object obj) {
        this.f1265a = eVar;
        this.f1266b = obj;
    }

    @Override // H4.L
    public final void H0(Z0 z9) {
        B4.e eVar = this.f1265a;
        if (eVar != null) {
            eVar.a(z9.j());
        }
    }

    @Override // H4.L
    public final void zzb() {
        Object obj;
        B4.e eVar = this.f1265a;
        if (eVar == null || (obj = this.f1266b) == null) {
            return;
        }
        eVar.b(obj);
    }
}
