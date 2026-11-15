package Y5;

/* JADX INFO: loaded from: classes2.dex */
final class w extends l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f6949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final w f6950i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f6951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f6952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f6953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f6954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f6955g;

    static {
        Object[] objArr = new Object[0];
        f6949h = objArr;
        f6950i = new w(objArr, 0, objArr, 0, 0);
    }

    w(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f6951c = objArr;
        this.f6952d = i10;
        this.f6953e = objArr2;
        this.f6954f = i11;
        this.f6955g = i12;
    }

    @Override // Y5.i
    int a(Object[] objArr, int i10) {
        System.arraycopy(this.f6951c, 0, objArr, i10, this.f6955g);
        return i10 + this.f6955g;
    }

    @Override // Y5.i
    Object[] b() {
        return this.f6951c;
    }

    @Override // Y5.i, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f6953e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iB = h.b(obj);
        while (true) {
            int i10 = iB & this.f6954f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i10 + 1;
        }
    }

    @Override // Y5.i
    int d() {
        return this.f6955g;
    }

    @Override // Y5.i
    int e() {
        return 0;
    }

    @Override // Y5.l, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f6952d;
    }

    @Override // Y5.l
    j k() {
        return j.i(this.f6951c, this.f6955g);
    }

    @Override // Y5.l
    boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public A iterator() {
        return g().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f6955g;
    }
}
