package com.google.android.gms.internal.ads;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4069k7 implements InterfaceC5832y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3943j7 f30698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P10 f30699b = new P10(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f30702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30703f;

    public C4069k7(InterfaceC3943j7 interfaceC3943j7) {
        this.f30698a = interfaceC3943j7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5832y7
    public final void a(L90 l90, L1 l10, C5706x7 c5706x7) {
        this.f30698a.a(l90, l10, c5706x7);
        this.f30703f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5832y7
    public final void b(P10 p10, int i10) {
        int iF;
        int i11 = i10 & 1;
        if (i11 != 0) {
            iF = p10.F() + p10.R();
        } else {
            iF = -1;
        }
        if (this.f30703f) {
            if (i11 == 0) {
                return;
            }
            this.f30703f = false;
            p10.G(iF);
            this.f30701d = 0;
        }
        while (p10.C() > 0) {
            int i12 = this.f30701d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iR = p10.R();
                    p10.G(p10.F() - 1);
                    if (iR == 255) {
                        this.f30703f = true;
                        return;
                    }
                }
                int iMin = Math.min(p10.C(), 3 - this.f30701d);
                P10 p11 = this.f30699b;
                p10.L(p11.H(), this.f30701d, iMin);
                int i13 = this.f30701d + iMin;
                this.f30701d = i13;
                if (i13 == 3) {
                    p11.G(0);
                    p11.E(3);
                    p11.J(1);
                    int iR2 = p11.R();
                    boolean z9 = (iR2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                    int iR3 = p11.R();
                    this.f30702e = z9;
                    this.f30700c = (((iR2 & 15) << 8) | iR3) + 3;
                    int I9 = p11.I();
                    int i14 = this.f30700c;
                    if (I9 < i14) {
                        int I10 = p11.I();
                        p11.B(Math.min(4098, Math.max(i14, I10 + I10)));
                    }
                }
            } else {
                int iMin2 = Math.min(p10.C(), this.f30700c - this.f30701d);
                P10 p12 = this.f30699b;
                p10.L(p12.H(), this.f30701d, iMin2);
                int i15 = this.f30701d + iMin2;
                this.f30701d = i15;
                int i16 = this.f30700c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f30702e) {
                        p12.E(i16);
                    } else {
                        if (AbstractC4634ob0.g(p12.H(), 0, i16, -1) != 0) {
                            this.f30703f = true;
                            return;
                        }
                        p12.E(this.f30700c - 4);
                    }
                    p12.G(0);
                    this.f30698a.b(p12);
                    this.f30701d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5832y7
    public final void zzb() {
        this.f30703f = true;
    }
}
