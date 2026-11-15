package p147o6;

import java.util.List;

/* JADX INFO: renamed from: o6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C7079c extends F.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f47477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f47478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f47479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f47480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f47482i;

    /* JADX INFO: renamed from: o6.c$b */
    static final class b extends F.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f47486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f47487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f47488f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f47489g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f47490h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private List f47491i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte f47492j;

        b() {
        }

        @Override // o6.F.a.b
        public F.a a() {
            String str;
            if (this.f47492j == 63 && (str = this.f47484b) != null) {
                return new C7079c(this.f47483a, str, this.f47485c, this.f47486d, this.f47487e, this.f47488f, this.f47489g, this.f47490h, this.f47491i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f47492j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f47484b == null) {
                sb.append(" processName");
            }
            if ((this.f47492j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f47492j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f47492j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f47492j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f47492j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.a.b
        public F.a.b b(List list) {
            this.f47491i = list;
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b c(int i10) {
            this.f47486d = i10;
            this.f47492j = (byte) (this.f47492j | 4);
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b d(int i10) {
            this.f47483a = i10;
            this.f47492j = (byte) (this.f47492j | 1);
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f47484b = str;
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b f(long j10) {
            this.f47487e = j10;
            this.f47492j = (byte) (this.f47492j | 8);
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b g(int i10) {
            this.f47485c = i10;
            this.f47492j = (byte) (this.f47492j | 2);
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b h(long j10) {
            this.f47488f = j10;
            this.f47492j = (byte) (this.f47492j | 16);
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b i(long j10) {
            this.f47489g = j10;
            this.f47492j = (byte) (this.f47492j | 32);
            return this;
        }

        @Override // o6.F.a.b
        public F.a.b j(String str) {
            this.f47490h = str;
            return this;
        }
    }

    @Override // o6.F.a
    public List b() {
        return this.f47482i;
    }

    @Override // o6.F.a
    public int c() {
        return this.f47477d;
    }

    @Override // o6.F.a
    public int d() {
        return this.f47474a;
    }

    @Override // o6.F.a
    public String e() {
        return this.f47475b;
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a) {
            F.a aVar = (F.a) obj;
            if (this.f47474a == aVar.d() && this.f47475b.equals(aVar.e()) && this.f47476c == aVar.g() && this.f47477d == aVar.c() && this.f47478e == aVar.f() && this.f47479f == aVar.h() && this.f47480g == aVar.i() && ((str = this.f47481h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.f47482i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // o6.F.a
    public long f() {
        return this.f47478e;
    }

    @Override // o6.F.a
    public int g() {
        return this.f47476c;
    }

    @Override // o6.F.a
    public long h() {
        return this.f47479f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f47474a ^ 1000003) * 1000003) ^ this.f47475b.hashCode()) * 1000003) ^ this.f47476c) * 1000003) ^ this.f47477d) * 1000003;
        long j10 = this.f47478e;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47479f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f47480g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f47481h;
        int iHashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f47482i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // o6.F.a
    public long i() {
        return this.f47480g;
    }

    @Override // o6.F.a
    public String j() {
        return this.f47481h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f47474a + ", processName=" + this.f47475b + ", reasonCode=" + this.f47476c + ", importance=" + this.f47477d + ", pss=" + this.f47478e + ", rss=" + this.f47479f + ", timestamp=" + this.f47480g + ", traceFile=" + this.f47481h + ", buildIdMappingForArch=" + this.f47482i + "}";
    }

    private C7079c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List list) {
        this.f47474a = i10;
        this.f47475b = str;
        this.f47476c = i11;
        this.f47477d = i12;
        this.f47478e = j10;
        this.f47479f = j11;
        this.f47480g = j12;
        this.f47481h = str2;
        this.f47482i = list;
    }
}
