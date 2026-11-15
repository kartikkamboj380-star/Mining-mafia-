package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5704x6 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5830y6 f34731a = new C5830y6(null, 0, "audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f34732b = new P10(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34733c;

    static {
        int i10 = AbstractC5578w6.f34473a;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f34733c = false;
        this.f34731a.zza();
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        P10 p10 = new P10(10);
        int i10 = 0;
        while (true) {
            C5946z1 c5946z1 = (C5946z1) j10;
            c5946z1.H(p10.H(), 0, 10, false);
            p10.G(0);
            if (p10.W() != 4801587) {
                break;
            }
            p10.J(3);
            int iG = p10.g();
            i10 += iG + 10;
            c5946z1.c(iG, false);
        }
        j10.zzl();
        C5946z1 c5946z2 = (C5946z1) j10;
        c5946z2.c(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            c5946z2.H(p10.H(), 0, 6, false);
            p10.G(0);
            if (p10.S() != 2935) {
                j10.zzl();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                c5946z2.c(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iD = AbstractC3807i1.d(p10.H());
                if (iD == -1) {
                    return false;
                }
                c5946z2.c(iD - 6, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f34731a.m0(l10, new C5706x7(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        l10.q();
        l10.o(new C4185l2(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        P10 p10 = this.f34732b;
        int iF = j10.F(p10.H(), 0, 2786);
        if (iF == -1) {
            return -1;
        }
        p10.G(0);
        p10.E(iF);
        if (!this.f34733c) {
            this.f34731a.n0(0L, 4);
            this.f34733c = true;
        }
        this.f34731a.o0(p10);
        return 0;
    }
}
