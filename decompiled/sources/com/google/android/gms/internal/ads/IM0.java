package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class IM0 extends AbstractC3344eL0 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f19535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final IM0 f19536e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f19537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19538c;

    static {
        Object[] objArr = new Object[0];
        f19535d = objArr;
        f19536e = new IM0(objArr, 0, false);
    }

    private IM0(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f19537b = objArr;
        this.f19538c = i10;
    }

    public static IM0 b() {
        return f19536e;
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f19538c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private final String i(int i10) {
        int i11 = this.f19538c;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length());
        sb.append("Index:");
        sb.append(i10);
        sb.append(", Size:");
        sb.append(i11);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f19538c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f19537b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f19537b, 0, objArr2, 0, i10);
            System.arraycopy(this.f19537b, i10, objArr2, i12, this.f19538c - i10);
            this.f19537b = objArr2;
        }
        this.f19537b[i10] = obj;
        this.f19538c++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i10) {
        int length = this.f19537b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f19537b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.f19537b = Arrays.copyOf(this.f19537b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return this.f19537b[i10];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f19537b;
        Object obj = objArr[i10];
        int i11 = this.f19538c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f19538c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f19537b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19538c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3221dM0
    public final /* bridge */ /* synthetic */ InterfaceC3221dM0 x(int i10) {
        if (i10 >= this.f19538c) {
            return new IM0(i10 == 0 ? f19535d : Arrays.copyOf(this.f19537b, i10), this.f19538c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f19538c;
        int length = this.f19537b.length;
        if (i10 == length) {
            this.f19537b = Arrays.copyOf(this.f19537b, e(length));
        }
        Object[] objArr = this.f19537b;
        int i11 = this.f19538c;
        this.f19538c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
