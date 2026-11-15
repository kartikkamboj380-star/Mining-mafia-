package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5179sw0 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f33274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f33275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f33276c;

    C5179sw0(int[] iArr, int i10, int i11) {
        this.f33274a = iArr;
        this.f33275b = i10;
        this.f33276c = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && AbstractC5305tw0.i(this.f33274a, ((Integer) obj).intValue(), this.f33275b, this.f33276c) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5179sw0)) {
            return super.equals(obj);
        }
        C5179sw0 c5179sw0 = (C5179sw0) obj;
        int i10 = this.f33276c;
        int i11 = this.f33275b;
        int i12 = c5179sw0.f33276c;
        int i13 = c5179sw0.f33275b;
        int i14 = i10 - i11;
        if (i12 - i13 != i14) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (this.f33274a[i11 + i15] != c5179sw0.f33274a[i13 + i15]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11 = this.f33276c;
        int i12 = this.f33275b;
        AbstractC2418Ss0.m(i10, i11 - i12, "index");
        return Integer.valueOf(this.f33274a[i12 + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode = 1;
        for (int i10 = this.f33275b; i10 < this.f33276c; i10++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f33274a[i10]);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int[] iArr = this.f33274a;
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f33275b;
        int i11 = AbstractC5305tw0.i(iArr, iIntValue, i10, this.f33276c);
        if (i11 >= 0) {
            return i11 - i10;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.f33274a;
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f33275b;
            int i11 = this.f33276c - 1;
            while (i11 >= i10) {
                if (iArr[i11] != iIntValue) {
                    i11--;
                } else if (i11 >= 0) {
                    return i11 - i10;
                }
            }
            i11 = -1;
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int i11 = this.f33276c;
        int i12 = this.f33275b;
        Integer num = (Integer) obj;
        AbstractC2418Ss0.m(i10, i11 - i12, "index");
        int[] iArr = this.f33274a;
        int i13 = i12 + i10;
        int i14 = iArr[i13];
        num.getClass();
        iArr[i13] = num.intValue();
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33276c - this.f33275b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.f33274a, this.f33275b, this.f33276c, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f33276c;
        int i13 = this.f33275b;
        AbstractC2418Ss0.o(i10, i11, i12 - i13);
        return i10 == i11 ? Collections.EMPTY_LIST : new C5179sw0(this.f33274a, i10 + i13, i13 + i11);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i10 = this.f33276c;
        int i11 = this.f33275b;
        StringBuilder sb = new StringBuilder((i10 - i11) * 5);
        sb.append('[');
        int[] iArr = this.f33274a;
        sb.append(iArr[i11]);
        while (true) {
            i11++;
            if (i11 >= i10) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i11]);
        }
    }
}
