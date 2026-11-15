package p145o4;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f47202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f47203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f47205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f47206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f47207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f47209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final byte[] f47210j;

    /* JADX INFO: renamed from: o4.b$b, reason: collision with other inner class name */
    static final class C0490b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f47212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private h f47213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f47214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f47215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f47216f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f47217g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f47218h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private byte[] f47219i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private byte[] f47220j;

        C0490b() {
        }

        @Override // o4.i.a
        public i d() {
            String str = "";
            if (this.f47211a == null) {
                str = " transportName";
            }
            if (this.f47213c == null) {
                str = str + " encodedPayload";
            }
            if (this.f47214d == null) {
                str = str + " eventMillis";
            }
            if (this.f47215e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f47216f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f47211a, this.f47212b, this.f47213c, this.f47214d.longValue(), this.f47215e.longValue(), this.f47216f, this.f47217g, this.f47218h, this.f47219i, this.f47220j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o4.i.a
        protected Map e() {
            Map map = this.f47216f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // o4.i.a
        protected i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f47216f = map;
            return this;
        }

        @Override // o4.i.a
        public i.a g(Integer num) {
            this.f47212b = num;
            return this;
        }

        @Override // o4.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f47213c = hVar;
            return this;
        }

        @Override // o4.i.a
        public i.a i(long j10) {
            this.f47214d = Long.valueOf(j10);
            return this;
        }

        @Override // o4.i.a
        public i.a j(byte[] bArr) {
            this.f47219i = bArr;
            return this;
        }

        @Override // o4.i.a
        public i.a k(byte[] bArr) {
            this.f47220j = bArr;
            return this;
        }

        @Override // o4.i.a
        public i.a l(Integer num) {
            this.f47217g = num;
            return this;
        }

        @Override // o4.i.a
        public i.a m(String str) {
            this.f47218h = str;
            return this;
        }

        @Override // o4.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f47211a = str;
            return this;
        }

        @Override // o4.i.a
        public i.a o(long j10) {
            this.f47215e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p145o4.i
    protected Map c() {
        return this.f47206f;
    }

    @Override // p145o4.i
    public Integer d() {
        return this.f47202b;
    }

    @Override // p145o4.i
    public h e() {
        return this.f47203c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f47201a.equals(iVar.n()) && ((num = this.f47202b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f47203c.equals(iVar.e()) && this.f47204d == iVar.f() && this.f47205e == iVar.o() && this.f47206f.equals(iVar.c()) && ((num2 = this.f47207g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f47208h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z9 = iVar instanceof b;
                if (Arrays.equals(this.f47209i, z9 ? ((b) iVar).f47209i : iVar.g())) {
                    if (Arrays.equals(this.f47210j, z9 ? ((b) iVar).f47210j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p145o4.i
    public long f() {
        return this.f47204d;
    }

    @Override // p145o4.i
    public byte[] g() {
        return this.f47209i;
    }

    @Override // p145o4.i
    public byte[] h() {
        return this.f47210j;
    }

    public int hashCode() {
        int iHashCode = (this.f47201a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f47202b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f47203c.hashCode()) * 1000003;
        long j10 = this.f47204d;
        int i10 = (iHashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f47205e;
        int iHashCode3 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f47206f.hashCode()) * 1000003;
        Integer num2 = this.f47207g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f47208h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f47209i)) * 1000003) ^ Arrays.hashCode(this.f47210j);
    }

    @Override // p145o4.i
    public Integer l() {
        return this.f47207g;
    }

    @Override // p145o4.i
    public String m() {
        return this.f47208h;
    }

    @Override // p145o4.i
    public String n() {
        return this.f47201a;
    }

    @Override // p145o4.i
    public long o() {
        return this.f47205e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f47201a + ", code=" + this.f47202b + ", encodedPayload=" + this.f47203c + ", eventMillis=" + this.f47204d + ", uptimeMillis=" + this.f47205e + ", autoMetadata=" + this.f47206f + ", productId=" + this.f47207g + ", pseudonymousId=" + this.f47208h + ", experimentIdsClear=" + Arrays.toString(this.f47209i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f47210j) + "}";
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f47201a = str;
        this.f47202b = num;
        this.f47203c = hVar;
        this.f47204d = j10;
        this.f47205e = j11;
        this.f47206f = map;
        this.f47207g = num2;
        this.f47208h = str2;
        this.f47209i = bArr;
        this.f47210j = bArr2;
    }
}
