package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final O f9424a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final O f9425b = new P();

    static O a() {
        return f9424a;
    }

    static O b() {
        return f9425b;
    }

    private static O c() {
        if (U.f9431d) {
            return null;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
