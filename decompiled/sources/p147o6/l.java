package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class l extends F.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f47567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F.e.d.a f47569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F.e.d.c f47570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final F.e.d.AbstractC0506d f47571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final F.e.d.f f47572f;

    static final class b extends F.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f47573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private F.e.d.a f47575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private F.e.d.c f47576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private F.e.d.AbstractC0506d f47577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private F.e.d.f f47578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private byte f47579g;

        @Override // o6.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f47579g == 1 && (str = this.f47574b) != null && (aVar = this.f47575c) != null && (cVar = this.f47576d) != null) {
                return new l(this.f47573a, str, aVar, cVar, this.f47577e, this.f47578f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f47579g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f47574b == null) {
                sb.append(" type");
            }
            if (this.f47575c == null) {
                sb.append(" app");
            }
            if (this.f47576d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f47575c = aVar;
            return this;
        }

        @Override // o6.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f47576d = cVar;
            return this;
        }

        @Override // o6.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0506d abstractC0506d) {
            this.f47577e = abstractC0506d;
            return this;
        }

        @Override // o6.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f47578f = fVar;
            return this;
        }

        @Override // o6.F.e.d.b
        public F.e.d.b f(long j10) {
            this.f47573a = j10;
            this.f47579g = (byte) (this.f47579g | 1);
            return this;
        }

        @Override // o6.F.e.d.b
        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f47574b = str;
            return this;
        }

        b() {
        }

        private b(F.e.d dVar) {
            this.f47573a = dVar.f();
            this.f47574b = dVar.g();
            this.f47575c = dVar.b();
            this.f47576d = dVar.c();
            this.f47577e = dVar.d();
            this.f47578f = dVar.e();
            this.f47579g = (byte) 1;
        }
    }

    @Override // o6.F.e.d
    public F.e.d.a b() {
        return this.f47569c;
    }

    @Override // o6.F.e.d
    public F.e.d.c c() {
        return this.f47570d;
    }

    @Override // o6.F.e.d
    public F.e.d.AbstractC0506d d() {
        return this.f47571e;
    }

    @Override // o6.F.e.d
    public F.e.d.f e() {
        return this.f47572f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0506d abstractC0506d;
        F.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d) {
            F.e.d dVar = (F.e.d) obj;
            if (this.f47567a == dVar.f() && this.f47568b.equals(dVar.g()) && this.f47569c.equals(dVar.b()) && this.f47570d.equals(dVar.c()) && ((abstractC0506d = this.f47571e) != null ? abstractC0506d.equals(dVar.d()) : dVar.d() == null) && ((fVar = this.f47572f) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.F.e.d
    public long f() {
        return this.f47567a;
    }

    @Override // o6.F.e.d
    public String g() {
        return this.f47568b;
    }

    @Override // o6.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f47567a;
        int iHashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f47568b.hashCode()) * 1000003) ^ this.f47569c.hashCode()) * 1000003) ^ this.f47570d.hashCode()) * 1000003;
        F.e.d.AbstractC0506d abstractC0506d = this.f47571e;
        int iHashCode2 = (iHashCode ^ (abstractC0506d == null ? 0 : abstractC0506d.hashCode())) * 1000003;
        F.e.d.f fVar = this.f47572f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f47567a + ", type=" + this.f47568b + ", app=" + this.f47569c + ", device=" + this.f47570d + ", log=" + this.f47571e + ", rollouts=" + this.f47572f + "}";
    }

    private l(long j10, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0506d abstractC0506d, F.e.d.f fVar) {
        this.f47567a = j10;
        this.f47568b = str;
        this.f47569c = aVar;
        this.f47570d = cVar;
        this.f47571e = abstractC0506d;
        this.f47572f = fVar;
    }
}
