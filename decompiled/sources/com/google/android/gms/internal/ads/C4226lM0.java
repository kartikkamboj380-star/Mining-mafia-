package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lM0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4226lM0 extends AbstractC3344eL0 implements RandomAccess, InterfaceC3095cM0, GM0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f31252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C4226lM0 f31253e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f31254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31255c;

    static {
        long[] jArr = new long[0];
        f31252d = jArr;
        f31253e = new C4226lM0(jArr, 0, false);
    }

    private C4226lM0(long[] jArr, int i10, boolean z9) {
        super(z9);
        this.f31254b = jArr;
        this.f31255c = i10;
    }

    public static C4226lM0 d() {
        return f31253e;
    }

    private static int e(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f31255c) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private final String i(int i10) {
        int i11 = this.f31255c;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length());
        sb.append("Index:");
        sb.append(i10);
        sb.append(", Size:");
        sb.append(i11);
        return sb.toString();
    }

    public final long G(int i10) {
        g(i10);
        return this.f31254b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f31255c)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f31254b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[e(length)];
            System.arraycopy(this.f31254b, 0, jArr2, 0, i10);
            System.arraycopy(this.f31254b, i10, jArr2, i12, this.f31255c - i10);
            this.f31254b = jArr2;
        }
        this.f31254b[i10] = jLongValue;
        this.f31255c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC3346eM0.f27766b;
        collection.getClass();
        if (!(collection instanceof C4226lM0)) {
            return super.addAll(collection);
        }
        C4226lM0 c4226lM0 = (C4226lM0) collection;
        int i10 = c4226lM0.f31255c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f31255c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f31254b;
        if (i12 > jArr.length) {
            this.f31254b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c4226lM0.f31254b, 0, this.f31254b, this.f31255c, c4226lM0.f31255c);
        this.f31255c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long b(int i10, long j10) {
        a();
        g(i10);
        long[] jArr = this.f31254b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4226lM0)) {
            return super.equals(obj);
        }
        C4226lM0 c4226lM0 = (C4226lM0) obj;
        if (this.f31255c != c4226lM0.f31255c) {
            return false;
        }
        long[] jArr = c4226lM0.f31254b;
        for (int i10 = 0; i10 < this.f31255c; i10++) {
            if (this.f31254b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3095cM0
    public final void f(long j10) {
        a();
        int i10 = this.f31255c;
        int length = this.f31254b.length;
        if (i10 == length) {
            long[] jArr = new long[e(length)];
            System.arraycopy(this.f31254b, 0, jArr, 0, this.f31255c);
            this.f31254b = jArr;
        }
        long[] jArr2 = this.f31254b;
        int i11 = this.f31255c;
        this.f31255c = i11 + 1;
        jArr2[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f31254b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f31255c; i11++) {
            long j10 = this.f31254b[i11];
            byte[] bArr = AbstractC3346eM0.f27766b;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f31255c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f31254b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3221dM0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3095cM0 x(int i10) {
        if (i10 >= this.f31255c) {
            return new C4226lM0(i10 == 0 ? f31252d : Arrays.copyOf(this.f31254b, i10), this.f31255c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3344eL0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        g(i10);
        long[] jArr = this.f31254b;
        long j10 = jArr[i10];
        int i11 = this.f31255c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f31255c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f31254b;
        System.arraycopy(jArr, i11, jArr, i10, this.f31255c - i11);
        this.f31255c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        return Long.valueOf(b(i10, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31255c;
    }

    final void zzi(int i10) {
        int length = this.f31254b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f31254b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = e(length);
        }
        this.f31254b = Arrays.copyOf(this.f31254b, length);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
