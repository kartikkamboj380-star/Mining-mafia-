package p165q4;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f48067b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48068a;

    private c(Object obj) {
        this.f48068a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f48068a;
    }
}
