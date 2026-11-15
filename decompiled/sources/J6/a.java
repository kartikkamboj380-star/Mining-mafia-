package J6;

/* JADX INFO: loaded from: classes3.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f2338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d.b f2339e;

    static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f2340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f2341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f2342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private f f2343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.b f2344e;

        b() {
        }

        @Override // J6.d.a
        public d a() {
            return new a(this.f2340a, this.f2341b, this.f2342c, this.f2343d, this.f2344e);
        }

        @Override // J6.d.a
        public d.a b(f fVar) {
            this.f2343d = fVar;
            return this;
        }

        @Override // J6.d.a
        public d.a c(String str) {
            this.f2341b = str;
            return this;
        }

        @Override // J6.d.a
        public d.a d(String str) {
            this.f2342c = str;
            return this;
        }

        @Override // J6.d.a
        public d.a e(d.b bVar) {
            this.f2344e = bVar;
            return this;
        }

        @Override // J6.d.a
        public d.a f(String str) {
            this.f2340a = str;
            return this;
        }
    }

    @Override // J6.d
    public f b() {
        return this.f2338d;
    }

    @Override // J6.d
    public String c() {
        return this.f2336b;
    }

    @Override // J6.d
    public String d() {
        return this.f2337c;
    }

    @Override // J6.d
    public d.b e() {
        return this.f2339e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f2335a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f2336b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f2337c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f2338d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f2339e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // J6.d
    public String f() {
        return this.f2335a;
    }

    public int hashCode() {
        String str = this.f2335a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f2336b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2337c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f2338d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f2339e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f2335a + ", fid=" + this.f2336b + ", refreshToken=" + this.f2337c + ", authToken=" + this.f2338d + ", responseCode=" + this.f2339e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f2335a = str;
        this.f2336b = str2;
        this.f2337c = str3;
        this.f2338d = fVar;
        this.f2339e = bVar;
    }
}
