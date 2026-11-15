package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6214g5 extends AbstractC6365x4 implements RandomAccess, InterfaceC6241j5, M5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f36692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C6214g5 f36693e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f36694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36695c;

    static {
        int[] iArr = new int[0];
        f36692d = iArr;
        f36693e = new C6214g5(iArr, 0, false);
    }

    private C6214g5(int[] iArr, int i10, boolean z9) {
        super(z9);
        this.f36694b = iArr;
        this.f36695c = i10;
    }

    public static C6214g5 b() {
        return f36693e;
    }

    private static int g(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f36695c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private final String j(int i10) {
        return C6381z4.a(this.f36695c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f36695c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f36694b;
        int length = iArr.length;
        if (i11 < length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[g(length)];
            System.arraycopy(this.f36694b, 0, iArr2, 0, i10);
            System.arraycopy(this.f36694b, i10, iArr2, i12, this.f36695c - i10);
            this.f36694b = iArr2;
        }
        this.f36694b[i10] = iIntValue;
        this.f36695c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC6268m5.f36752b;
        collection.getClass();
        if (!(collection instanceof C6214g5)) {
            return super.addAll(collection);
        }
        C6214g5 c6214g5 = (C6214g5) collection;
        int i10 = c6214g5.f36695c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f36695c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f36694b;
        if (i12 > iArr.length) {
            this.f36694b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c6214g5.f36694b, 0, this.f36694b, this.f36695c, c6214g5.f36695c);
        this.f36695c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        i(i10);
        return this.f36694b[i10];
    }

    public final void e(int i10) {
        a();
        int i11 = this.f36695c;
        int length = this.f36694b.length;
        if (i11 == length) {
            int[] iArr = new int[g(length)];
            System.arraycopy(this.f36694b, 0, iArr, 0, this.f36695c);
            this.f36694b = iArr;
        }
        int[] iArr2 = this.f36694b;
        int i12 = this.f36695c;
        this.f36695c = i12 + 1;
        iArr2[i12] = i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6214g5)) {
            return super.equals(obj);
        }
        C6214g5 c6214g5 = (C6214g5) obj;
        if (this.f36695c != c6214g5.f36695c) {
            return false;
        }
        int[] iArr = c6214g5.f36694b;
        for (int i10 = 0; i10 < this.f36695c; i10++) {
            if (this.f36694b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        i(i10);
        return Integer.valueOf(this.f36694b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6259l5
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC6241j5 X(int i10) {
        if (i10 >= this.f36695c) {
            return new C6214g5(i10 == 0 ? f36692d : Arrays.copyOf(this.f36694b, i10), this.f36695c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f36695c; i11++) {
            i10 = (i10 * 31) + this.f36694b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f36695c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f36694b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        i(i10);
        int[] iArr = this.f36694b;
        int i11 = iArr[i10];
        int i12 = this.f36695c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f36695c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f36694b;
        System.arraycopy(iArr, i11, iArr, i10, this.f36695c - i11);
        this.f36695c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        i(i10);
        int[] iArr = this.f36694b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36695c;
    }

    final void zzi(int i10) {
        int length = this.f36694b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f36694b = new int[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = g(length);
        }
        this.f36694b = Arrays.copyOf(this.f36694b, length);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
