package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3230dR implements IH, OG, InterfaceC3082cG, InterfaceC5220tG, InterfaceC0580a, VI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2703Yf f27413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27414b = false;

    public C3230dR(C2703Yf c2703Yf, Z90 z90) {
        this.f27413a = c2703Yf;
        c2703Yf.c(2);
        if (z90 != null) {
            c2703Yf.c(1101);
        }
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void G0(final C3011bh c3011bh) {
        InterfaceC2651Xf interfaceC2651Xf = new InterfaceC2651Xf() { // from class: com.google.android.gms.internal.ads.bR
            @Override // com.google.android.gms.internal.ads.InterfaceC2651Xf
            public final /* synthetic */ void a(C1772Gh c1772Gh) {
                c1772Gh.I(c3011bh);
            }
        };
        C2703Yf c2703Yf = this.f27413a;
        c2703Yf.b(interfaceC2651Xf);
        c2703Yf.c(1104);
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void K(boolean z9) {
        this.f27413a.c(true != z9 ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void N(final C3011bh c3011bh) {
        InterfaceC2651Xf interfaceC2651Xf = new InterfaceC2651Xf() { // from class: com.google.android.gms.internal.ads.ZQ
            @Override // com.google.android.gms.internal.ads.InterfaceC2651Xf
            public final /* synthetic */ void a(C1772Gh c1772Gh) {
                c1772Gh.I(c3011bh);
            }
        };
        C2703Yf c2703Yf = this.f27413a;
        c2703Yf.b(interfaceC2651Xf);
        c2703Yf.c(1103);
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void g0(boolean z9) {
        this.f27413a.c(true != z9 ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(final C5011rb0 c5011rb0) {
        this.f27413a.b(new InterfaceC2651Xf() { // from class: com.google.android.gms.internal.ads.cR
            @Override // com.google.android.gms.internal.ads.InterfaceC2651Xf
            public final /* synthetic */ void a(C1772Gh c1772Gh) {
                C3637gg c3637gg = (C3637gg) c1772Gh.E().Q();
                C5400uh c5400uh = (C5400uh) c1772Gh.E().j0().Q();
                c5400uh.A(c5011rb0.f32991b.f32672b.f29455b);
                c3637gg.B(c5400uh);
                c1772Gh.F(c3637gg);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final synchronized void m() {
        this.f27413a.c(6);
    }

    @Override // H4.InterfaceC0580a
    public final synchronized void onAdClicked() {
        if (this.f27414b) {
            this.f27413a.c(8);
        } else {
            this.f27413a.c(7);
            this.f27414b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(H4.Z0 z9) {
        switch (z9.f1252a) {
            case 1:
                this.f27413a.c(101);
                break;
            case 2:
                this.f27413a.c(102);
                break;
            case 3:
                this.f27413a.c(5);
                break;
            case 4:
                this.f27413a.c(103);
                break;
            case 5:
                this.f27413a.c(104);
                break;
            case 6:
                this.f27413a.c(105);
                break;
            case 7:
                this.f27413a.c(106);
                break;
            default:
                this.f27413a.c(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void w0(final C3011bh c3011bh) {
        InterfaceC2651Xf interfaceC2651Xf = new InterfaceC2651Xf() { // from class: com.google.android.gms.internal.ads.aR
            @Override // com.google.android.gms.internal.ads.InterfaceC2651Xf
            public final /* synthetic */ void a(C1772Gh c1772Gh) {
                c1772Gh.I(c3011bh);
            }
        };
        C2703Yf c2703Yf = this.f27413a;
        c2703Yf.b(interfaceC2651Xf);
        c2703Yf.c(1102);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        this.f27413a.c(3);
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void zzo() {
        this.f27413a.c(1109);
    }
}
