package p033d2;

import Y1.p;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static a f42927h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f42928i = TimeUnit.MINUTES.toMillis(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile File f42930b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile File f42932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f42933e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile StatFs f42929a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile StatFs f42931c = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f42935g = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lock f42934f = new ReentrantLock();

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    public enum EnumC0410a {
        INTERNAL,
        EXTERNAL
    }

    protected a() {
    }

    protected static StatFs a(String str) {
        return new StatFs(str);
    }

    private void b() {
        if (this.f42935g) {
            return;
        }
        this.f42934f.lock();
        try {
            if (!this.f42935g) {
                this.f42930b = Environment.getDataDirectory();
                this.f42932d = Environment.getExternalStorageDirectory();
                g();
                this.f42935g = true;
            }
        } finally {
            this.f42934f.unlock();
        }
    }

    public static synchronized a d() {
        try {
            if (f42927h == null) {
                f42927h = new a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f42927h;
    }

    private void e() {
        if (this.f42934f.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.f42933e > f42928i) {
                    g();
                }
            } finally {
                this.f42934f.unlock();
            }
        }
    }

    private void g() {
        this.f42929a = h(this.f42929a, this.f42930b);
        this.f42931c = h(this.f42931c, this.f42932d);
        this.f42933e = SystemClock.uptimeMillis();
    }

    private StatFs h(StatFs statFs, File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return a(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw p.a(th);
            }
        }
        return null;
    }

    public long c(EnumC0410a enumC0410a) {
        b();
        e();
        StatFs statFs = enumC0410a == EnumC0410a.INTERNAL ? this.f42929a : this.f42931c;
        if (statFs != null) {
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        }
        return 0L;
    }

    public boolean f(EnumC0410a enumC0410a, long j10) {
        b();
        long jC = c(enumC0410a);
        return jC <= 0 || jC < j10;
    }
}
