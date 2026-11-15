package H2;

/* JADX INFO: loaded from: classes.dex */
public class u implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f1178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f1179b;

    public u(x xVar, z zVar) {
        this.f1178a = xVar;
        this.f1179b = zVar;
    }

    @Override // H2.x
    public boolean b(Y1.l lVar) {
        return this.f1178a.b(lVar);
    }

    @Override // H2.x
    public void c(Object obj) {
        this.f1178a.c(obj);
    }

    @Override // H2.x
    public int d(Y1.l lVar) {
        return this.f1178a.d(lVar);
    }

    @Override // H2.x
    public p023c2.a e(Object obj, p023c2.a aVar) {
        this.f1179b.c(obj);
        return this.f1178a.e(obj, aVar);
    }

    @Override // H2.x
    public p023c2.a get(Object obj) {
        p023c2.a aVar = this.f1178a.get(obj);
        if (aVar == null) {
            this.f1179b.b(obj);
            return aVar;
        }
        this.f1179b.a(obj);
        return aVar;
    }
}
