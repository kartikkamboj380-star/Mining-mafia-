package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6059zv0 extends AbstractC1903Iu0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f35879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final C6059zv0 f35880i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f35881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f35882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f35883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f35884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f35885g;

    static {
        Object[] objArr = new Object[0];
        f35879h = objArr;
        f35880i = new C6059zv0(objArr, 0, objArr, 0, 0);
    }

    C6059zv0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f35881c = objArr;
        this.f35882d = i10;
        this.f35883e = objArr2;
        this.f35884f = i11;
        this.f35885g = i12;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    public final AbstractC2112Mv0 a() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final Object[] b() {
        return this.f35881c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f35883e;
            if (objArr.length != 0) {
                int iB = AbstractC4924qu0.b(obj);
                while (true) {
                    int i10 = iB & this.f35884f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int e() {
        return this.f35885g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f35882d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return g().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int j(Object[] objArr, int i10) {
        Object[] objArr2 = this.f35881c;
        int i11 = this.f35885g;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f35885g;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0
    final boolean u() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1903Iu0
    final AbstractC5931yu0 v() {
        return AbstractC5931yu0.y(this.f35881c, this.f35885g);
    }
}
