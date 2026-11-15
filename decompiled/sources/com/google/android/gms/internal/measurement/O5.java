package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class O5 extends AbstractC6365x4 implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object[] f36434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final O5 f36435e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f36436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36437c;

    static {
        Object[] objArr = new Object[0];
        f36434d = objArr;
        f36435e = new O5(objArr, 0, false);
    }

    private O5(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f36436b = objArr;
        this.f36437c = i10;
    }

    public static O5 b() {
        return f36435e;
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f36437c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private final String i(int i10) {
        return C6381z4.a(this.f36437c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6259l5
    public final /* bridge */ /* synthetic */ InterfaceC6259l5 X(int i10) {
        if (i10 >= this.f36437c) {
            return new O5(i10 == 0 ? f36434d : Arrays.copyOf(this.f36436b, i10), this.f36437c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 < 0 || i10 > (i11 = this.f36437c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f36436b;
        int length = objArr.length;
        if (i11 < length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[e(length)];
            System.arraycopy(this.f36436b, 0, objArr2, 0, i10);
            System.arraycopy(this.f36436b, i10, objArr2, i12, this.f36437c - i10);
            this.f36436b = objArr2;
        }
        this.f36436b[i10] = obj;
        this.f36437c++;
        ((AbstractList) this).modCount++;
    }

    final void d(int i10) {
        int length = this.f36436b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f36436b = new Object[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.f36436b = Arrays.copyOf(this.f36436b, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        g(i10);
        return this.f36436b[i10];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        g(i10);
        Object[] objArr = this.f36436b;
        Object obj = objArr[i10];
        int i11 = this.f36437c;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f36437c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        g(i10);
        Object[] objArr = this.f36436b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36437c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f36437c;
        int length = this.f36436b.length;
        if (i10 == length) {
            this.f36436b = Arrays.copyOf(this.f36436b, e(length));
        }
        Object[] objArr = this.f36436b;
        int i11 = this.f36437c;
        this.f36437c = i11 + 1;
        objArr[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
