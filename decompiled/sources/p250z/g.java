package p250z;

/* JADX INFO: loaded from: classes.dex */
class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f50851m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f50834e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f50834e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p250z.f
    public void d(int i10) {
        if (this.f50839j) {
            return;
        }
        this.f50839j = true;
        this.f50836g = i10;
        for (d dVar : this.f50840k) {
            dVar.a(dVar);
        }
    }
}
