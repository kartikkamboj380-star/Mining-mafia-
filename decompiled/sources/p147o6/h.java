package p147o6;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class h extends F.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Long f47515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f47516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F.e.a f47517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F.e.f f47518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F.e.AbstractC0508e f47519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F.e.c f47520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f47521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f47522l;

    static final class b extends F.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f47526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f47527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f47528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private F.e.a f47529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private F.e.f f47530h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private F.e.AbstractC0508e f47531i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private F.e.c f47532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private List f47533k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f47534l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte f47535m;

        @Override // o6.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f47535m == 7 && (str = this.f47523a) != null && (str2 = this.f47524b) != null && (aVar = this.f47529g) != null) {
                return new h(str, str2, this.f47525c, this.f47526d, this.f47527e, this.f47528f, aVar, this.f47530h, this.f47531i, this.f47532j, this.f47533k, this.f47534l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47523a == null) {
                sb.append(" generator");
            }
            if (this.f47524b == null) {
                sb.append(" identifier");
            }
            if ((this.f47535m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f47535m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f47529g == null) {
                sb.append(" app");
            }
            if ((this.f47535m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f47529g = aVar;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b c(String str) {
            this.f47525c = str;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b d(boolean z9) {
            this.f47528f = z9;
            this.f47535m = (byte) (this.f47535m | 2);
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f47532j = cVar;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b f(Long l10) {
            this.f47527e = l10;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b g(List list) {
            this.f47533k = list;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f47523a = str;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b i(int i10) {
            this.f47534l = i10;
            this.f47535m = (byte) (this.f47535m | 4);
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f47524b = str;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b l(F.e.AbstractC0508e abstractC0508e) {
            this.f47531i = abstractC0508e;
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b m(long j10) {
            this.f47526d = j10;
            this.f47535m = (byte) (this.f47535m | 1);
            return this;
        }

        @Override // o6.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f47530h = fVar;
            return this;
        }

        b() {
        }

        private b(F.e eVar) {
            this.f47523a = eVar.g();
            this.f47524b = eVar.i();
            this.f47525c = eVar.c();
            this.f47526d = eVar.l();
            this.f47527e = eVar.e();
            this.f47528f = eVar.n();
            this.f47529g = eVar.b();
            this.f47530h = eVar.m();
            this.f47531i = eVar.k();
            this.f47532j = eVar.d();
            this.f47533k = eVar.f();
            this.f47534l = eVar.h();
            this.f47535m = (byte) 7;
        }
    }

    @Override // o6.F.e
    public F.e.a b() {
        return this.f47517g;
    }

    @Override // o6.F.e
    public String c() {
        return this.f47513c;
    }

    @Override // o6.F.e
    public F.e.c d() {
        return this.f47520j;
    }

    @Override // o6.F.e
    public Long e() {
        return this.f47515e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        F.e.f fVar;
        F.e.AbstractC0508e abstractC0508e;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e) {
            F.e eVar = (F.e) obj;
            if (this.f47511a.equals(eVar.g()) && this.f47512b.equals(eVar.i()) && ((str = this.f47513c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f47514d == eVar.l() && ((l10 = this.f47515e) != null ? l10.equals(eVar.e()) : eVar.e() == null) && this.f47516f == eVar.n() && this.f47517g.equals(eVar.b()) && ((fVar = this.f47518h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0508e = this.f47519i) != null ? abstractC0508e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f47520j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f47521k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f47522l == eVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.F.e
    public List f() {
        return this.f47521k;
    }

    @Override // o6.F.e
    public String g() {
        return this.f47511a;
    }

    @Override // o6.F.e
    public int h() {
        return this.f47522l;
    }

    public int hashCode() {
        int iHashCode = (((this.f47511a.hashCode() ^ 1000003) * 1000003) ^ this.f47512b.hashCode()) * 1000003;
        String str = this.f47513c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f47514d;
        int i10 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f47515e;
        int iHashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f47516f ? 1231 : 1237)) * 1000003) ^ this.f47517g.hashCode()) * 1000003;
        F.e.f fVar = this.f47518h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.AbstractC0508e abstractC0508e = this.f47519i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0508e == null ? 0 : abstractC0508e.hashCode())) * 1000003;
        F.e.c cVar = this.f47520j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f47521k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f47522l;
    }

    @Override // o6.F.e
    public String i() {
        return this.f47512b;
    }

    @Override // o6.F.e
    public F.e.AbstractC0508e k() {
        return this.f47519i;
    }

    @Override // o6.F.e
    public long l() {
        return this.f47514d;
    }

    @Override // o6.F.e
    public F.e.f m() {
        return this.f47518h;
    }

    @Override // o6.F.e
    public boolean n() {
        return this.f47516f;
    }

    @Override // o6.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f47511a + ", identifier=" + this.f47512b + ", appQualitySessionId=" + this.f47513c + ", startedAt=" + this.f47514d + ", endedAt=" + this.f47515e + ", crashed=" + this.f47516f + ", app=" + this.f47517g + ", user=" + this.f47518h + ", os=" + this.f47519i + ", device=" + this.f47520j + ", events=" + this.f47521k + ", generatorType=" + this.f47522l + "}";
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z9, F.e.a aVar, F.e.f fVar, F.e.AbstractC0508e abstractC0508e, F.e.c cVar, List list, int i10) {
        this.f47511a = str;
        this.f47512b = str2;
        this.f47513c = str3;
        this.f47514d = j10;
        this.f47515e = l10;
        this.f47516f = z9;
        this.f47517g = aVar;
        this.f47518h = fVar;
        this.f47519i = abstractC0508e;
        this.f47520j = cVar;
        this.f47521k = list;
        this.f47522l = i10;
    }
}
