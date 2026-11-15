package O5;

/* JADX INFO: loaded from: classes2.dex */
final class C implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C f4498a = this;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P5.f f4499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P5.f f4500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P5.f f4501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P5.f f4502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P5.f f4503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final P5.f f4504g;

    /* synthetic */ C(n nVar, B b10) {
        p pVar = new p(nVar);
        this.f4499b = pVar;
        P5.f fVarA = P5.d.a(new x(pVar));
        this.f4500c = fVarA;
        P5.f fVarA2 = P5.d.a(new v(pVar, fVarA));
        this.f4501d = fVarA2;
        P5.f fVarA3 = P5.d.a(new j(pVar));
        this.f4502e = fVarA3;
        P5.f fVarA4 = P5.d.a(new m(fVarA2, fVarA3, pVar));
        this.f4503f = fVarA4;
        this.f4504g = P5.d.a(new o(fVarA4));
    }

    @Override // O5.e
    public final InterfaceC0917b zza() {
        return (InterfaceC0917b) this.f4504g.zza();
    }
}
