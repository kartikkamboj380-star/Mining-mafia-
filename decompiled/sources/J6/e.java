package J6;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f2360d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f2361e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f2362a = i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2364c;

    e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f2364c) + this.f2362a.e(), f2361e);
        }
        return f2360d;
    }

    private static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f2364c = 0;
    }

    public synchronized boolean b() {
        return this.f2364c == 0 || this.f2362a.a() > this.f2363b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f2364c++;
        this.f2363b = this.f2362a.a() + a(i10);
    }
}
