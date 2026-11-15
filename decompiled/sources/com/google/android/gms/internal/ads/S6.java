package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class S6 implements I6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC5570w2 f23126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23127d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23130g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23124a = "video/mp2t";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f23125b = new P10(10);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23128e = -9223372036854775807L;

    public S6(String str) {
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void l0(boolean z9) {
        int i10;
        this.f23126c.getClass();
        if (this.f23127d && (i10 = this.f23129f) != 0 && this.f23130g == i10) {
            AbstractC2418Ss0.i(this.f23128e != -9223372036854775807L);
            this.f23126c.c(this.f23128e, 1, this.f23129f, 0, null);
            this.f23127d = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void m0(L1 l10, C5706x7 c5706x7) {
        c5706x7.a();
        InterfaceC5570w2 interfaceC5570w2B = l10.b(c5706x7.b(), 5);
        this.f23126c = interfaceC5570w2B;
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.A(c5706x7.c());
        c5507vX0.k0(this.f23124a);
        c5507vX0.l0("application/id3");
        interfaceC5570w2B.f(c5507vX0.m());
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void n0(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f23127d = true;
        this.f23128e = j10;
        this.f23129f = 0;
        this.f23130g = 0;
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void o0(P10 p10) {
        this.f23126c.getClass();
        if (this.f23127d) {
            int iC = p10.C();
            int i10 = this.f23130g;
            if (i10 < 10) {
                int iMin = Math.min(iC, 10 - i10);
                byte[] bArrH = p10.H();
                int iF = p10.F();
                P10 p11 = this.f23125b;
                System.arraycopy(bArrH, iF, p11.H(), this.f23130g, iMin);
                if (this.f23130g + iMin == 10) {
                    p11.G(0);
                    if (p11.R() != 73 || p11.R() != 68 || p11.R() != 51) {
                        YU.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f23127d = false;
                        return;
                    } else {
                        p11.J(3);
                        this.f23129f = p11.g() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iC, this.f23129f - this.f23130g);
            this.f23126c.b(p10, iMin2);
            this.f23130g += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.I6
    public final void zza() {
        this.f23127d = false;
        this.f23128e = -9223372036854775807L;
    }
}
