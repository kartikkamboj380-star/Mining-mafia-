package p225w4;

/* JADX INFO: renamed from: w4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C7141a extends AbstractC7145e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f50315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f50317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f50318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f50319f;

    /* JADX INFO: renamed from: w4.a$b */
    static final class b extends AbstractC7145e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f50320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f50321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f50322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f50323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f50324e;

        b() {
        }

        @Override // p225w4.AbstractC7145e.a
        AbstractC7145e a() {
            String str = "";
            if (this.f50320a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f50321b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f50322c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f50323d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f50324e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C7141a(this.f50320a.longValue(), this.f50321b.intValue(), this.f50322c.intValue(), this.f50323d.longValue(), this.f50324e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p225w4.AbstractC7145e.a
        AbstractC7145e.a b(int i10) {
            this.f50322c = Integer.valueOf(i10);
            return this;
        }

        @Override // p225w4.AbstractC7145e.a
        AbstractC7145e.a c(long j10) {
            this.f50323d = Long.valueOf(j10);
            return this;
        }

        @Override // p225w4.AbstractC7145e.a
        AbstractC7145e.a d(int i10) {
            this.f50321b = Integer.valueOf(i10);
            return this;
        }

        @Override // p225w4.AbstractC7145e.a
        AbstractC7145e.a e(int i10) {
            this.f50324e = Integer.valueOf(i10);
            return this;
        }

        @Override // p225w4.AbstractC7145e.a
        AbstractC7145e.a f(long j10) {
            this.f50320a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p225w4.AbstractC7145e
    int b() {
        return this.f50317d;
    }

    @Override // p225w4.AbstractC7145e
    long c() {
        return this.f50318e;
    }

    @Override // p225w4.AbstractC7145e
    int d() {
        return this.f50316c;
    }

    @Override // p225w4.AbstractC7145e
    int e() {
        return this.f50319f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7145e) {
            AbstractC7145e abstractC7145e = (AbstractC7145e) obj;
            if (this.f50315b == abstractC7145e.f() && this.f50316c == abstractC7145e.d() && this.f50317d == abstractC7145e.b() && this.f50318e == abstractC7145e.c() && this.f50319f == abstractC7145e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // p225w4.AbstractC7145e
    long f() {
        return this.f50315b;
    }

    public int hashCode() {
        long j10 = this.f50315b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f50316c) * 1000003) ^ this.f50317d) * 1000003;
        long j11 = this.f50318e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f50319f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f50315b + ", loadBatchSize=" + this.f50316c + ", criticalSectionEnterTimeoutMs=" + this.f50317d + ", eventCleanUpAge=" + this.f50318e + ", maxBlobByteSizePerRow=" + this.f50319f + "}";
    }

    private C7141a(long j10, int i10, int i11, long j11, int i12) {
        this.f50315b = j10;
        this.f50316c = i10;
        this.f50317d = i11;
        this.f50318e = j11;
        this.f50319f = i12;
    }
}
