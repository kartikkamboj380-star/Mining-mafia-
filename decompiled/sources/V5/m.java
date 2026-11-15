package V5;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements InterfaceC0975l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f6123b = new m(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f6124a;

    private m(Object obj) {
        this.f6124a = obj;
    }

    public static InterfaceC0975l b(Object obj) {
        if (obj != null) {
            return new m(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // V5.o
    public final Object a() {
        return this.f6124a;
    }
}
