package p135n4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f46769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f46770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f46772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f46773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f46774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f46775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final q f46776i;

    static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f46777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f46778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f46779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f46780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte[] f46781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f46782f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Long f46783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private w f46784h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private q f46785i;

        b() {
        }

        @Override // n4.t.a
        public t a() {
            String str = "";
            if (this.f46777a == null) {
                str = " eventTimeMs";
            }
            if (this.f46780d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f46783g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f46777a.longValue(), this.f46778b, this.f46779c, this.f46780d.longValue(), this.f46781e, this.f46782f, this.f46783g.longValue(), this.f46784h, this.f46785i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n4.t.a
        public t.a b(p pVar) {
            this.f46779c = pVar;
            return this;
        }

        @Override // n4.t.a
        public t.a c(Integer num) {
            this.f46778b = num;
            return this;
        }

        @Override // n4.t.a
        public t.a d(long j10) {
            this.f46777a = Long.valueOf(j10);
            return this;
        }

        @Override // n4.t.a
        public t.a e(long j10) {
            this.f46780d = Long.valueOf(j10);
            return this;
        }

        @Override // n4.t.a
        public t.a f(q qVar) {
            this.f46785i = qVar;
            return this;
        }

        @Override // n4.t.a
        public t.a g(w wVar) {
            this.f46784h = wVar;
            return this;
        }

        @Override // n4.t.a
        t.a h(byte[] bArr) {
            this.f46781e = bArr;
            return this;
        }

        @Override // n4.t.a
        t.a i(String str) {
            this.f46782f = str;
            return this;
        }

        @Override // n4.t.a
        public t.a j(long j10) {
            this.f46783g = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p135n4.t
    public p b() {
        return this.f46770c;
    }

    @Override // p135n4.t
    public Integer c() {
        return this.f46769b;
    }

    @Override // p135n4.t
    public long d() {
        return this.f46768a;
    }

    @Override // p135n4.t
    public long e() {
        return this.f46771d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f46768a == tVar.d() && ((num = this.f46769b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f46770c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f46771d == tVar.e()) {
                if (Arrays.equals(this.f46772e, tVar instanceof j ? ((j) tVar).f46772e : tVar.h()) && ((str = this.f46773f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f46774g == tVar.j() && ((wVar = this.f46775h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f46776i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p135n4.t
    public q f() {
        return this.f46776i;
    }

    @Override // p135n4.t
    public w g() {
        return this.f46775h;
    }

    @Override // p135n4.t
    public byte[] h() {
        return this.f46772e;
    }

    public int hashCode() {
        long j10 = this.f46768a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f46769b;
        int iHashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f46770c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f46771d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f46772e)) * 1000003;
        String str = this.f46773f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f46774g;
        int i11 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        w wVar = this.f46775h;
        int iHashCode5 = (i11 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f46776i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // p135n4.t
    public String i() {
        return this.f46773f;
    }

    @Override // p135n4.t
    public long j() {
        return this.f46774g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f46768a + ", eventCode=" + this.f46769b + ", complianceData=" + this.f46770c + ", eventUptimeMs=" + this.f46771d + ", sourceExtension=" + Arrays.toString(this.f46772e) + ", sourceExtensionJsonProto3=" + this.f46773f + ", timezoneOffsetSeconds=" + this.f46774g + ", networkConnectionInfo=" + this.f46775h + ", experimentIds=" + this.f46776i + "}";
    }

    private j(long j10, Integer num, p pVar, long j11, byte[] bArr, String str, long j12, w wVar, q qVar) {
        this.f46768a = j10;
        this.f46769b = num;
        this.f46770c = pVar;
        this.f46771d = j11;
        this.f46772e = bArr;
        this.f46773f = str;
        this.f46774g = j12;
        this.f46775h = wVar;
        this.f46776i = qVar;
    }
}
