package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6094i1 extends AbstractC6075c0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6094i1 f36096d = new C6094i1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f36097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36098c;

    private C6094i1(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f36097b = objArr;
        this.f36098c = i10;
    }

    public static C6094i1 b() {
        return f36096d;
    }

    private final String d(int i10) {
        return "Index:" + i10 + ", Size:" + this.f36098c;
    }

    private final void e(int i10) {
        if (i10 < 0 || i10 >= this.f36098c) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f36098c)) {
            throw new IndexOutOfBoundsException(d(i10));
        }
        Object[] objArr = this.f36097b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f36097b, i10, objArr2, i10 + 1, this.f36098c - i10);
            this.f36097b = objArr2;
        }
        this.f36097b[i10] = obj;
        this.f36098c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f36097b[i10];
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6075c0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        e(i10);
        Object[] objArr = this.f36097b;
        Object obj = objArr[i10];
        int i11 = this.f36098c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f36098c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        e(i10);
        Object[] objArr = this.f36097b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36098c;
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 zzd(int i10) {
        if (i10 >= this.f36098c) {
            return new C6094i1(Arrays.copyOf(this.f36097b, i10), this.f36098c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.AbstractC6075c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f36098c;
        Object[] objArr = this.f36097b;
        if (i10 == objArr.length) {
            this.f36097b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f36097b;
        int i11 = this.f36098c;
        this.f36098c = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
