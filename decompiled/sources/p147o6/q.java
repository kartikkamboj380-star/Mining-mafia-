package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class q extends F.e.d.a.b.AbstractC0499d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f47627c;

    static final class b extends F.e.d.a.b.AbstractC0499d.AbstractC0500a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f47630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte f47631d;

        b() {
        }

        @Override // o6.F.e.d.a.b.AbstractC0499d.AbstractC0500a
        public F.e.d.a.b.AbstractC0499d a() {
            String str;
            String str2;
            if (this.f47631d == 1 && (str = this.f47628a) != null && (str2 = this.f47629b) != null) {
                return new q(str, str2, this.f47630c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47628a == null) {
                sb.append(" name");
            }
            if (this.f47629b == null) {
                sb.append(" code");
            }
            if ((1 & this.f47631d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.b.AbstractC0499d.AbstractC0500a
        public F.e.d.a.b.AbstractC0499d.AbstractC0500a b(long j10) {
            this.f47630c = j10;
            this.f47631d = (byte) (this.f47631d | 1);
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0499d.AbstractC0500a
        public F.e.d.a.b.AbstractC0499d.AbstractC0500a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f47629b = str;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0499d.AbstractC0500a
        public F.e.d.a.b.AbstractC0499d.AbstractC0500a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f47628a = str;
            return this;
        }
    }

    @Override // o6.F.e.d.a.b.AbstractC0499d
    public long b() {
        return this.f47627c;
    }

    @Override // o6.F.e.d.a.b.AbstractC0499d
    public String c() {
        return this.f47626b;
    }

    @Override // o6.F.e.d.a.b.AbstractC0499d
    public String d() {
        return this.f47625a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0499d) {
            F.e.d.a.b.AbstractC0499d abstractC0499d = (F.e.d.a.b.AbstractC0499d) obj;
            if (this.f47625a.equals(abstractC0499d.d()) && this.f47626b.equals(abstractC0499d.c()) && this.f47627c == abstractC0499d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f47625a.hashCode() ^ 1000003) * 1000003) ^ this.f47626b.hashCode()) * 1000003;
        long j10 = this.f47627c;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f47625a + ", code=" + this.f47626b + ", address=" + this.f47627c + "}";
    }

    private q(String str, String str2, long j10) {
        this.f47625a = str;
        this.f47626b = str2;
        this.f47627c = j10;
    }
}
