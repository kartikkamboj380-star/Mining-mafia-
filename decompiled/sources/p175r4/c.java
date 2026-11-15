package p175r4;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f48240c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f48242b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f48243a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f48244b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f48243a, this.f48244b);
        }

        public a b(long j10) {
            this.f48243a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f48244b = bVar;
            return this;
        }
    }

    public enum b implements C6.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f48253a;

        b(int i10) {
            this.f48253a = i10;
        }

        @Override // C6.c
        public int getNumber() {
            return this.f48253a;
        }
    }

    c(long j10, b bVar) {
        this.f48241a = j10;
        this.f48242b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f48241a;
    }

    public b b() {
        return this.f48242b;
    }
}
