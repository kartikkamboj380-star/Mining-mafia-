package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class x extends F.e.d.AbstractC0507e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47684b;

    static final class b extends F.e.d.AbstractC0507e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47686b;

        b() {
        }

        @Override // o6.F.e.d.AbstractC0507e.b.a
        public F.e.d.AbstractC0507e.b a() {
            String str;
            String str2 = this.f47685a;
            if (str2 != null && (str = this.f47686b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47685a == null) {
                sb.append(" rolloutId");
            }
            if (this.f47686b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.AbstractC0507e.b.a
        public F.e.d.AbstractC0507e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f47685a = str;
            return this;
        }

        @Override // o6.F.e.d.AbstractC0507e.b.a
        public F.e.d.AbstractC0507e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f47686b = str;
            return this;
        }
    }

    @Override // o6.F.e.d.AbstractC0507e.b
    public String b() {
        return this.f47683a;
    }

    @Override // o6.F.e.d.AbstractC0507e.b
    public String c() {
        return this.f47684b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0507e.b) {
            F.e.d.AbstractC0507e.b bVar = (F.e.d.AbstractC0507e.b) obj;
            if (this.f47683a.equals(bVar.b()) && this.f47684b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47683a.hashCode() ^ 1000003) * 1000003) ^ this.f47684b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f47683a + ", variantId=" + this.f47684b + "}";
    }

    private x(String str, String str2) {
        this.f47683a = str;
        this.f47684b = str2;
    }
}
