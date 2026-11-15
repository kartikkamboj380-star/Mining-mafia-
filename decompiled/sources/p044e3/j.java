package p044e3;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f43292a = new j();

    private j() {
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final long b() {
        return System.nanoTime();
    }

    public static final long c() {
        return SystemClock.uptimeMillis();
    }
}
