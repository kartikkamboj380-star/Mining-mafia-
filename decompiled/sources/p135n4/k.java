package p135n4;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f46786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f46788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f46789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f46791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x f46792g;

    static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f46793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f46794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private o f46795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f46796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f46797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f46798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private x f46799g;

        b() {
        }

        @Override // n4.u.a
        public u a() {
            String str = "";
            if (this.f46793a == null) {
                str = " requestTimeMs";
            }
            if (this.f46794b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f46793a.longValue(), this.f46794b.longValue(), this.f46795c, this.f46796d, this.f46797e, this.f46798f, this.f46799g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n4.u.a
        public u.a b(o oVar) {
            this.f46795c = oVar;
            return this;
        }

        @Override // n4.u.a
        public u.a c(List list) {
            this.f46798f = list;
            return this;
        }

        @Override // n4.u.a
        u.a d(Integer num) {
            this.f46796d = num;
            return this;
        }

        @Override // n4.u.a
        u.a e(String str) {
            this.f46797e = str;
            return this;
        }

        @Override // n4.u.a
        public u.a f(x xVar) {
            this.f46799g = xVar;
            return this;
        }

        @Override // n4.u.a
        public u.a g(long j10) {
            this.f46793a = Long.valueOf(j10);
            return this;
        }

        @Override // n4.u.a
        public u.a h(long j10) {
            this.f46794b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p135n4.u
    public o b() {
        return this.f46788c;
    }

    @Override // p135n4.u
    public List c() {
        return this.f46791f;
    }

    @Override // p135n4.u
    public Integer d() {
        return this.f46789d;
    }

    @Override // p135n4.u
    public String e() {
        return this.f46790e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f46786a == uVar.g() && this.f46787b == uVar.h() && ((oVar = this.f46788c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f46789d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f46790e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f46791f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.f46792g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // p135n4.u
    public x f() {
        return this.f46792g;
    }

    @Override // p135n4.u
    public long g() {
        return this.f46786a;
    }

    @Override // p135n4.u
    public long h() {
        return this.f46787b;
    }

    public int hashCode() {
        long j10 = this.f46786a;
        long j11 = this.f46787b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f46788c;
        int iHashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f46789d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f46790e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f46791f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f46792g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f46786a + ", requestUptimeMs=" + this.f46787b + ", clientInfo=" + this.f46788c + ", logSource=" + this.f46789d + ", logSourceName=" + this.f46790e + ", logEvents=" + this.f46791f + ", qosTier=" + this.f46792g + "}";
    }

    private k(long j10, long j11, o oVar, Integer num, String str, List list, x xVar) {
        this.f46786a = j10;
        this.f46787b = j11;
        this.f46788c = oVar;
        this.f46789d = num;
        this.f46790e = str;
        this.f46791f = list;
        this.f46792g = xVar;
    }
}
