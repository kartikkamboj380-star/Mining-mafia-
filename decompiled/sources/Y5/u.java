package Y5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class u extends j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final j f6932e = new u(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f6933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f6934d;

    u(Object[] objArr, int i10) {
        this.f6933c = objArr;
        this.f6934d = i10;
    }

    @Override // Y5.j, Y5.i
    int a(Object[] objArr, int i10) {
        System.arraycopy(this.f6933c, 0, objArr, i10, this.f6934d);
        return i10 + this.f6934d;
    }

    @Override // Y5.i
    Object[] b() {
        return this.f6933c;
    }

    @Override // Y5.i
    int d() {
        return this.f6934d;
    }

    @Override // Y5.i
    int e() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i10) {
        X5.j.f(i10, this.f6934d);
        Object obj = this.f6933c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6934d;
    }
}
