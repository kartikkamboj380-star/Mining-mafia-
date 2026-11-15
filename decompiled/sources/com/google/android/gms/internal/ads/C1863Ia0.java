package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ia0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1863Ia0 implements U4.a, OG, InterfaceC3082cG, ZF, InterfaceC4717pG, InterfaceC5096sH, S90, InterfaceC4599oK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4258lc0 f19575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f19576b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f19577c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f19578d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f19579e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f19580f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f19581g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicReference f19582h = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1863Ia0 f19583i = null;

    public C1863Ia0(C4258lc0 c4258lc0) {
        this.f19575a = c4258lc0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void F0() {
    }

    public final void K(H4.S0 s10) {
        this.f19582h.set(s10);
    }

    public final void N(InterfaceC2207Or interfaceC2207Or) {
        this.f19579e.set(interfaceC2207Or);
    }

    public final void P(C4163ks c4163ks) {
        this.f19580f.set(c4163ks);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.b();
        } else {
            J90.a(this.f19579e, C1707Fa0.f18795a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.d0();
        } else {
            J90.a(this.f19579e, C1603Da0.f18254a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4717pG
    public final void e(final H4.Z0 z9) {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.e(z9);
            return;
        }
        AtomicReference atomicReference = this.f19578d;
        J90.a(atomicReference, new I90() { // from class: com.google.android.gms.internal.ads.sa0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3535fs) obj).o1(z9);
            }
        });
        J90.a(atomicReference, new I90() { // from class: com.google.android.gms.internal.ads.ta0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3535fs) obj).x(z9.f1252a);
            }
        });
    }

    public final void g0(C1948Jr c1948Jr) {
        this.f19581g.set(c1948Jr);
    }

    @Override // com.google.android.gms.internal.ads.S90
    public final void h(S90 s90) {
        this.f19583i = (C1863Ia0) s90;
    }

    @Override // U4.a
    public final void i() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.i();
        } else {
            J90.a(this.f19576b, C1811Ha0.f19314a);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5096sH
    public final void j(final H4.o2 o2Var) {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.j(o2Var);
        } else {
            J90.a(this.f19582h, new I90() { // from class: com.google.android.gms.internal.ads.ua0
                @Override // com.google.android.gms.internal.ads.I90
                public final /* synthetic */ void zza(Object obj) {
                    ((H4.S0) obj).a6(o2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.k();
            return;
        }
        this.f19575a.b();
        J90.a(this.f19578d, C5765xa0.f34945a);
        J90.a(this.f19579e, C1551Ca0.f17911a);
    }

    public final void m(InterfaceC4037js interfaceC4037js) {
        this.f19577c.set(interfaceC4037js);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.o();
            return;
        }
        AtomicReference atomicReference = this.f19578d;
        J90.a(atomicReference, C6017za0.f35791a);
        J90.a(this.f19579e, C1499Ba0.f17662a);
        J90.a(atomicReference, C5639wa0.f34599a);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(final InterfaceC1896Ir interfaceC1896Ir, final String str, final String str2) {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.p(interfaceC1896Ir, str, str2);
            return;
        }
        J90.a(this.f19578d, new I90() { // from class: com.google.android.gms.internal.ads.oa0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                InterfaceC1896Ir interfaceC1896Ir2 = interfaceC1896Ir;
                ((InterfaceC3535fs) obj).R2(new BinderC5296ts(interfaceC1896Ir2.zzb(), interfaceC1896Ir2.zzc()));
            }
        });
        J90.a(this.f19580f, new I90() { // from class: com.google.android.gms.internal.ads.pa0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                InterfaceC1896Ir interfaceC1896Ir2 = interfaceC1896Ir;
                ((C4163ks) obj).H1(new BinderC5296ts(interfaceC1896Ir2.zzb(), interfaceC1896Ir2.zzc()), str, str2);
            }
        });
        J90.a(this.f19579e, new I90() { // from class: com.google.android.gms.internal.ads.qa0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC2207Or) obj).g2(interfaceC1896Ir);
            }
        });
        J90.a(this.f19581g, new I90() { // from class: com.google.android.gms.internal.ads.ra0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((C1948Jr) obj).H1(interfaceC1896Ir, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void t0() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.t0();
        } else {
            J90.a(this.f19578d, C5891ya0.f35396a);
        }
    }

    public final void u(InterfaceC3535fs interfaceC3535fs) {
        this.f19578d.set(interfaceC3535fs);
    }

    public final void v(U4.a aVar) {
        this.f19576b.set(aVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(final H4.Z0 z9) {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.w(z9);
            return;
        }
        final int i10 = z9.f1252a;
        AtomicReference atomicReference = this.f19577c;
        J90.a(atomicReference, new I90() { // from class: com.google.android.gms.internal.ads.va0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC4037js) obj).o(z9);
            }
        });
        J90.a(atomicReference, new I90() { // from class: com.google.android.gms.internal.ads.la0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC4037js) obj).n(i10);
            }
        });
        J90.a(this.f19579e, new I90() { // from class: com.google.android.gms.internal.ads.na0
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC2207Or) obj).E(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.zze();
        } else {
            J90.a(this.f19579e, C1655Ea0.f18526a);
        }
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        C1863Ia0 c1863Ia0 = this.f19583i;
        if (c1863Ia0 != null) {
            c1863Ia0.zzg();
        } else {
            J90.a(this.f19577c, C1447Aa0.f17376a);
            J90.a(this.f19579e, C1759Ga0.f19077a);
        }
    }
}
