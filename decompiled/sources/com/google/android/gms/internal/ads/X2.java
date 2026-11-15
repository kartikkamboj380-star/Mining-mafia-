package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
final class X2 extends AbstractC3056c3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f25068e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25071d;

    public X2(InterfaceC5570w2 interfaceC5570w2) {
        super(interfaceC5570w2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3056c3
    protected final boolean a(P10 p10) throws C2931b3 {
        if (this.f25069b) {
            p10.J(1);
        } else {
            int iR = p10.R();
            int i10 = iR >> 4;
            this.f25071d = i10;
            if (i10 == 2) {
                int i11 = f25068e[(iR >> 2) & 3];
                C5507vX0 c5507vX0 = new C5507vX0();
                c5507vX0.k0("video/x-flv");
                c5507vX0.l0("audio/mpeg");
                c5507vX0.e(1);
                c5507vX0.f(i11);
                this.f27008a.f(c5507vX0.m());
                this.f25070c = true;
            } else if (i10 == 7 || i10 == 8) {
                C5507vX0 c5507vX1 = new C5507vX0();
                c5507vX1.k0("video/x-flv");
                c5507vX1.l0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                c5507vX1.e(1);
                c5507vX1.f(8000);
                this.f27008a.f(c5507vX1.m());
                this.f25070c = true;
            } else if (i10 != 10) {
                StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i10);
                throw new C2931b3(sb.toString());
            }
            this.f25069b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3056c3
    protected final boolean b(P10 p10, long j10) {
        if (this.f25071d == 2) {
            int iC = p10.C();
            InterfaceC5570w2 interfaceC5570w2 = this.f27008a;
            interfaceC5570w2.b(p10, iC);
            interfaceC5570w2.c(j10, 1, iC, 0, null);
            return true;
        }
        int iR = p10.R();
        if (iR != 0 || this.f25070c) {
            if (this.f25071d == 10 && iR != 1) {
                return false;
            }
            int iC2 = p10.C();
            InterfaceC5570w2 interfaceC5570w3 = this.f27008a;
            interfaceC5570w3.b(p10, iC2);
            interfaceC5570w3.c(j10, 1, iC2, 0, null);
            return true;
        }
        int iC3 = p10.C();
        byte[] bArr = new byte[iC3];
        p10.L(bArr, 0, iC3);
        C3429f1 c3429f1A = AbstractC3555g1.a(bArr);
        C5507vX0 c5507vX0 = new C5507vX0();
        c5507vX0.k0("video/x-flv");
        c5507vX0.l0("audio/mp4a-latm");
        c5507vX0.i0(c3429f1A.f28124c);
        c5507vX0.e(c3429f1A.f28123b);
        c5507vX0.f(c3429f1A.f28122a);
        c5507vX0.o0(Collections.singletonList(bArr));
        this.f27008a.f(c5507vX0.m());
        this.f25070c = true;
        return false;
    }
}
