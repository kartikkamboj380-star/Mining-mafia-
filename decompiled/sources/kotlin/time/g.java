package kotlin.time;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements H8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f46057a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f46058b = System.nanoTime();

    private g() {
    }

    private final long e() {
        return System.nanoTime() - f46058b;
    }

    @Override // H8.c
    public /* bridge */ /* synthetic */ a a() {
        return h.a.d(d());
    }

    public final long b(long j10, long j11) {
        return f.d(j10, j11, H8.b.NANOSECONDS);
    }

    public final long c(long j10) {
        return f.b(e(), j10, H8.b.NANOSECONDS);
    }

    public long d() {
        return h.a.f(e());
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
