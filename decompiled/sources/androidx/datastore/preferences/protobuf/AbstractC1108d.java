package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1108d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f9464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Class f9465b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f9466c;

    static {
        f9466c = (f9464a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class b() {
        return f9465b;
    }

    static boolean c() {
        if (f9464a) {
            return true;
        }
        return (f9465b == null || f9466c) ? false : true;
    }
}
