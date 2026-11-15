package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1120p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AbstractC1118n f9595a = new C1119o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AbstractC1118n f9596b = c();

    static AbstractC1118n a() {
        AbstractC1118n abstractC1118n = f9596b;
        if (abstractC1118n != null) {
            return abstractC1118n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC1118n b() {
        return f9595a;
    }

    private static AbstractC1118n c() {
        if (U.f9431d) {
            return null;
        }
        try {
            return (AbstractC1118n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
