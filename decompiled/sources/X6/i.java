package X6;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f6758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeUnit f6759c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6760a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f6760a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6760a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6760a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f6757a = j10;
        this.f6758b = j11;
        this.f6759c = timeUnit;
    }

    public double a() {
        int i10 = a.f6760a[this.f6759c.ordinal()];
        if (i10 == 1) {
            return (this.f6757a / this.f6758b) * TimeUnit.SECONDS.toNanos(1L);
        }
        if (i10 != 2) {
            return i10 != 3 ? this.f6757a / this.f6759c.toSeconds(this.f6758b) : (this.f6757a / this.f6758b) * TimeUnit.SECONDS.toMillis(1L);
        }
        return (this.f6757a / this.f6758b) * TimeUnit.SECONDS.toMicros(1L);
    }
}
