package K4;

/* JADX INFO: loaded from: classes2.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f2637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2638b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f2639c = new Object();

    public X(long j10) {
        this.f2637a = j10;
    }

    public final boolean a() {
        synchronized (this.f2639c) {
            try {
                long jElapsedRealtime = G4.t.o().elapsedRealtime();
                if (this.f2638b + this.f2637a > jElapsedRealtime) {
                    return false;
                }
                this.f2638b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j10) {
        synchronized (this.f2639c) {
            this.f2637a = j10;
        }
    }
}
