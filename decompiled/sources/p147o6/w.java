package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class w extends F.e.d.AbstractC0507e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F.e.d.AbstractC0507e.b f47674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47677d;

    static final class b extends F.e.d.AbstractC0507e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private F.e.d.AbstractC0507e.b f47678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f47681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f47682e;

        b() {
        }

        @Override // o6.F.e.d.AbstractC0507e.a
        public F.e.d.AbstractC0507e a() {
            F.e.d.AbstractC0507e.b bVar;
            String str;
            String str2;
            if (this.f47682e == 1 && (bVar = this.f47678a) != null && (str = this.f47679b) != null && (str2 = this.f47680c) != null) {
                return new w(bVar, str, str2, this.f47681d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47678a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f47679b == null) {
                sb.append(" parameterKey");
            }
            if (this.f47680c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f47682e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.AbstractC0507e.a
        public F.e.d.AbstractC0507e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f47679b = str;
            return this;
        }

        @Override // o6.F.e.d.AbstractC0507e.a
        public F.e.d.AbstractC0507e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f47680c = str;
            return this;
        }

        @Override // o6.F.e.d.AbstractC0507e.a
        public F.e.d.AbstractC0507e.a d(F.e.d.AbstractC0507e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f47678a = bVar;
            return this;
        }

        @Override // o6.F.e.d.AbstractC0507e.a
        public F.e.d.AbstractC0507e.a e(long j10) {
            this.f47681d = j10;
            this.f47682e = (byte) (this.f47682e | 1);
            return this;
        }
    }

    @Override // o6.F.e.d.AbstractC0507e
    public String b() {
        return this.f47675b;
    }

    @Override // o6.F.e.d.AbstractC0507e
    public String c() {
        return this.f47676c;
    }

    @Override // o6.F.e.d.AbstractC0507e
    public F.e.d.AbstractC0507e.b d() {
        return this.f47674a;
    }

    @Override // o6.F.e.d.AbstractC0507e
    public long e() {
        return this.f47677d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0507e) {
            F.e.d.AbstractC0507e abstractC0507e = (F.e.d.AbstractC0507e) obj;
            if (this.f47674a.equals(abstractC0507e.d()) && this.f47675b.equals(abstractC0507e.b()) && this.f47676c.equals(abstractC0507e.c()) && this.f47677d == abstractC0507e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f47674a.hashCode() ^ 1000003) * 1000003) ^ this.f47675b.hashCode()) * 1000003) ^ this.f47676c.hashCode()) * 1000003;
        long j10 = this.f47677d;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f47674a + ", parameterKey=" + this.f47675b + ", parameterValue=" + this.f47676c + ", templateVersion=" + this.f47677d + "}";
    }

    private w(F.e.d.AbstractC0507e.b bVar, String str, String str2, long j10) {
        this.f47674a = bVar;
        this.f47675b = str;
        this.f47676c = str2;
        this.f47677d = j10;
    }
}
