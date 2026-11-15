package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1122s implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C1122s f9670a = new C1122s();

    private C1122s() {
    }

    public static C1122s c() {
        return f9670a;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public H a(Class cls) {
        if (!AbstractC1123t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (H) AbstractC1123t.q(cls.asSubclass(AbstractC1123t.class)).f();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean b(Class cls) {
        return AbstractC1123t.class.isAssignableFrom(cls);
    }
}
