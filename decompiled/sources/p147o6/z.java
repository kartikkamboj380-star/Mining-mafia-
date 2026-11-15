package p147o6;

/* JADX INFO: loaded from: classes3.dex */
final class z extends F.e.AbstractC0508e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f47692d;

    static final class b extends F.e.AbstractC0508e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f47693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f47694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f47695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f47696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private byte f47697e;

        b() {
        }

        @Override // o6.F.e.AbstractC0508e.a
        public F.e.AbstractC0508e a() {
            String str;
            String str2;
            if (this.f47697e == 3 && (str = this.f47694b) != null && (str2 = this.f47695c) != null) {
                return new z(this.f47693a, str, str2, this.f47696d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f47697e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f47694b == null) {
                sb.append(" version");
            }
            if (this.f47695c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f47697e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // o6.F.e.AbstractC0508e.a
        public F.e.AbstractC0508e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f47695c = str;
            return this;
        }

        @Override // o6.F.e.AbstractC0508e.a
        public F.e.AbstractC0508e.a c(boolean z9) {
            this.f47696d = z9;
            this.f47697e = (byte) (this.f47697e | 2);
            return this;
        }

        @Override // o6.F.e.AbstractC0508e.a
        public F.e.AbstractC0508e.a d(int i10) {
            this.f47693a = i10;
            this.f47697e = (byte) (this.f47697e | 1);
            return this;
        }

        @Override // o6.F.e.AbstractC0508e.a
        public F.e.AbstractC0508e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f47694b = str;
            return this;
        }
    }

    @Override // o6.F.e.AbstractC0508e
    public String b() {
        return this.f47691c;
    }

    @Override // o6.F.e.AbstractC0508e
    public int c() {
        return this.f47689a;
    }

    @Override // o6.F.e.AbstractC0508e
    public String d() {
        return this.f47690b;
    }

    @Override // o6.F.e.AbstractC0508e
    public boolean e() {
        return this.f47692d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.AbstractC0508e) {
            F.e.AbstractC0508e abstractC0508e = (F.e.AbstractC0508e) obj;
            if (this.f47689a == abstractC0508e.c() && this.f47690b.equals(abstractC0508e.d()) && this.f47691c.equals(abstractC0508e.b()) && this.f47692d == abstractC0508e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f47689a ^ 1000003) * 1000003) ^ this.f47690b.hashCode()) * 1000003) ^ this.f47691c.hashCode()) * 1000003) ^ (this.f47692d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f47689a + ", version=" + this.f47690b + ", buildVersion=" + this.f47691c + ", jailbroken=" + this.f47692d + "}";
    }

    private z(int i10, String str, String str2, boolean z9) {
        this.f47689a = i10;
        this.f47690b = str;
        this.f47691c = str2;
        this.f47692d = z9;
    }
}
