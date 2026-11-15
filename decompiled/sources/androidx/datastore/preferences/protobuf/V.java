package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class V extends AbstractC1107c implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final V f9434d = new V(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f9435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9436c;

    private V(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f9435b = objArr;
        this.f9436c = i10;
    }

    private static Object[] b(int i10) {
        return new Object[i10];
    }

    public static V d() {
        return f9434d;
    }

    private void e(int i10) {
        if (i10 < 0 || i10 >= this.f9436c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    private String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f9436c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        a();
        int i10 = this.f9436c;
        Object[] objArr = this.f9435b;
        if (i10 == objArr.length) {
            this.f9435b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f9435b;
        int i11 = this.f9436c;
        this.f9436c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        e(i10);
        return this.f9435b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1124u.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public V mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f9436c) {
            return new V(Arrays.copyOf(this.f9435b, i10), this.f9436c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1107c, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        a();
        e(i10);
        Object[] objArr = this.f9435b;
        Object obj = objArr[i10];
        int i11 = this.f9436c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f9436c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        a();
        e(i10);
        Object[] objArr = this.f9435b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9436c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f9436c)) {
            Object[] objArr = this.f9435b;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrB = b(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f9435b, 0, objArrB, 0, i10);
                System.arraycopy(this.f9435b, i10, objArrB, i10 + 1, this.f9436c - i10);
                this.f9435b = objArrB;
            }
            this.f9435b[i10] = obj;
            this.f9436c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i10));
    }
}
