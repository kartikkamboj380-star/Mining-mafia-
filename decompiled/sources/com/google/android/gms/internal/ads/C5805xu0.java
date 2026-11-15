package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5805xu0 extends AbstractC5931yu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f35059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f35060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC5931yu0 f35061f;

    C5805xu0(AbstractC5931yu0 abstractC5931yu0, int i10, int i11) {
        Objects.requireNonNull(abstractC5931yu0);
        this.f35061f = abstractC5931yu0;
        this.f35059d = i10;
        this.f35060e = i11;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final Object[] b() {
        return this.f35061f.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int d() {
        return this.f35061f.d() + this.f35059d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final int e() {
        return this.f35061f.d() + this.f35059d + this.f35060e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2418Ss0.m(i10, this.f35060e, "index");
        return this.f35061f.get(i10 + this.f35059d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5427uu0
    final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5931yu0
    /* JADX INFO: renamed from: k */
    public final AbstractC5931yu0 subList(int i10, int i11) {
        AbstractC2418Ss0.o(i10, i11, this.f35060e);
        int i12 = this.f35059d;
        return this.f35061f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35060e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5931yu0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
