package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final E f9398a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final E f9399b = new F();

    static E a() {
        return f9398a;
    }

    static E b() {
        return f9399b;
    }

    private static E c() {
        if (U.f9431d) {
            return null;
        }
        try {
            return (E) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
