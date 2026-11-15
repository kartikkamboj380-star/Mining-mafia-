package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2944b90 implements InterfaceC3082cG, InterfaceC2833aH, S90, J4.B, InterfaceC5096sH, InterfaceC4717pG, InterfaceC4599oK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4258lc0 f26738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f26739b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f26740c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f26741d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f26742e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f26743f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f26744g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C2944b90 f26745h = null;

    public C2944b90(C4258lc0 c4258lc0) {
        this.f26738a = c4258lc0;
    }

    public static C2944b90 b(C2944b90 c2944b90) {
        C2944b90 c2944b91 = new C2944b90(c2944b90.f26738a);
        c2944b91.f26745h = c2944b90;
        return c2944b91;
    }

    @Override // J4.B
    public final void B2() {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.B2();
        } else {
            J90.a(this.f26743f, N80.f21075a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void F0() {
    }

    @Override // J4.B
    public final void F4() {
    }

    @Override // J4.B
    public final void H1() {
    }

    @Override // J4.B
    public final void N0() {
    }

    @Override // J4.B
    public final void S3(final int i10) {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.S3(i10);
        } else {
            J90.a(this.f26743f, new I90() { // from class: com.google.android.gms.internal.ads.T80
                @Override // com.google.android.gms.internal.ads.I90
                public final /* synthetic */ void zza(Object obj) {
                    ((J4.B) obj).S3(i10);
                }
            });
        }
    }

    @Override // J4.B
    public final void Z1() {
    }

    @Override // J4.B
    public final void Z2() {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.Z2();
        } else {
            J90.a(this.f26743f, O80.f21485a);
        }
    }

    @Override // J4.B
    public final void Z4() {
    }

    @Override // J4.B
    public final void b4() {
    }

    @Override // J4.B
    public final void c() {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.c();
            return;
        }
        J90.a(this.f26743f, P80.f22053a);
        AtomicReference atomicReference = this.f26741d;
        J90.a(atomicReference, X80.f25152a);
        J90.a(atomicReference, Y80.f25543a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4717pG
    public final void e(final H4.Z0 z9) {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.e(z9);
        } else {
            J90.a(this.f26741d, new I90() { // from class: com.google.android.gms.internal.ads.U80
                @Override // com.google.android.gms.internal.ads.I90
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC5900yf) obj).D0(z9);
                }
            });
        }
    }

    public final void g() {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.g();
            return;
        }
        this.f26738a.b();
        J90.a(this.f26740c, W80.f24717a);
        J90.a(this.f26741d, C2818a90.f26436a);
    }

    @Override // com.google.android.gms.internal.ads.S90
    public final void h(S90 s90) {
        this.f26745h = (C2944b90) s90;
    }

    public final void i(InterfaceC5396uf interfaceC5396uf) {
        this.f26739b.set(interfaceC5396uf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5096sH
    public final void j(final H4.o2 o2Var) {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.j(o2Var);
        } else {
            J90.a(this.f26744g, new I90() { // from class: com.google.android.gms.internal.ads.V80
                @Override // com.google.android.gms.internal.ads.I90
                public final /* synthetic */ void zza(Object obj) {
                    ((H4.S0) obj).a6(o2Var);
                }
            });
        }
    }

    public final void k(InterfaceC5900yf interfaceC5900yf) {
        this.f26741d.set(interfaceC5900yf);
    }

    public final void m(J4.B b10) {
        this.f26743f.set(b10);
    }

    public final void o(H4.S0 s10) {
        this.f26744g.set(s10);
    }

    public final void p(final InterfaceC4893qf interfaceC4893qf) {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.p(interfaceC4893qf);
        } else {
            J90.a(this.f26739b, new I90() { // from class: com.google.android.gms.internal.ads.Q80
                @Override // com.google.android.gms.internal.ads.I90
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC5396uf) obj).f5(interfaceC4893qf);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void t0() {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.t0();
        } else {
            J90.a(this.f26741d, Z80.f26122a);
        }
    }

    @Override // J4.B
    public final void t4() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(final H4.Z0 z9) {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.w(z9);
            return;
        }
        AtomicReference atomicReference = this.f26739b;
        J90.a(atomicReference, new I90() { // from class: com.google.android.gms.internal.ads.R80
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC5396uf) obj).j0(z9);
            }
        });
        J90.a(atomicReference, new I90() { // from class: com.google.android.gms.internal.ads.S80
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC5396uf) obj).G(z9.f1252a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2833aH
    public final void zzl() {
        C2944b90 c2944b90 = this.f26745h;
        if (c2944b90 != null) {
            c2944b90.zzl();
        } else {
            J90.a(this.f26742e, M80.f20775a);
        }
    }
}
