package p147o6;

/* JADX INFO: renamed from: o6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7080d extends F.a.AbstractC0491a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47495c;

    /* JADX INFO: renamed from: o6.d$b */
    static final class b extends F.a.AbstractC0491a.AbstractC0492a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47498c;

        b() {
        }

        @Override // o6.F.a.AbstractC0491a.AbstractC0492a
        public F.a.AbstractC0491a a() {
            String str;
            String str2;
            String str3 = this.f47496a;
            if (str3 != null && (str = this.f47497b) != null && (str2 = this.f47498c) != null) {
                return new C7080d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47496a == null) {
                sb.append(" arch");
            }
            if (this.f47497b == null) {
                sb.append(" libraryName");
            }
            if (this.f47498c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.a.AbstractC0491a.AbstractC0492a
        public F.a.AbstractC0491a.AbstractC0492a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f47496a = str;
            return this;
        }

        @Override // o6.F.a.AbstractC0491a.AbstractC0492a
        public F.a.AbstractC0491a.AbstractC0492a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f47498c = str;
            return this;
        }

        @Override // o6.F.a.AbstractC0491a.AbstractC0492a
        public F.a.AbstractC0491a.AbstractC0492a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f47497b = str;
            return this;
        }
    }

    @Override // o6.F.a.AbstractC0491a
    public String b() {
        return this.f47493a;
    }

    @Override // o6.F.a.AbstractC0491a
    public String c() {
        return this.f47495c;
    }

    @Override // o6.F.a.AbstractC0491a
    public String d() {
        return this.f47494b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a.AbstractC0491a) {
            F.a.AbstractC0491a abstractC0491a = (F.a.AbstractC0491a) obj;
            if (this.f47493a.equals(abstractC0491a.b()) && this.f47494b.equals(abstractC0491a.d()) && this.f47495c.equals(abstractC0491a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f47493a.hashCode() ^ 1000003) * 1000003) ^ this.f47494b.hashCode()) * 1000003) ^ this.f47495c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f47493a + ", libraryName=" + this.f47494b + ", buildId=" + this.f47495c + "}";
    }

    private C7080d(String str, String str2, String str3) {
        this.f47493a = str;
        this.f47494b = str2;
        this.f47495c = str3;
    }
}
