package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class u extends F.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Double f47659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f47661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f47663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f47664f;

    static final class b extends F.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Double f47665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f47667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f47669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f47670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f47671g;

        b() {
        }

        @Override // o6.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f47671g == 31) {
                return new u(this.f47665a, this.f47666b, this.f47667c, this.f47668d, this.f47669e, this.f47670f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f47671g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f47671g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f47671g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f47671g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f47671g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.c.a
        public F.e.d.c.a b(Double d10) {
            this.f47665a = d10;
            return this;
        }

        @Override // o6.F.e.d.c.a
        public F.e.d.c.a c(int i10) {
            this.f47666b = i10;
            this.f47671g = (byte) (this.f47671g | 1);
            return this;
        }

        @Override // o6.F.e.d.c.a
        public F.e.d.c.a d(long j10) {
            this.f47670f = j10;
            this.f47671g = (byte) (this.f47671g | 16);
            return this;
        }

        @Override // o6.F.e.d.c.a
        public F.e.d.c.a e(int i10) {
            this.f47668d = i10;
            this.f47671g = (byte) (this.f47671g | 4);
            return this;
        }

        @Override // o6.F.e.d.c.a
        public F.e.d.c.a f(boolean z9) {
            this.f47667c = z9;
            this.f47671g = (byte) (this.f47671g | 2);
            return this;
        }

        @Override // o6.F.e.d.c.a
        public F.e.d.c.a g(long j10) {
            this.f47669e = j10;
            this.f47671g = (byte) (this.f47671g | 8);
            return this;
        }
    }

    @Override // o6.F.e.d.c
    public Double b() {
        return this.f47659a;
    }

    @Override // o6.F.e.d.c
    public int c() {
        return this.f47660b;
    }

    @Override // o6.F.e.d.c
    public long d() {
        return this.f47664f;
    }

    @Override // o6.F.e.d.c
    public int e() {
        return this.f47662d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.c) {
            F.e.d.c cVar = (F.e.d.c) obj;
            Double d10 = this.f47659a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f47660b == cVar.c() && this.f47661c == cVar.g() && this.f47662d == cVar.e() && this.f47663e == cVar.f() && this.f47664f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o6.F.e.d.c
    public long f() {
        return this.f47663e;
    }

    @Override // o6.F.e.d.c
    public boolean g() {
        return this.f47661c;
    }

    public int hashCode() {
        Double d10 = this.f47659a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f47660b) * 1000003) ^ (this.f47661c ? 1231 : 1237)) * 1000003) ^ this.f47662d) * 1000003;
        long j10 = this.f47663e;
        long j11 = this.f47664f;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f47659a + ", batteryVelocity=" + this.f47660b + ", proximityOn=" + this.f47661c + ", orientation=" + this.f47662d + ", ramUsed=" + this.f47663e + ", diskUsed=" + this.f47664f + "}";
    }

    private u(Double d10, int i10, boolean z9, int i11, long j10, long j11) {
        this.f47659a = d10;
        this.f47660b = i10;
        this.f47661c = z9;
        this.f47662d = i11;
        this.f47663e = j10;
        this.f47664f = j11;
    }
}
