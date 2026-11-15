package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class J extends AbstractC6743a implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final J f41119c = new J(new Object[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f41120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41121b;

    private J(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f41120a = objArr;
        this.f41121b = i10;
    }

    private static Object[] a(int i10) {
        return new Object[i10];
    }

    public static J b() {
        return f41119c;
    }

    private void d(int i10) {
        if (i10 < 0 || i10 >= this.f41121b) {
            throw new IndexOutOfBoundsException(e(i10));
        }
    }

    private String e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f41121b;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        ensureIsMutable();
        int i10 = this.f41121b;
        Object[] objArr = this.f41120a;
        if (i10 == objArr.length) {
            this.f41120a = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f41120a;
        int i11 = this.f41121b;
        this.f41121b = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public J mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f41121b) {
            return new J(Arrays.copyOf(this.f41120a, i10), this.f41121b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        d(i10);
        return this.f41120a[i10];
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        ensureIsMutable();
        d(i10);
        Object[] objArr = this.f41120a;
        Object obj = objArr[i10];
        int i11 = this.f41121b;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f41121b--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        ensureIsMutable();
        d(i10);
        Object[] objArr = this.f41120a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41121b;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        int i11;
        ensureIsMutable();
        if (i10 >= 0 && i10 <= (i11 = this.f41121b)) {
            Object[] objArr = this.f41120a;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArrA = a(((i11 * 3) / 2) + 1);
                System.arraycopy(this.f41120a, 0, objArrA, 0, i10);
                System.arraycopy(this.f41120a, i10, objArrA, i10 + 1, this.f41121b - i10);
                this.f41120a = objArrA;
            }
            this.f41120a[i10] = obj;
            this.f41121b++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(e(i10));
    }
}
