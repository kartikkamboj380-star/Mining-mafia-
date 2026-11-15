package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6757o extends AbstractC6743a implements Internal.IntList, RandomAccess, H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C6757o f41269c = new C6757o(new int[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f41270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41271b;

    C6757o() {
        this(new int[10], 0, true);
    }

    private void d(int i10, int i11) {
        int i12;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i12 = this.f41271b)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int[] iArr = this.f41270a;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f41270a, i10, iArr2, i10 + 1, this.f41271b - i10);
            this.f41270a = iArr2;
        }
        this.f41270a[i10] = i11;
        this.f41271b++;
        ((AbstractList) this).modCount++;
    }

    public static C6757o e() {
        return f41269c;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f41271b) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f41271b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        d(i10, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C6757o)) {
            return super.addAll(collection);
        }
        C6757o c6757o = (C6757o) collection;
        int i10 = c6757o.f41271b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f41271b;
        if (com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f41270a;
        if (i12 > iArr.length) {
            this.f41270a = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c6757o.f41270a, 0, this.f41270a, this.f41271b, c6757o.f41271b);
        this.f41271b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i10) {
        ensureIsMutable();
        int i11 = this.f41271b;
        int[] iArr = this.f41270a;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f41270a = iArr2;
        }
        int[] iArr3 = this.f41270a;
        int i12 = this.f41271b;
        this.f41271b = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6757o)) {
            return super.equals(obj);
        }
        C6757o c6757o = (C6757o) obj;
        if (this.f41271b != c6757o.f41271b) {
            return false;
        }
        int[] iArr = c6757o.f41270a;
        for (int i10 = 0; i10 < this.f41271b; i10++) {
            if (this.f41270a[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i10) {
        g(i10);
        return this.f41270a[i10];
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f41271b; i11++) {
            i10 = (i10 * 31) + this.f41270a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f41270a[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        ensureIsMutable();
        g(i10);
        int[] iArr = this.f41270a;
        int i11 = iArr[i10];
        int i12 = this.f41271b;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f41271b--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f41270a;
        System.arraycopy(iArr, i11, iArr, i10, this.f41271b - i11);
        this.f41271b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i10, int i11) {
        ensureIsMutable();
        g(i10);
        int[] iArr = this.f41270a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41271b;
    }

    private C6757o(int[] iArr, int i10, boolean z9) {
        super(z9);
        this.f41270a = iArr;
        this.f41271b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f41271b) {
            return new C6757o(Arrays.copyOf(this.f41270a, i10), this.f41271b, true);
        }
        throw new IllegalArgumentException();
    }
}
