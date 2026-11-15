package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1116l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class f9586a = c();

    public static C1117m a() {
        C1117m c1117mB = b("getEmptyRegistry");
        return c1117mB != null ? c1117mB : C1117m.f9591c;
    }

    private static final C1117m b(String str) {
        Class cls = f9586a;
        if (cls == null) {
            return null;
        }
        try {
            return (C1117m) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
