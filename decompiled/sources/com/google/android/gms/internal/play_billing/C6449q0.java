package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6449q0 extends B implements RandomAccess, InterfaceC6464u0, InterfaceC6394c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C6449q0 f37323d = new C6449q0(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f37324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37325c;

    private C6449q0(int[] iArr, int i10, boolean z9) {
        super(z9);
        this.f37324b = iArr;
        this.f37325c = i10;
    }

    public static C6449q0 d() {
        return f37323d;
    }

    private final String g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f37325c;
    }

    private final void zzi(int i10) {
        if (i10 < 0 || i10 >= this.f37325c) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f37325c)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f37324b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f37324b, i10, iArr2, i12, this.f37325c - i10);
            this.f37324b = iArr2;
        }
        this.f37324b[i10] = iIntValue;
        this.f37325c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC6480y0.f37349d;
        collection.getClass();
        if (!(collection instanceof C6449q0)) {
            return super.addAll(collection);
        }
        C6449q0 c6449q0 = (C6449q0) collection;
        int i10 = c6449q0.f37325c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f37325c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f37324b;
        if (i12 > iArr.length) {
            this.f37324b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c6449q0.f37324b, 0, this.f37324b, this.f37325c, c6449q0.f37325c);
        this.f37325c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int b(int i10) {
        zzi(i10);
        return this.f37324b[i10];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i10) {
        a();
        int i11 = this.f37325c;
        int[] iArr = this.f37324b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f37324b = iArr2;
        }
        int[] iArr3 = this.f37324b;
        int i12 = this.f37325c;
        this.f37325c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6449q0)) {
            return super.equals(obj);
        }
        C6449q0 c6449q0 = (C6449q0) obj;
        if (this.f37325c != c6449q0.f37325c) {
            return false;
        }
        int[] iArr = c6449q0.f37324b;
        for (int i10 = 0; i10 < this.f37325c; i10++) {
            if (this.f37324b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzi(i10);
        return Integer.valueOf(this.f37324b[i10]);
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f37325c; i11++) {
            i10 = (i10 * 31) + this.f37324b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f37325c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f37324b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        zzi(i10);
        int[] iArr = this.f37324b;
        int i11 = iArr[i10];
        int i12 = this.f37325c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f37325c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f37324b;
        System.arraycopy(iArr, i11, iArr, i10, this.f37325c - i11);
        this.f37325c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        zzi(i10);
        int[] iArr = this.f37324b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37325c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6472w0
    public final /* bridge */ /* synthetic */ InterfaceC6472w0 zzd(int i10) {
        if (i10 >= this.f37325c) {
            return new C6449q0(Arrays.copyOf(this.f37324b, i10), this.f37325c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.B, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
