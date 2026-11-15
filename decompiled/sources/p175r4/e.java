package p175r4;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final e f48259c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48261b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f48262a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f48263b = 0;

        a() {
        }

        public e a() {
            return new e(this.f48262a, this.f48263b);
        }

        public a b(long j10) {
            this.f48262a = j10;
            return this;
        }

        public a c(long j10) {
            this.f48263b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f48260a = j10;
        this.f48261b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f48260a;
    }

    public long b() {
        return this.f48261b;
    }
}
