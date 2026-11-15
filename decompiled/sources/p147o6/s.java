package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class s extends F.e.d.a.b.AbstractC0501e.AbstractC0503b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f47643e;

    static final class b extends F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f47644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f47647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f47648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private byte f47649f;

        b() {
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a
        public F.e.d.a.b.AbstractC0501e.AbstractC0503b a() {
            String str;
            if (this.f47649f == 7 && (str = this.f47645b) != null) {
                return new s(this.f47644a, str, this.f47646c, this.f47647d, this.f47648e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f47649f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f47645b == null) {
                sb.append(" symbol");
            }
            if ((this.f47649f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f47649f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a
        public F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a b(String str) {
            this.f47646c = str;
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a
        public F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a c(int i10) {
            this.f47648e = i10;
            this.f47649f = (byte) (this.f47649f | 4);
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a
        public F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a d(long j10) {
            this.f47647d = j10;
            this.f47649f = (byte) (this.f47649f | 2);
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a
        public F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a e(long j10) {
            this.f47644a = j10;
            this.f47649f = (byte) (this.f47649f | 1);
            return this;
        }

        @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a
        public F.e.d.a.b.AbstractC0501e.AbstractC0503b.AbstractC0504a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f47645b = str;
            return this;
        }
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b
    public String b() {
        return this.f47641c;
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b
    public int c() {
        return this.f47643e;
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b
    public long d() {
        return this.f47642d;
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b
    public long e() {
        return this.f47639a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0501e.AbstractC0503b) {
            F.e.d.a.b.AbstractC0501e.AbstractC0503b abstractC0503b = (F.e.d.a.b.AbstractC0501e.AbstractC0503b) obj;
            if (this.f47639a == abstractC0503b.e() && this.f47640b.equals(abstractC0503b.f()) && ((str = this.f47641c) != null ? str.equals(abstractC0503b.b()) : abstractC0503b.b() == null) && this.f47642d == abstractC0503b.d() && this.f47643e == abstractC0503b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.F.e.d.a.b.AbstractC0501e.AbstractC0503b
    public String f() {
        return this.f47640b;
    }

    public int hashCode() {
        long j10 = this.f47639a;
        int iHashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f47640b.hashCode()) * 1000003;
        String str = this.f47641c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f47642d;
        return ((iHashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f47643e;
    }

    public String toString() {
        return "Frame{pc=" + this.f47639a + ", symbol=" + this.f47640b + ", file=" + this.f47641c + ", offset=" + this.f47642d + ", importance=" + this.f47643e + "}";
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f47639a = j10;
        this.f47640b = str;
        this.f47641c = str2;
        this.f47642d = j11;
        this.f47643e = i10;
    }
}
