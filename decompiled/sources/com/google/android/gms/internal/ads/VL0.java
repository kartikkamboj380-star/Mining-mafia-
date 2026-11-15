package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class VL0 extends AbstractC3344eL0 implements RandomAccess, ZL0, GM0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f24241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final VL0 f24242e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f24243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24244c;

    static {
        int[] iArr = new int[0];
        f24241d = iArr;
        f24242e = new VL0(iArr, 0, false);
    }

    private VL0(int[] iArr, int i10, boolean z9) {
        super(z9);
        this.f24243b = iArr;
        this.f24244c = i10;
    }

    public static VL0 b() {
        return f24242e;
    }

    private static int i(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f24244c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f24244c;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length());
        sb.append("Index:");
        sb.append(i10);
        sb.append(", Size:");
        sb.append(i11);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f24244c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f24243b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[i(length)];
            System.arraycopy(this.f24243b, 0, iArr2, 0, i10);
            System.arraycopy(this.f24243b, i10, iArr2, i12, this.f24244c - i10);
            this.f24243b = iArr2;
        }
        this.f24243b[i10] = iIntValue;
        this.f24244c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC3346eM0.f27766b;
        collection.getClass();
        if (!(collection instanceof VL0)) {
            return super.addAll(collection);
        }
        VL0 vl0 = (VL0) collection;
        int i10 = vl0.f24244c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f24244c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f24243b;
        if (i12 > iArr.length) {
            this.f24243b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(vl0.f24243b, 0, this.f24243b, this.f24244c, vl0.f24244c);
        this.f24244c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        j(i10);
        return this.f24243b[i10];
    }

    public final int e(int i10, int i11) {
        a();
        j(i10);
        int[] iArr = this.f24243b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VL0)) {
            return super.equals(obj);
        }
        VL0 vl0 = (VL0) obj;
        if (this.f24244c != vl0.f24244c) {
            return false;
        }
        int[] iArr = vl0.f24243b;
        for (int i10 = 0; i10 < this.f24244c; i10++) {
            if (this.f24243b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    final void g(int i10) {
        int length = this.f24243b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f24243b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = i(length);
        }
        this.f24243b = Arrays.copyOf(this.f24243b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        j(i10);
        return Integer.valueOf(this.f24243b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3221dM0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ZL0 x(int i10) {
        if (i10 >= this.f24244c) {
            return new VL0(i10 == 0 ? f24241d : Arrays.copyOf(this.f24243b, i10), this.f24244c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f24244c; i11++) {
            i10 = (i10 * 31) + this.f24243b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f24244c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f24243b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        j(i10);
        int[] iArr = this.f24243b;
        int i11 = iArr[i10];
        int i12 = this.f24244c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f24244c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f24243b;
        System.arraycopy(iArr, i11, iArr, i10, this.f24244c - i11);
        this.f24244c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Integer.valueOf(e(i10, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24244c;
    }

    @Override // com.google.android.gms.internal.ads.ZL0
    public final void zzi(int i10) {
        a();
        int i11 = this.f24244c;
        int length = this.f24243b.length;
        if (i11 == length) {
            int[] iArr = new int[i(length)];
            System.arraycopy(this.f24243b, 0, iArr, 0, this.f24244c);
            this.f24243b = iArr;
        }
        int[] iArr2 = this.f24243b;
        int i12 = this.f24244c;
        this.f24244c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzi(((Integer) obj).intValue());
        return true;
    }
}
