package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class o extends F.e.d.a.b.AbstractC0495a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f47606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f47608d;

    static final class b extends F.e.d.a.b.AbstractC0495a.AbstractC0496a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f47609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f47610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47611c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f47612d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f47613e;

        b() {
        }

        @Override // o6.F.e.d.a.b.AbstractC0495a.AbstractC0496a
        public F.e.d.a.b.AbstractC0495a a() {
            String str;
            if (this.f47613e == 3 && (str = this.f47611c) != null) {
                return new o(this.f47609a, this.f47610b, str, this.f47612d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f47613e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f47613e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f47611c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.b.AbstractC0495a.AbstractC0496a
        public F.e.d.a.b.AbstractC0495a.AbstractC0496a b(long j10) {
            this.f47609a = j10;
            this.f47613e = (byte) (this.f47613e | 1);
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0495a.AbstractC0496a
        public F.e.d.a.b.AbstractC0495a.AbstractC0496a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f47611c = str;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0495a.AbstractC0496a
        public F.e.d.a.b.AbstractC0495a.AbstractC0496a d(long j10) {
            this.f47610b = j10;
            this.f47613e = (byte) (this.f47613e | 2);
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0495a.AbstractC0496a
        public F.e.d.a.b.AbstractC0495a.AbstractC0496a e(String str) {
            this.f47612d = str;
            return this;
        }
    }

    @Override // o6.F.e.d.a.b.AbstractC0495a
    public long b() {
        return this.f47605a;
    }

    @Override // o6.F.e.d.a.b.AbstractC0495a
    public String c() {
        return this.f47607c;
    }

    @Override // o6.F.e.d.a.b.AbstractC0495a
    public long d() {
        return this.f47606b;
    }

    @Override // o6.F.e.d.a.b.AbstractC0495a
    public String e() {
        return this.f47608d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0495a) {
            F.e.d.a.b.AbstractC0495a abstractC0495a = (F.e.d.a.b.AbstractC0495a) obj;
            if (this.f47605a == abstractC0495a.b() && this.f47606b == abstractC0495a.d() && this.f47607c.equals(abstractC0495a.c()) && ((str = this.f47608d) != null ? str.equals(abstractC0495a.e()) : abstractC0495a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f47605a;
        long j11 = this.f47606b;
        int iHashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f47607c.hashCode()) * 1000003;
        String str = this.f47608d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f47605a + ", size=" + this.f47606b + ", name=" + this.f47607c + ", uuid=" + this.f47608d + "}";
    }

    private o(long j10, long j11, String str, String str2) {
        this.f47605a = j10;
        this.f47606b = j11;
        this.f47607c = str;
        this.f47608d = str2;
    }
}
