package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final InterfaceC1128y f9383a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC1128y f9384b = new C1129z();

    static InterfaceC1128y a() {
        return f9383a;
    }

    static InterfaceC1128y b() {
        return f9384b;
    }

    private static InterfaceC1128y c() {
        if (U.f9431d) {
            return null;
        }
        try {
            return (InterfaceC1128y) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
