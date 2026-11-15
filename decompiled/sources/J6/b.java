package J6;

/* JADX INFO: loaded from: classes3.dex */
final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f2346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.b f2347c;

    /* JADX INFO: renamed from: J6.b$b, reason: collision with other inner class name */
    static final class C0034b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f2348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f2349b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f.b f2350c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f2351d;

        C0034b() {
        }

        @Override // J6.f.a
        public f a() {
            if (this.f2351d == 1) {
                return new b(this.f2348a, this.f2349b, this.f2350c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // J6.f.a
        public f.a b(f.b bVar) {
            this.f2350c = bVar;
            return this;
        }

        @Override // J6.f.a
        public f.a c(String str) {
            this.f2348a = str;
            return this;
        }

        @Override // J6.f.a
        public f.a d(long j10) {
            this.f2349b = j10;
            this.f2351d = (byte) (this.f2351d | 1);
            return this;
        }
    }

    @Override // J6.f
    public f.b b() {
        return this.f2347c;
    }

    @Override // J6.f
    public String c() {
        return this.f2345a;
    }

    @Override // J6.f
    public long d() {
        return this.f2346b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f2345a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f2346b == fVar.d() && ((bVar = this.f2347c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f2345a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f2346b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f2347c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f2345a + ", tokenExpirationTimestamp=" + this.f2346b + ", responseCode=" + this.f2347c + "}";
    }

    private b(String str, long j10, f.b bVar) {
        this.f2345a = str;
        this.f2346b = j10;
        this.f2347c = bVar;
    }
}
