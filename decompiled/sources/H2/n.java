package H2;

/* JADX INFO: loaded from: classes.dex */
public interface n extends x, p013b2.c {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f1166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p023c2.a f1167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1168c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1169d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1170e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1171f;

        private a(Object obj, p023c2.a aVar, b bVar, int i10) {
            this.f1166a = Y1.k.g(obj);
            this.f1167b = (p023c2.a) Y1.k.g(p023c2.a.w(aVar));
            this.f1171f = i10;
        }

        public static a a(Object obj, p023c2.a aVar, int i10, b bVar) {
            return new a(obj, aVar, bVar, i10);
        }

        public static a b(Object obj, p023c2.a aVar, b bVar) {
            return a(obj, aVar, -1, bVar);
        }
    }

    public interface b {
    }
}
