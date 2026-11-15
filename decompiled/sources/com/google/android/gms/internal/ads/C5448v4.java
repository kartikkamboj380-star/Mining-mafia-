package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5448v4 implements InterfaceC5070s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f33983c;

    public C5448v4(C5779xh0 c5779xh0, JY0 jy0) {
        P10 p10 = c5779xh0.f34987b;
        this.f33983c = p10;
        p10.G(12);
        int iH = p10.h();
        if ("audio/raw".equals(jy0.f19929o)) {
            int iD = AbstractC4634ob0.d(jy0.f19908I) * jy0.f19906G;
            if (iH == 0 || iH % iD != 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iD).length() + 66 + String.valueOf(iH).length());
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(iD);
                sb.append(", stsz sample size: ");
                sb.append(iH);
                YU.c("BoxParsers", sb.toString());
                iH = iD;
            }
        }
        this.f33981a = iH == 0 ? -1 : iH;
        this.f33982b = p10.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5070s4
    public final int zza() {
        return this.f33982b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5070s4
    public final int zzb() {
        return this.f33981a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5070s4
    public final int zzc() {
        int i10 = this.f33981a;
        return i10 == -1 ? this.f33983c.h() : i10;
    }
}
