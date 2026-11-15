package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6746d extends AbstractC6743a implements Internal.BooleanList, RandomAccess, H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C6746d f41245c = new C6746d(new boolean[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean[] f41246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41247b;

    C6746d() {
        this(new boolean[10], 0, true);
    }

    private void d(int i10, boolean z9) {
        int i11;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f41247b)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        boolean[] zArr = this.f41246a;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f41246a, i10, zArr2, i10 + 1, this.f41247b - i10);
            this.f41246a = zArr2;
        }
        this.f41246a[i10] = z9;
        this.f41247b++;
        ((AbstractList) this).modCount++;
    }

    public static C6746d e() {
        return f41245c;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f41247b) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f41247b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        d(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C6746d)) {
            return super.addAll(collection);
        }
        C6746d c6746d = (C6746d) collection;
        int i10 = c6746d.f41247b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f41247b;
        if (com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f41246a;
        if (i12 > zArr.length) {
            this.f41246a = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c6746d.f41246a, 0, this.f41246a, this.f41247b, c6746d.f41247b);
        this.f41247b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public void addBoolean(boolean z9) {
        ensureIsMutable();
        int i10 = this.f41247b;
        boolean[] zArr = this.f41246a;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f41246a = zArr2;
        }
        boolean[] zArr3 = this.f41246a;
        int i11 = this.f41247b;
        this.f41247b = i11 + 1;
        zArr3[i11] = z9;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
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
        if (!(obj instanceof C6746d)) {
            return super.equals(obj);
        }
        C6746d c6746d = (C6746d) obj;
        if (this.f41247b != c6746d.f41247b) {
            return false;
        }
        boolean[] zArr = c6746d.f41246a;
        for (int i10 = 0; i10 < this.f41247b; i10++) {
            if (this.f41246a[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean getBoolean(int i10) {
        g(i10);
        return this.f41246a[i10];
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashBoolean = 1;
        for (int i10 = 0; i10 < this.f41247b; i10++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.f41246a[i10]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f41246a[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        ensureIsMutable();
        g(i10);
        boolean[] zArr = this.f41246a;
        boolean z9 = zArr[i10];
        int i11 = this.f41247b;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f41247b--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z9);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f41246a;
        System.arraycopy(zArr, i11, zArr, i10, this.f41247b - i11);
        this.f41247b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean setBoolean(int i10, boolean z9) {
        ensureIsMutable();
        g(i10);
        boolean[] zArr = this.f41246a;
        boolean z10 = zArr[i10];
        zArr[i10] = z9;
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41247b;
    }

    private C6746d(boolean[] zArr, int i10, boolean z9) {
        super(z9);
        this.f41246a = zArr;
        this.f41247b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f41247b) {
            return new C6746d(Arrays.copyOf(this.f41246a, i10), this.f41247b, true);
        }
        throw new IllegalArgumentException();
    }
}
