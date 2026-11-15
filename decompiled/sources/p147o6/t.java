package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class t extends F.e.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f47653d;

    static final class b extends F.e.d.a.c.AbstractC0505a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f47654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f47655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f47656c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f47657d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f47658e;

        b() {
        }

        @Override // o6.F.e.d.a.c.AbstractC0505a
        public F.e.d.a.c a() {
            String str;
            if (this.f47658e == 7 && (str = this.f47654a) != null) {
                return new t(str, this.f47655b, this.f47656c, this.f47657d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f47654a == null) {
                sb.append(" processName");
            }
            if ((this.f47658e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f47658e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f47658e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.d.a.c.AbstractC0505a
        public F.e.d.a.c.AbstractC0505a b(boolean z9) {
            this.f47657d = z9;
            this.f47658e = (byte) (this.f47658e | 4);
            return this;
        }

        @Override // o6.F.e.d.a.c.AbstractC0505a
        public F.e.d.a.c.AbstractC0505a c(int i10) {
            this.f47656c = i10;
            this.f47658e = (byte) (this.f47658e | 2);
            return this;
        }

        @Override // o6.F.e.d.a.c.AbstractC0505a
        public F.e.d.a.c.AbstractC0505a d(int i10) {
            this.f47655b = i10;
            this.f47658e = (byte) (this.f47658e | 1);
            return this;
        }

        @Override // o6.F.e.d.a.c.AbstractC0505a
        public F.e.d.a.c.AbstractC0505a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f47654a = str;
            return this;
        }
    }

    @Override // o6.F.e.d.a.c
    public int b() {
        return this.f47652c;
    }

    @Override // o6.F.e.d.a.c
    public int c() {
        return this.f47651b;
    }

    @Override // o6.F.e.d.a.c
    public String d() {
        return this.f47650a;
    }

    @Override // o6.F.e.d.a.c
    public boolean e() {
        return this.f47653d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.c) {
            F.e.d.a.c cVar = (F.e.d.a.c) obj;
            if (this.f47650a.equals(cVar.d()) && this.f47651b == cVar.c() && this.f47652c == cVar.b() && this.f47653d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f47650a.hashCode() ^ 1000003) * 1000003) ^ this.f47651b) * 1000003) ^ this.f47652c) * 1000003) ^ (this.f47653d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f47650a + ", pid=" + this.f47651b + ", importance=" + this.f47652c + ", defaultProcess=" + this.f47653d + "}";
    }

    private t(String str, int i10, int i11, boolean z9) {
        this.f47650a = str;
        this.f47651b = i10;
        this.f47652c = i11;
        this.f47653d = z9;
    }
}
