package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3180d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P10 f27315a = new P10(10);

    private final boolean b(J1 j10, int i10) {
        int i11;
        int i12 = 0;
        do {
            int i13 = i12 % 10;
            if (i13 == 0) {
                if (i12 != 0) {
                    P10 p10 = this.f27315a;
                    System.arraycopy(p10.H(), 10, p10.H(), 0, 9);
                }
                i11 = 0;
            } else {
                i11 = i13;
            }
            int i14 = i12 != 0 ? 1 : 10;
            try {
                P10 p11 = this.f27315a;
                int i15 = i13 + 10;
                j10.J(p11.H(), i15 - i14, i14);
                p11.G(i11);
                p11.E(i15);
                if (p11.P() == 4801587) {
                    return true;
                }
                if (AbstractC3557g2.a(p11.Q()) != -1) {
                    return false;
                }
                if (i12 == 0) {
                    p11.B(20);
                }
                i12++;
            } catch (EOFException unused) {
            }
        } while (i12 <= i10);
        return false;
    }

    public final V6 a(J1 j10, A3 a10, int i10) {
        V6 v6A = null;
        int i11 = 0;
        while (b(j10, i10)) {
            P10 p10 = this.f27315a;
            int iF = p10.F();
            p10.J(6);
            int iG = p10.g();
            int i12 = iG + 10;
            if (v6A == null) {
                byte[] bArr = new byte[i12];
                System.arraycopy(p10.H(), iF, bArr, 0, 10);
                j10.J(bArr, 10, iG);
                v6A = D3.a(bArr, i12, a10, new C4313m3());
            } else {
                j10.E(iG);
            }
            i11 += i12;
        }
        j10.zzl();
        j10.E(i11);
        return v6A;
    }
}
