package p175r4;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f48237b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f48238a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f48239a = null;

        a() {
        }

        public b a() {
            return new b(this.f48239a);
        }

        public a b(e eVar) {
            this.f48239a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f48238a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f48238a;
    }
}
