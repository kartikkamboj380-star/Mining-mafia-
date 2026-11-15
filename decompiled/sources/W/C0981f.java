package W;

/* JADX INFO: renamed from: W.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0981f extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6217c;

    public C0981f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f6216b = obj;
        this.f6217c = i10;
    }

    public final void b() {
        Object obj = this.f6216b;
        if ((obj != null ? obj.hashCode() : 0) != this.f6217c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f6216b;
    }
}
