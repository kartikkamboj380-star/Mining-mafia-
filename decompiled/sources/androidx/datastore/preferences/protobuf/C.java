package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f9389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f9390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f9391c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0.b f9392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k0.b f9394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f9395d;

        public a(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
            this.f9392a = bVar;
            this.f9393b = obj;
            this.f9394c = bVar2;
            this.f9395d = obj2;
        }
    }

    private C(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        this.f9389a = new a(bVar, obj, bVar2, obj2);
        this.f9390b = obj;
        this.f9391c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return C1121q.b(aVar.f9392a, 1, obj) + C1121q.b(aVar.f9394c, 2, obj2);
    }

    public static C d(k0.b bVar, Object obj, k0.b bVar2, Object obj2) {
        return new C(bVar, obj, bVar2, obj2);
    }

    static void e(AbstractC1113i abstractC1113i, a aVar, Object obj, Object obj2) {
        C1121q.u(abstractC1113i, aVar.f9392a, 1, obj);
        C1121q.u(abstractC1113i, aVar.f9394c, 2, obj2);
    }

    public int a(int i10, Object obj, Object obj2) {
        return AbstractC1113i.O(i10) + AbstractC1113i.y(b(this.f9389a, obj, obj2));
    }

    a c() {
        return this.f9389a;
    }
}
