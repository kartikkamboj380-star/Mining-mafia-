package p038d7;

/* JADX INFO: loaded from: classes3.dex */
final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f43167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f43168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f43169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f43170f;

    /* JADX INFO: renamed from: d7.b$b, reason: collision with other inner class name */
    static final class C0413b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f43172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f43173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f43174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f43175e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f43176f;

        C0413b() {
        }

        @Override // d7.d.a
        public d a() {
            if (this.f43176f == 1 && this.f43171a != null && this.f43172b != null && this.f43173c != null && this.f43174d != null) {
                return new b(this.f43171a, this.f43172b, this.f43173c, this.f43174d, this.f43175e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f43171a == null) {
                sb.append(" rolloutId");
            }
            if (this.f43172b == null) {
                sb.append(" variantId");
            }
            if (this.f43173c == null) {
                sb.append(" parameterKey");
            }
            if (this.f43174d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f43176f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // d7.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f43173c = str;
            return this;
        }

        @Override // d7.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f43174d = str;
            return this;
        }

        @Override // d7.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f43171a = str;
            return this;
        }

        @Override // d7.d.a
        public d.a e(long j10) {
            this.f43175e = j10;
            this.f43176f = (byte) (this.f43176f | 1);
            return this;
        }

        @Override // d7.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f43172b = str;
            return this;
        }
    }

    @Override // p038d7.d
    public String b() {
        return this.f43168d;
    }

    @Override // p038d7.d
    public String c() {
        return this.f43169e;
    }

    @Override // p038d7.d
    public String d() {
        return this.f43166b;
    }

    @Override // p038d7.d
    public long e() {
        return this.f43170f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f43166b.equals(dVar.d()) && this.f43167c.equals(dVar.f()) && this.f43168d.equals(dVar.b()) && this.f43169e.equals(dVar.c()) && this.f43170f == dVar.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p038d7.d
    public String f() {
        return this.f43167c;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f43166b.hashCode() ^ 1000003) * 1000003) ^ this.f43167c.hashCode()) * 1000003) ^ this.f43168d.hashCode()) * 1000003) ^ this.f43169e.hashCode()) * 1000003;
        long j10 = this.f43170f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f43166b + ", variantId=" + this.f43167c + ", parameterKey=" + this.f43168d + ", parameterValue=" + this.f43169e + ", templateVersion=" + this.f43170f + "}";
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f43166b = str;
        this.f43167c = str2;
        this.f43168d = str3;
        this.f43169e = str4;
        this.f43170f = j10;
    }
}
