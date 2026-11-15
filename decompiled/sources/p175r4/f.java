package p175r4;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f48264c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f48266b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f48267a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f48268b = 0;

        a() {
        }

        public f a() {
            return new f(this.f48267a, this.f48268b);
        }

        public a b(long j10) {
            this.f48268b = j10;
            return this;
        }

        public a c(long j10) {
            this.f48267a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f48265a = j10;
        this.f48266b = j11;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f48266b;
    }

    public long b() {
        return this.f48265a;
    }
}
