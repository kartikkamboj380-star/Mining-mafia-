package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6760s extends AbstractC6743a implements Internal.LongList, RandomAccess, H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C6760s f41284c = new C6760s(new long[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f41285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41286b;

    C6760s() {
        this(new long[10], 0, true);
    }

    private void d(int i10, long j10) {
        int i11;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f41286b)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        long[] jArr = this.f41285a;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f41285a, i10, jArr2, i10 + 1, this.f41286b - i10);
            this.f41285a = jArr2;
        }
        this.f41285a[i10] = j10;
        this.f41286b++;
        ((AbstractList) this).modCount++;
    }

    public static C6760s e() {
        return f41284c;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f41286b) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f41286b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        d(i10, l10.longValue());
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C6760s)) {
            return super.addAll(collection);
        }
        C6760s c6760s = (C6760s) collection;
        int i10 = c6760s.f41286b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f41286b;
        if (com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f41285a;
        if (i12 > jArr.length) {
            this.f41285a = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c6760s.f41285a, 0, this.f41285a, this.f41286b, c6760s.f41286b);
        this.f41286b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j10) {
        ensureIsMutable();
        int i10 = this.f41286b;
        long[] jArr = this.f41285a;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f41285a = jArr2;
        }
        long[] jArr3 = this.f41285a;
        int i11 = this.f41286b;
        this.f41286b = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        addLong(l10.longValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6760s)) {
            return super.equals(obj);
        }
        C6760s c6760s = (C6760s) obj;
        if (this.f41286b != c6760s.f41286b) {
            return false;
        }
        long[] jArr = c6760s.f41285a;
        for (int i10 = 0; i10 < this.f41286b; i10++) {
            if (this.f41285a[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i10) {
        g(i10);
        return this.f41285a[i10];
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f41286b; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.f41285a[i10]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f41285a[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        ensureIsMutable();
        g(i10);
        long[] jArr = this.f41285a;
        long j10 = jArr[i10];
        int i11 = this.f41286b;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f41286b--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(setLong(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f41285a;
        System.arraycopy(jArr, i11, jArr, i10, this.f41286b - i11);
        this.f41286b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i10, long j10) {
        ensureIsMutable();
        g(i10);
        long[] jArr = this.f41285a;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41286b;
    }

    private C6760s(long[] jArr, int i10, boolean z9) {
        super(z9);
        this.f41285a = jArr;
        this.f41286b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f41286b) {
            return new C6760s(Arrays.copyOf(this.f41285a, i10), this.f41286b, true);
        }
        throw new IllegalArgumentException();
    }
}
