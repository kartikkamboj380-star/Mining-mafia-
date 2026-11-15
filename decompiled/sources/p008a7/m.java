package p008a7;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7336b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7337a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f7338b = com.google.firebase.remoteconfig.internal.m.f40599j;

        public m c() {
            return new m(this);
        }

        public b d(long j10) {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f7337a = j10;
            return this;
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f7338b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private m(b bVar) {
        this.f7335a = bVar.f7337a;
        this.f7336b = bVar.f7338b;
    }
}
