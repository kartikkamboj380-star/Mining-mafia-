package p147o6;

/* JADX INFO: renamed from: o6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7078b extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f47452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f47453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f47454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f47456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f47457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final F.e f47458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final F.d f47459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final F.a f47460m;

    /* JADX INFO: renamed from: o6.b$b, reason: collision with other inner class name */
    static final class C0510b extends F.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f47464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f47465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f47466f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f47467g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f47468h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f47469i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private F.e f47470j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private F.d f47471k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private F.a f47472l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f47473m;

        @Override // o6.F.b
        public F a() {
            if (this.f47473m == 1 && this.f47461a != null && this.f47462b != null && this.f47464d != null && this.f47468h != null && this.f47469i != null) {
                return new C7078b(this.f47461a, this.f47462b, this.f47463c, this.f47464d, this.f47465e, this.f47466f, this.f47467g, this.f47468h, this.f47469i, this.f47470j, this.f47471k, this.f47472l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47461a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f47462b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f47473m) == 0) {
                sb.append(" platform");
            }
            if (this.f47464d == null) {
                sb.append(" installationUuid");
            }
            if (this.f47468h == null) {
                sb.append(" buildVersion");
            }
            if (this.f47469i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.b
        public F.b b(F.a aVar) {
            this.f47472l = aVar;
            return this;
        }

        @Override // o6.F.b
        public F.b c(String str) {
            this.f47467g = str;
            return this;
        }

        @Override // o6.F.b
        public F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f47468h = str;
            return this;
        }

        @Override // o6.F.b
        public F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f47469i = str;
            return this;
        }

        @Override // o6.F.b
        public F.b f(String str) {
            this.f47466f = str;
            return this;
        }

        @Override // o6.F.b
        public F.b g(String str) {
            this.f47465e = str;
            return this;
        }

        @Override // o6.F.b
        public F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f47462b = str;
            return this;
        }

        @Override // o6.F.b
        public F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f47464d = str;
            return this;
        }

        @Override // o6.F.b
        public F.b j(F.d dVar) {
            this.f47471k = dVar;
            return this;
        }

        @Override // o6.F.b
        public F.b k(int i10) {
            this.f47463c = i10;
            this.f47473m = (byte) (this.f47473m | 1);
            return this;
        }

        @Override // o6.F.b
        public F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f47461a = str;
            return this;
        }

        @Override // o6.F.b
        public F.b m(F.e eVar) {
            this.f47470j = eVar;
            return this;
        }

        C0510b() {
        }

        private C0510b(F f10) {
            this.f47461a = f10.m();
            this.f47462b = f10.i();
            this.f47463c = f10.l();
            this.f47464d = f10.j();
            this.f47465e = f10.h();
            this.f47466f = f10.g();
            this.f47467g = f10.d();
            this.f47468h = f10.e();
            this.f47469i = f10.f();
            this.f47470j = f10.n();
            this.f47471k = f10.k();
            this.f47472l = f10.c();
            this.f47473m = (byte) 1;
        }
    }

    @Override // p147o6.F
    public F.a c() {
        return this.f47460m;
    }

    @Override // p147o6.F
    public String d() {
        return this.f47455h;
    }

    @Override // p147o6.F
    public String e() {
        return this.f47456i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        F.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f10 = (F) obj;
            if (this.f47449b.equals(f10.m()) && this.f47450c.equals(f10.i()) && this.f47451d == f10.l() && this.f47452e.equals(f10.j()) && ((str = this.f47453f) != null ? str.equals(f10.h()) : f10.h() == null) && ((str2 = this.f47454g) != null ? str2.equals(f10.g()) : f10.g() == null) && ((str3 = this.f47455h) != null ? str3.equals(f10.d()) : f10.d() == null) && this.f47456i.equals(f10.e()) && this.f47457j.equals(f10.f()) && ((eVar = this.f47458k) != null ? eVar.equals(f10.n()) : f10.n() == null) && ((dVar = this.f47459l) != null ? dVar.equals(f10.k()) : f10.k() == null) && ((aVar = this.f47460m) != null ? aVar.equals(f10.c()) : f10.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p147o6.F
    public String f() {
        return this.f47457j;
    }

    @Override // p147o6.F
    public String g() {
        return this.f47454g;
    }

    @Override // p147o6.F
    public String h() {
        return this.f47453f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f47449b.hashCode() ^ 1000003) * 1000003) ^ this.f47450c.hashCode()) * 1000003) ^ this.f47451d) * 1000003) ^ this.f47452e.hashCode()) * 1000003;
        String str = this.f47453f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f47454g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f47455h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f47456i.hashCode()) * 1000003) ^ this.f47457j.hashCode()) * 1000003;
        F.e eVar = this.f47458k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.f47459l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.f47460m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // p147o6.F
    public String i() {
        return this.f47450c;
    }

    @Override // p147o6.F
    public String j() {
        return this.f47452e;
    }

    @Override // p147o6.F
    public F.d k() {
        return this.f47459l;
    }

    @Override // p147o6.F
    public int l() {
        return this.f47451d;
    }

    @Override // p147o6.F
    public String m() {
        return this.f47449b;
    }

    @Override // p147o6.F
    public F.e n() {
        return this.f47458k;
    }

    @Override // p147o6.F
    protected F.b o() {
        return new C0510b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f47449b + ", gmpAppId=" + this.f47450c + ", platform=" + this.f47451d + ", installationUuid=" + this.f47452e + ", firebaseInstallationId=" + this.f47453f + ", firebaseAuthenticationToken=" + this.f47454g + ", appQualitySessionId=" + this.f47455h + ", buildVersion=" + this.f47456i + ", displayVersion=" + this.f47457j + ", session=" + this.f47458k + ", ndkPayload=" + this.f47459l + ", appExitInfo=" + this.f47460m + "}";
    }

    private C7078b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f47449b = str;
        this.f47450c = str2;
        this.f47451d = i10;
        this.f47452e = str3;
        this.f47453f = str4;
        this.f47454g = str5;
        this.f47455h = str6;
        this.f47456i = str7;
        this.f47457j = str8;
        this.f47458k = eVar;
        this.f47459l = dVar;
        this.f47460m = aVar;
    }
}
