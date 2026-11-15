package I8;

/* JADX INFO: renamed from: I8.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0686o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final N8.D f1805a = new N8.D("REMOVED_TASK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final N8.D f1806b = new N8.D("CLOSED_EMPTY");

    public static final long c(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        if (j10 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return j10 * 1000000;
    }
}
