package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class D6 implements I1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P10 f18078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4436n10 f18079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private L1 f18080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f18081f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f18084i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E6 f18076a = new E6(true, null, 0, "audio/mp4a-latm");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f18077b = new P10(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f18082g = -1;

    static {
        int i10 = C6.f17792a;
    }

    public D6(int i10) {
        P10 p10 = new P10(10);
        this.f18078c = p10;
        byte[] bArrH = p10.H();
        this.f18079d = new C4436n10(bArrH, bArrH.length);
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void d(long j10, long j11) {
        this.f18083h = false;
        this.f18076a.zza();
        this.f18081f = j11;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final boolean e(J1 j10) throws EOFException, InterruptedIOException {
        P10 p10;
        int i10 = 0;
        while (true) {
            p10 = this.f18078c;
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
        if (this.f18082g == -1) {
            this.f18082g = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            c5946z2.H(p10.H(), 0, 2, false);
            p10.G(0);
            if (E6.a(p10.S())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                c5946z2.H(p10.H(), 0, 4, false);
                C4436n10 c4436n10 = this.f18079d;
                c4436n10.f(14);
                int iJ = c4436n10.j(13);
                if (iJ <= 6) {
                    i13++;
                    j10.zzl();
                    c5946z2.c(i13, false);
                } else {
                    c5946z2.c(iJ - 6, false);
                    i12 += iJ;
                }
            } else {
                i13++;
                j10.zzl();
                c5946z2.c(i13, false);
            }
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final void f(L1 l10) {
        this.f18080e = l10;
        this.f18076a.m0(l10, new C5706x7(LinearLayoutManager.INVALID_OFFSET, 0, 1));
        l10.q();
    }

    @Override // com.google.android.gms.internal.ads.I1
    public final int g(J1 j10, C3933j2 c3933j2) {
        this.f18080e.getClass();
        P10 p10 = this.f18077b;
        int iF = j10.F(p10.H(), 0, 2048);
        if (!this.f18084i) {
            this.f18080e.o(new C4185l2(-9223372036854775807L, 0L));
            this.f18084i = true;
        }
        if (iF == -1) {
            return -1;
        }
        p10.G(0);
        p10.E(iF);
        if (!this.f18083h) {
            this.f18076a.n0(this.f18081f, 4);
            this.f18083h = true;
        }
        this.f18076a.o0(p10);
        return 0;
    }
}
