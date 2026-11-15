package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    class a implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f1180a;

        a(t tVar) {
            this.f1180a = tVar;
        }

        @Override // H2.z
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(S1.d dVar) {
            this.f1180a.h(dVar);
        }

        @Override // H2.z
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(S1.d dVar) {
            this.f1180a.c(dVar);
        }

        @Override // H2.z
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void c(S1.d dVar) {
            this.f1180a.b(dVar);
        }
    }

    public static u a(x xVar, t tVar) {
        tVar.g(xVar);
        return new u(xVar, new a(tVar));
    }
}
