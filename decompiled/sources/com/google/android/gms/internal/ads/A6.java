package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class A6 implements I1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B6 f17241a = new B6(null, 0, "audio/ac4");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f17242b = new P10(16384);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17243c;

    static {
        int i10 = AbstractC5956z6.f35643a;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f17243c = false;
        this.f17241a.zza();
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        int i10;
        P10 p10 = new P10(10);
        int i11 = 0;
        while (true) {
            C5946z1 c5946z1 = (C5946z1) j10;
            c5946z1.H(p10.H(), 0, 10, false);
            p10.G(0);
            if (p10.W() != 4801587) {
                break;
            }
            p10.J(3);
            int iG = p10.g();
            i11 += iG + 10;
            c5946z1.c(iG, false);
        }
        j10.zzl();
        C5946z1 c5946z2 = (C5946z1) j10;
        c5946z2.c(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            c5946z2.H(p10.H(), 0, 7, false);
            p10.G(0);
            int iS = p10.S();
            if (iS == 44096 || iS == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArrH = p10.H();
                int i15 = AbstractC4183l1.f31154b;
                if (bArrH.length < 7) {
                    i10 = -1;
                } else {
                    int i16 = ((bArrH[2] & 255) << 8) | (bArrH[3] & 255);
                    if (i16 == 65535) {
                        i16 = ((bArrH[4] & 255) << 16) | ((bArrH[5] & 255) << 8) | (bArrH[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (iS == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                c5946z2.c(i10 - 7, false);
            } else {
                j10.zzl();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                c5946z2.c(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f17241a.m0(l10, new C5706x7(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        l10.q();
        l10.o(new C4185l2(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        P10 p10 = this.f17242b;
        int iF = j10.F(p10.H(), 0, 16384);
        if (iF == -1) {
            return -1;
        }
        p10.G(0);
        p10.E(iF);
        if (!this.f17243c) {
            this.f17241a.n0(0L, 4);
            this.f17243c = true;
        }
        this.f17241a.o0(p10);
        return 0;
    }
}
