package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class A extends F.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47278a;

    static final class b extends F.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47279a;

        b() {
        }

        @Override // o6.F.e.f.a
        public F.e.f a() {
            String str = this.f47279a;
            if (str != null) {
                return new A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // o6.F.e.f.a
        public F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f47279a = str;
            return this;
        }
    }

    @Override // o6.F.e.f
    public String b() {
        return this.f47278a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f47278a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f47278a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f47278a + "}";
    }

    private A(String str) {
        this.f47278a = str;
    }
}
