package Y5;

/* JADX INFO: loaded from: classes2.dex */
final class y extends l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object f6961c;

    y(Object obj) {
        this.f6961c = X5.j.h(obj);
    }

    @Override // Y5.i
    int a(Object[] objArr, int i10) {
        objArr[i10] = this.f6961c;
        return i10 + 1;
    }

    @Override // Y5.i, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f6961c.equals(obj);
    }

    @Override // Y5.l, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f6961c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: m */
    public A iterator() {
        return m.b(this.f6961c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f6961c.toString() + ']';
    }
}
