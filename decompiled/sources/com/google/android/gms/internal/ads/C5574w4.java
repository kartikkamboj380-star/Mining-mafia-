package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5574w4 implements InterfaceC5070s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f34462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f34466e;

    public C5574w4(C5779xh0 c5779xh0) {
        P10 p10 = c5779xh0.f34987b;
        this.f34462a = p10;
        p10.G(12);
        this.f34464c = p10.h() & 255;
        this.f34463b = p10.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5070s4
    public final int zza() {
        return this.f34463b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5070s4
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5070s4
    public final int zzc() {
        int i10 = this.f34464c;
        if (i10 == 8) {
            return this.f34462a.R();
        }
        if (i10 == 16) {
            return this.f34462a.S();
        }
        int i11 = this.f34465d;
        this.f34465d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f34466e & 15;
        }
        int iR = this.f34462a.R();
        this.f34466e = iR;
        return (iR & 240) >> 4;
    }
}
