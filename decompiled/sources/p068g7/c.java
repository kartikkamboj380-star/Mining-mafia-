package p068g7;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f44425b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f44426a;

    private c(Object obj) {
        this.f44426a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f44426a;
    }
}
