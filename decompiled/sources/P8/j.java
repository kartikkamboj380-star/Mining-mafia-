package P8;

import N8.E;
import N8.G;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4769a = E.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f4770b = G.f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4771c = G.e("kotlinx.coroutines.scheduler.core.pool.size", kotlin.ranges.b.c(E.a(), 2), 1, 0, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4772d = G.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f4773e = TimeUnit.SECONDS.toNanos(G.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, null));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static g f4774f = e.f4760a;

    public static final h b(Runnable runnable, long j10, boolean z9) {
        return new i(runnable, j10, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String c(boolean z9) {
        return z9 ? "Blocking" : "Non-blocking";
    }
}
