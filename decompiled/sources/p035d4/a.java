package p035d4;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f43072a;

    public static void a(b bVar) {
        synchronized (a.class) {
            try {
                if (f43072a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                f43072a = bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(b bVar) {
        if (c()) {
            return;
        }
        a(bVar);
    }

    public static boolean c() {
        boolean z9;
        synchronized (a.class) {
            z9 = f43072a != null;
        }
        return z9;
    }

    public static boolean d(String str) {
        return e(str, 0);
    }

    public static boolean e(String str, int i10) {
        b bVar;
        synchronized (a.class) {
            bVar = f43072a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.a(str, i10);
    }
}
