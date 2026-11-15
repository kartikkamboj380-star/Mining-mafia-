package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class v extends F.e.d.AbstractC0506d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47672a;

    static final class b extends F.e.d.AbstractC0506d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47673a;

        b() {
        }

        @Override // o6.F.e.d.AbstractC0506d.a
        public F.e.d.AbstractC0506d a() {
            String str = this.f47673a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // o6.F.e.d.AbstractC0506d.a
        public F.e.d.AbstractC0506d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f47673a = str;
            return this;
        }
    }

    @Override // o6.F.e.d.AbstractC0506d
    public String b() {
        return this.f47672a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0506d) {
            return this.f47672a.equals(((F.e.d.AbstractC0506d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f47672a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f47672a + "}";
    }

    private v(String str) {
        this.f47672a = str;
    }
}
