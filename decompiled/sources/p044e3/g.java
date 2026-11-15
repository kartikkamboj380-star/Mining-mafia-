package p044e3;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f43290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f43291b;

    static {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        f43290a = timeUnit.convert(20L, TimeUnit.MILLISECONDS);
        f43291b = timeUnit.convert(3L, TimeUnit.SECONDS);
    }
}
