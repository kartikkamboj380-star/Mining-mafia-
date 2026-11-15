package p215v4;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f50122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f50123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f50124c;

    static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f50125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f50126b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f50127c;

        b() {
        }

        @Override // v4.f.b.a
        public f.b a() {
            String str = "";
            if (this.f50125a == null) {
                str = " delta";
            }
            if (this.f50126b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f50127c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f50125a.longValue(), this.f50126b.longValue(), this.f50127c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v4.f.b.a
        public f.b.a b(long j10) {
            this.f50125a = Long.valueOf(j10);
            return this;
        }

        @Override // v4.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f50127c = set;
            return this;
        }

        @Override // v4.f.b.a
        public f.b.a d(long j10) {
            this.f50126b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // v4.f.b
    long b() {
        return this.f50122a;
    }

    @Override // v4.f.b
    Set c() {
        return this.f50124c;
    }

    @Override // v4.f.b
    long d() {
        return this.f50123b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f50122a == bVar.b() && this.f50123b == bVar.d() && this.f50124c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f50122a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f50123b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f50124c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f50122a + ", maxAllowedDelay=" + this.f50123b + ", flags=" + this.f50124c + "}";
    }

    private c(long j10, long j11, Set set) {
        this.f50122a = j10;
        this.f50123b = j11;
        this.f50124c = set;
    }
}
