package p192t1;

import android.os.SystemClock;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f49493a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final File f49494b = new File("/proc/self/fd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f49495c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f49496d = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f49497e = true;

    private i() {
    }

    private final boolean a() {
        int i10 = f49495c;
        f49495c = i10 + 1;
        return i10 >= 30 || SystemClock.uptimeMillis() > f49496d + ((long) 30000);
    }

    public final synchronized boolean b(s sVar) {
        try {
            if (a()) {
                f49495c = 0;
                f49496d = SystemClock.uptimeMillis();
                String[] list = f49494b.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z9 = length < 800;
                f49497e = z9;
                if (!z9 && sVar != null) {
                    s.a aVar = s.a.Warn;
                    if (sVar.a().compareTo(aVar) <= 0) {
                        sVar.b("FileDescriptorCounter", aVar, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f49497e;
    }
}
