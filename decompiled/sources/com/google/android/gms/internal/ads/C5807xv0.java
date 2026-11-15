package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5807xv0 extends AbstractC5931yu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f35063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f35064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f35065f;

    C5807xv0(Object[] objArr, int i10, int i11) {
        this.f35063d = objArr;
        this.f35064e = i10;
        this.f35065f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2418Ss0.m(i10, this.f35065f, "index");
        Object obj = this.f35063d[i10 + i10 + this.f35064e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35065f;
    }
}
