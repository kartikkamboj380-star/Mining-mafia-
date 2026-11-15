package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.protobuf.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C6755m extends AbstractC6743a implements Internal.FloatList, RandomAccess, H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C6755m f41265c = new C6755m(new float[0], 0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f41266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41267b;

    C6755m() {
        this(new float[10], 0, true);
    }

    private void d(int i10, float f10) {
        int i11;
        ensureIsMutable();
        if (i10 < 0 || i10 > (i11 = this.f41267b)) {
            throw new IndexOutOfBoundsException(j(i10));
        }
        float[] fArr = this.f41266a;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f41266a, i10, fArr2, i10 + 1, this.f41267b - i10);
            this.f41266a = fArr2;
        }
        this.f41266a[i10] = f10;
        this.f41267b++;
        ((AbstractList) this).modCount++;
    }

    public static C6755m e() {
        return f41265c;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f41267b) {
            throw new IndexOutOfBoundsException(j(i10));
        }
    }

    private String j(int i10) {
        return "Index:" + i10 + ", Size:" + this.f41267b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        d(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C6755m)) {
            return super.addAll(collection);
        }
        C6755m c6755m = (C6755m) collection;
        int i10 = c6755m.f41267b;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f41267b;
        if (com.google.android.gms.common.api.Api.BaseClientBuilder.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f41266a;
        if (i12 > fArr.length) {
            this.f41266a = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c6755m.f41266a, 0, this.f41266a, this.f41267b, c6755m.f41267b);
        this.f41267b = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float f10) {
        ensureIsMutable();
        int i10 = this.f41267b;
        float[] fArr = this.f41266a;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f41266a = fArr2;
        }
        float[] fArr3 = this.f41266a;
        int i11 = this.f41267b;
        this.f41267b = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
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
        if (!(obj instanceof C6755m)) {
            return super.equals(obj);
        }
        C6755m c6755m = (C6755m) obj;
        if (this.f41267b != c6755m.f41267b) {
            return false;
        }
        float[] fArr = c6755m.f41266a;
        for (int i10 = 0; i10 < this.f41267b; i10++) {
            if (Float.floatToIntBits(this.f41266a[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int i10) {
        g(i10);
        return this.f41266a[i10];
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f41267b; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f41266a[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f41266a[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC6743a, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        ensureIsMutable();
        g(i10);
        float[] fArr = this.f41266a;
        float f10 = fArr[i10];
        int i11 = this.f41267b;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f41267b--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        ensureIsMutable();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f41266a;
        System.arraycopy(fArr, i11, fArr, i10, this.f41267b - i11);
        this.f41267b -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int i10, float f10) {
        ensureIsMutable();
        g(i10);
        float[] fArr = this.f41266a;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41267b;
    }

    private C6755m(float[] fArr, int i10, boolean z9) {
        super(z9);
        this.f41266a = fArr;
        this.f41267b = i10;
    }

    @Override // com.google.protobuf.Internal.ProtobufList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i10) {
        if (i10 >= this.f41267b) {
            return new C6755m(Arrays.copyOf(this.f41266a, i10), this.f41267b, true);
        }
        throw new IllegalArgumentException();
    }
}
