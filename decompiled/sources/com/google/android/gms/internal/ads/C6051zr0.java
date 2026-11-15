package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6051zr0 extends AbstractC1845Hr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35867b;

    C6051zr0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1845Hr0
    public final AbstractC1845Hr0 a(String str) {
        this.f35866a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1845Hr0
    public final AbstractC1845Hr0 b(String str) {
        this.f35867b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1845Hr0
    public final AbstractC1897Ir0 c() {
        return new C1481Ar0(this.f35866a, this.f35867b, null);
    }
}
