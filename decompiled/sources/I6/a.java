package I6;

/* JADX INFO: loaded from: classes3.dex */
final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a f1667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f1668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f1669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f1670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f1671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f1672h;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c.a f1674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f1675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f1676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f1677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f1678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f1679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private byte f1680h;

        @Override // I6.d.a
        public d a() {
            if (this.f1680h == 3 && this.f1674b != null) {
                return new a(this.f1673a, this.f1674b, this.f1675c, this.f1676d, this.f1677e, this.f1678f, this.f1679g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1674b == null) {
                sb.append(" registrationStatus");
            }
            if ((this.f1680h & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((this.f1680h & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // I6.d.a
        public d.a b(String str) {
            this.f1675c = str;
            return this;
        }

        @Override // I6.d.a
        public d.a c(long j10) {
            this.f1677e = j10;
            this.f1680h = (byte) (this.f1680h | 1);
            return this;
        }

        @Override // I6.d.a
        public d.a d(String str) {
            this.f1673a = str;
            return this;
        }

        @Override // I6.d.a
        public d.a e(String str) {
            this.f1679g = str;
            return this;
        }

        @Override // I6.d.a
        public d.a f(String str) {
            this.f1676d = str;
            return this;
        }

        @Override // I6.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f1674b = aVar;
            return this;
        }

        @Override // I6.d.a
        public d.a h(long j10) {
            this.f1678f = j10;
            this.f1680h = (byte) (this.f1680h | 2);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f1673a = dVar.d();
            this.f1674b = dVar.g();
            this.f1675c = dVar.b();
            this.f1676d = dVar.f();
            this.f1677e = dVar.c();
            this.f1678f = dVar.h();
            this.f1679g = dVar.e();
            this.f1680h = (byte) 3;
        }
    }

    @Override // I6.d
    public String b() {
        return this.f1668d;
    }

    @Override // I6.d
    public long c() {
        return this.f1670f;
    }

    @Override // I6.d
    public String d() {
        return this.f1666b;
    }

    @Override // I6.d
    public String e() {
        return this.f1672h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f1666b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f1667c.equals(dVar.g()) && ((str = this.f1668d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f1669e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f1670f == dVar.c() && this.f1671g == dVar.h() && ((str3 = this.f1672h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // I6.d
    public String f() {
        return this.f1669e;
    }

    @Override // I6.d
    public c.a g() {
        return this.f1667c;
    }

    @Override // I6.d
    public long h() {
        return this.f1671g;
    }

    public int hashCode() {
        String str = this.f1666b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f1667c.hashCode()) * 1000003;
        String str2 = this.f1668d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1669e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f1670f;
        int i10 = (iHashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f1671g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f1672h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // I6.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f1666b + ", registrationStatus=" + this.f1667c + ", authToken=" + this.f1668d + ", refreshToken=" + this.f1669e + ", expiresInSecs=" + this.f1670f + ", tokenCreationEpochInSecs=" + this.f1671g + ", fisError=" + this.f1672h + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f1666b = str;
        this.f1667c = aVar;
        this.f1668d = str2;
        this.f1669e = str3;
        this.f1670f = j10;
        this.f1671g = j11;
        this.f1672h = str4;
    }
}
