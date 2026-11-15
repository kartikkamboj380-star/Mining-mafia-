package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class i extends F.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f47541f;

    static final class b extends F.e.a.AbstractC0493a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f47545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f47546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f47547f;

        b() {
        }

        @Override // o6.F.e.a.AbstractC0493a
        public F.e.a a() {
            String str;
            String str2 = this.f47542a;
            if (str2 != null && (str = this.f47543b) != null) {
                return new i(str2, str, this.f47544c, null, this.f47545d, this.f47546e, this.f47547f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47542a == null) {
                sb.append(" identifier");
            }
            if (this.f47543b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.a.AbstractC0493a
        public F.e.a.AbstractC0493a b(String str) {
            this.f47546e = str;
            return this;
        }

        @Override // o6.F.e.a.AbstractC0493a
        public F.e.a.AbstractC0493a c(String str) {
            this.f47547f = str;
            return this;
        }

        @Override // o6.F.e.a.AbstractC0493a
        public F.e.a.AbstractC0493a d(String str) {
            this.f47544c = str;
            return this;
        }

        @Override // o6.F.e.a.AbstractC0493a
        public F.e.a.AbstractC0493a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f47542a = str;
            return this;
        }

        @Override // o6.F.e.a.AbstractC0493a
        public F.e.a.AbstractC0493a f(String str) {
            this.f47545d = str;
            return this;
        }

        @Override // o6.F.e.a.AbstractC0493a
        public F.e.a.AbstractC0493a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f47543b = str;
            return this;
        }
    }

    @Override // o6.F.e.a
    public String b() {
        return this.f47540e;
    }

    @Override // o6.F.e.a
    public String c() {
        return this.f47541f;
    }

    @Override // o6.F.e.a
    public String d() {
        return this.f47538c;
    }

    @Override // o6.F.e.a
    public String e() {
        return this.f47536a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.a) {
            F.e.a aVar = (F.e.a) obj;
            if (this.f47536a.equals(aVar.e()) && this.f47537b.equals(aVar.h()) && ((str = this.f47538c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
                aVar.g();
                String str2 = this.f47539d;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f47540e;
                    if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                        String str4 = this.f47541f;
                        if (str4 != null ? str4.equals(aVar.c()) : aVar.c() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // o6.F.e.a
    public String f() {
        return this.f47539d;
    }

    @Override // o6.F.e.a
    public F.e.a.b g() {
        return null;
    }

    @Override // o6.F.e.a
    public String h() {
        return this.f47537b;
    }

    public int hashCode() {
        int iHashCode = (((this.f47536a.hashCode() ^ 1000003) * 1000003) ^ this.f47537b.hashCode()) * 1000003;
        String str = this.f47538c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f47539d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f47540e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f47541f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f47536a + ", version=" + this.f47537b + ", displayVersion=" + this.f47538c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f47539d + ", developmentPlatform=" + this.f47540e + ", developmentPlatformVersion=" + this.f47541f + "}";
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f47536a = str;
        this.f47537b = str2;
        this.f47538c = str3;
        this.f47539d = str4;
        this.f47540e = str5;
        this.f47541f = str6;
    }
}
