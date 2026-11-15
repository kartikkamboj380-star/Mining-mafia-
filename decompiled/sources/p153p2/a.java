package p153p2;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f47754a;

    /* JADX INFO: renamed from: p2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0513a {
        void release();
    }

    public static synchronized a b() {
        try {
            if (f47754a == null) {
                f47754a = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47754a;
    }

    static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public abstract void a(InterfaceC0513a interfaceC0513a);

    public abstract void d(InterfaceC0513a interfaceC0513a);
}
