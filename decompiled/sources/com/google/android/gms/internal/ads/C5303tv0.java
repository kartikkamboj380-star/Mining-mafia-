package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5303tv0 extends AbstractC5931yu0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final AbstractC5931yu0 f33514f = new C5303tv0(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f33515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f33516e;

    C5303tv0(Object[] objArr, int i10) {
        this.f33515d = objArr;
        this.f33516e = i10;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final Object[] b() {
        return this.f33515d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int e() {
        return this.f33516e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2418Ss0.m(i10, this.f33516e, "index");
        Object obj = this.f33515d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5931yu0, com.google.android.gms.internal.ads.AbstractC5427uu0
    final int j(Object[] objArr, int i10) {
        Object[] objArr2 = this.f33515d;
        int i11 = this.f33516e;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33516e;
    }
}
