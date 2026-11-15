package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class k extends F.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f47552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f47553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f47554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f47556i;

    static final class b extends F.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f47560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f47561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f47562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f47563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f47564h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f47565i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f47566j;

        b() {
        }

        @Override // o6.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f47566j == 63 && (str = this.f47558b) != null && (str2 = this.f47564h) != null && (str3 = this.f47565i) != null) {
                return new k(this.f47557a, str, this.f47559c, this.f47560d, this.f47561e, this.f47562f, this.f47563g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f47566j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f47558b == null) {
                sb.append(" model");
            }
            if ((this.f47566j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f47566j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f47566j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f47566j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f47566j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f47564h == null) {
                sb.append(" manufacturer");
            }
            if (this.f47565i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.c.a
        public F.e.c.a b(int i10) {
            this.f47557a = i10;
            this.f47566j = (byte) (this.f47566j | 1);
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a c(int i10) {
            this.f47559c = i10;
            this.f47566j = (byte) (this.f47566j | 2);
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a d(long j10) {
            this.f47561e = j10;
            this.f47566j = (byte) (this.f47566j | 8);
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f47564h = str;
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f47558b = str;
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f47565i = str;
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a h(long j10) {
            this.f47560d = j10;
            this.f47566j = (byte) (this.f47566j | 4);
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a i(boolean z9) {
            this.f47562f = z9;
            this.f47566j = (byte) (this.f47566j | 16);
            return this;
        }

        @Override // o6.F.e.c.a
        public F.e.c.a j(int i10) {
            this.f47563g = i10;
            this.f47566j = (byte) (this.f47566j | 32);
            return this;
        }
    }

    @Override // o6.F.e.c
    public int b() {
        return this.f47548a;
    }

    @Override // o6.F.e.c
    public int c() {
        return this.f47550c;
    }

    @Override // o6.F.e.c
    public long d() {
        return this.f47552e;
    }

    @Override // o6.F.e.c
    public String e() {
        return this.f47555h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.c) {
            F.e.c cVar = (F.e.c) obj;
            if (this.f47548a == cVar.b() && this.f47549b.equals(cVar.f()) && this.f47550c == cVar.c() && this.f47551d == cVar.h() && this.f47552e == cVar.d() && this.f47553f == cVar.j() && this.f47554g == cVar.i() && this.f47555h.equals(cVar.e()) && this.f47556i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.F.e.c
    public String f() {
        return this.f47549b;
    }

    @Override // o6.F.e.c
    public String g() {
        return this.f47556i;
    }

    @Override // o6.F.e.c
    public long h() {
        return this.f47551d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f47548a ^ 1000003) * 1000003) ^ this.f47549b.hashCode()) * 1000003) ^ this.f47550c) * 1000003;
        long j10 = this.f47551d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47552e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f47553f ? 1231 : 1237)) * 1000003) ^ this.f47554g) * 1000003) ^ this.f47555h.hashCode()) * 1000003) ^ this.f47556i.hashCode();
    }

    @Override // o6.F.e.c
    public int i() {
        return this.f47554g;
    }

    @Override // o6.F.e.c
    public boolean j() {
        return this.f47553f;
    }

    public String toString() {
        return "Device{arch=" + this.f47548a + ", model=" + this.f47549b + ", cores=" + this.f47550c + ", ram=" + this.f47551d + ", diskSpace=" + this.f47552e + ", simulator=" + this.f47553f + ", state=" + this.f47554g + ", manufacturer=" + this.f47555h + ", modelClass=" + this.f47556i + "}";
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z9, int i12, String str2, String str3) {
        this.f47548a = i10;
        this.f47549b = str;
        this.f47550c = i11;
        this.f47551d = j10;
        this.f47552e = j11;
        this.f47553f = z9;
        this.f47554g = i12;
        this.f47555h = str2;
        this.f47556i = str3;
    }
}
