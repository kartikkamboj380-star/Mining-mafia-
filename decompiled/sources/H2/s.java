package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f1177a;

        a(t tVar) {
            this.f1177a = tVar;
        }

        @Override // H2.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(S1.d dVar) {
            this.f1177a.l(dVar);
        }

        @Override // H2.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(S1.d dVar) {
            this.f1177a.n(dVar);
        }

        @Override // H2.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(S1.d dVar) {
            this.f1177a.a(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.e(xVar);
        return new u(xVar, new a(tVar));
    }
}
