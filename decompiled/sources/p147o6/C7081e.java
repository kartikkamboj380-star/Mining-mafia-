package p147o6;

/* JADX INFO: renamed from: o6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7081e extends F.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47500b;

    /* JADX INFO: renamed from: o6.e$b */
    static final class b extends F.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47502b;

        b() {
        }

        @Override // o6.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f47501a;
            if (str2 != null && (str = this.f47502b) != null) {
                return new C7081e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47501a == null) {
                sb.append(" key");
            }
            if (this.f47502b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.c.a
        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f47501a = str;
            return this;
        }

        @Override // o6.F.c.a
        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f47502b = str;
            return this;
        }
    }

    @Override // o6.F.c
    public String b() {
        return this.f47499a;
    }

    @Override // o6.F.c
    public String c() {
        return this.f47500b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.c) {
            F.c cVar = (F.c) obj;
            if (this.f47499a.equals(cVar.b()) && this.f47500b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f47499a.hashCode() ^ 1000003) * 1000003) ^ this.f47500b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f47499a + ", value=" + this.f47500b + "}";
    }

    private C7081e(String str, String str2) {
        this.f47499a = str;
        this.f47500b = str2;
    }
}
