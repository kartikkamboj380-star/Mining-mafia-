package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3774hl0 implements InterfaceC3020bl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f29105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f29106b;

    C3774hl0(int i10, byte[] bArr) {
        this.f29105a = i10;
        this.f29106b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3020bl0
    public final int zza() {
        return this.f29105a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3020bl0
    public final String zzb() {
        return new String(this.f29106b);
    }
}
