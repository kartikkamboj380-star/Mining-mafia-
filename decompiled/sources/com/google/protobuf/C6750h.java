package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6750h extends AbstractC6743a implements Internal.DoubleList, RandomAccess, H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C6750h f41258c = new C6750h(new double[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f41259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41260b;

    C6750h() {
        this(new double[10], 0, true);
    }

    private void d(int i10, double d10) {
        int i11;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f41260b)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        double[] dArr = this.f41259a;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f41259a, i10, dArr2, i10 + 1, this.f41260b - i10);
            this.f41259a = dArr2;
        }
        this.f41259a[i10] = d10;
        this.f41260b++;
        ((AbstractList) this).modCount++;
    }

    public static C6750h e() {
        return f41258c;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f41260b) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f41260b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        d(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C6750h)) {
            return super.addAll(collection);
        }
        C6750h c6750h = (C6750h) collection;
        int i10 = c6750h.f41260b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f41260b;
        if (com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f41259a;
        if (i12 > dArr.length) {
            this.f41259a = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c6750h.f41259a, 0, this.f41259a, this.f41260b, c6750h.f41260b);
        this.f41260b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public void addDouble(double d10) {
        ensureIsMutable();
        int i10 = this.f41260b;
        double[] dArr = this.f41259a;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f41259a = dArr2;
        }
        double[] dArr3 = this.f41259a;
        int i11 = this.f41260b;
        this.f41260b = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
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
        if (!(obj instanceof C6750h)) {
            return super.equals(obj);
        }
        C6750h c6750h = (C6750h) obj;
        if (this.f41260b != c6750h.f41260b) {
            return false;
        }
        double[] dArr = c6750h.f41259a;
        for (int i10 = 0; i10 < this.f41260b; i10++) {
            if (Double.doubleToLongBits(this.f41259a[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double getDouble(int i10) {
        g(i10);
        return this.f41259a[i10];
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iHashLong = 1;
        for (int i10 = 0; i10 < this.f41260b; i10++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.f41259a[i10]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f41259a[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        ensureIsMutable();
        g(i10);
        double[] dArr = this.f41259a;
        double d10 = dArr[i10];
        int i11 = this.f41260b;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f41260b--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f41259a;
        System.arraycopy(dArr, i11, dArr, i10, this.f41260b - i11);
        this.f41260b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public double setDouble(int i10, double d10) {
        ensureIsMutable();
        g(i10);
        double[] dArr = this.f41259a;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41260b;
    }

    private C6750h(double[] dArr, int i10, boolean z9) {
        super(z9);
        this.f41259a = dArr;
        this.f41260b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f41260b) {
            return new C6750h(Arrays.copyOf(this.f41259a, i10), this.f41260b, true);
        }
        throw new IllegalArgumentException();
    }
}
