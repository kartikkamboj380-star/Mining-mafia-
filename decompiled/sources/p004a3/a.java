package p004a3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(boolean z9) {
        if (!z9) {
            throw new AssertionError();
        }
    }

    public static void b(boolean z9, String str) {
        if (!z9) {
            throw new AssertionError(str);
        }
    }

    public static Object c(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError();
    }

    public static Object d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new AssertionError(str);
    }

    public static Object e(Object obj) {
        return obj;
    }
}
