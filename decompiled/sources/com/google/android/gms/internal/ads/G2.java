package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class G2 implements InterfaceC4311m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f18898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ I2 f18899b;

    public G2(I2 i10, long j10) {
        Objects.requireNonNull(i10);
        this.f18899b = i10;
        this.f18898a = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final C4059k2 a(long j10) {
        I2 i10 = this.f18899b;
        C4059k2 c4059k2G = i10.a()[0].g(j10);
        for (int i11 = 1; i11 < i10.a().length; i11++) {
            C4059k2 c4059k2G2 = i10.a()[i11].g(j10);
            if (c4059k2G2.f30676a.f31652b < c4059k2G.f30676a.f31652b) {
                c4059k2G = c4059k2G2;
            }
        }
        return c4059k2G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final long zza() {
        return this.f18898a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4311m2
    public final boolean zzb() {
        return true;
    }
}
