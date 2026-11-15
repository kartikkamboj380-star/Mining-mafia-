package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6330t5 extends AbstractC6365x4 implements RandomAccess, InterfaceC6250k5, M5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f36911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C6330t5 f36912e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f36913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36914c;

    static {
        long[] jArr = new long[0];
        f36911d = jArr;
        f36912e = new C6330t5(jArr, 0, false);
    }

    private C6330t5(long[] jArr, int i10, boolean z9) {
        super(z9);
        this.f36913b = jArr;
        this.f36914c = i10;
    }

    public static C6330t5 b() {
        return f36912e;
    }

    private static int g(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f36914c) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private final String j(int i10) {
        return C6381z4.a(this.f36914c, i10, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6250k5
    public final long G(int i10) {
        i(i10);
        return this.f36913b[i10];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i10 < 0 || i10 > (i11 = this.f36914c)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f36913b;
        int length = jArr.length;
        if (i11 < length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[g(length)];
            System.arraycopy(this.f36913b, 0, jArr2, 0, i10);
            System.arraycopy(this.f36913b, i10, jArr2, i12, this.f36914c - i10);
            this.f36913b = jArr2;
        }
        this.f36913b[i10] = jLongValue;
        this.f36914c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = AbstractC6268m5.f36752b;
        collection.getClass();
        if (!(collection instanceof C6330t5)) {
            return super.addAll(collection);
        }
        C6330t5 c6330t5 = (C6330t5) collection;
        int i10 = c6330t5.f36914c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f36914c;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f36913b;
        if (i12 > jArr.length) {
            this.f36913b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c6330t5.f36913b, 0, this.f36913b, this.f36914c, c6330t5.f36914c);
        this.f36914c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j10) {
        a();
        int i10 = this.f36914c;
        int length = this.f36913b.length;
        if (i10 == length) {
            long[] jArr = new long[g(length)];
            System.arraycopy(this.f36913b, 0, jArr, 0, this.f36914c);
            this.f36913b = jArr;
        }
        long[] jArr2 = this.f36913b;
        int i11 = this.f36914c;
        this.f36914c = i11 + 1;
        jArr2[i11] = j10;
    }

    final void e(int i10) {
        int length = this.f36913b.length;
        if (i10 <= length) {
            return;
        }
        if (length == 0) {
            this.f36913b = new long[Math.max(i10, 10)];
            return;
        }
        while (length < i10) {
            length = g(length);
        }
        this.f36913b = Arrays.copyOf(this.f36913b, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6330t5)) {
            return super.equals(obj);
        }
        C6330t5 c6330t5 = (C6330t5) obj;
        if (this.f36914c != c6330t5.f36914c) {
            return false;
        }
        long[] jArr = c6330t5.f36913b;
        for (int i10 = 0; i10 < this.f36914c; i10++) {
            if (this.f36913b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        i(i10);
        return Long.valueOf(this.f36913b[i10]);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f36914c; i11++) {
            long j10 = this.f36913b[i11];
            byte[] bArr = AbstractC6268m5.f36752b;
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
        int i10 = this.f36914c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f36913b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6365x4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        i(i10);
        long[] jArr = this.f36913b;
        long j10 = jArr[i10];
        int i11 = this.f36914c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f36914c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i10, int i11) {
        a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f36913b;
        System.arraycopy(jArr, i11, jArr, i10, this.f36914c - i11);
        this.f36914c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        i(i10);
        long[] jArr = this.f36913b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36914c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6259l5
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final InterfaceC6250k5 X(int i10) {
        if (i10 >= this.f36914c) {
            return new C6330t5(i10 == 0 ? f36911d : Arrays.copyOf(this.f36913b, i10), this.f36914c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
