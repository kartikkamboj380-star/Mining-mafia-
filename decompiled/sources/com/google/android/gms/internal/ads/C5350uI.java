package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5350uI implements C4.e, U4.a, ZF, InterfaceC0580a, InterfaceC5096sH, InterfaceC5220tG, InterfaceC2833aH, J4.B, InterfaceC4717pG, InterfaceC4599oK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SH f33765a = new SH(this, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3432f20 f33766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3934j20 f33767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C2944b90 f33768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C1863Ia0 f33769e;

    private static void P(Object obj, InterfaceC5224tI interfaceC5224tI) {
        if (obj != null) {
            interfaceC5224tI.zza(obj);
        }
    }

    @Override // J4.B
    public final void B2() {
        P(this.f33768d, C3463fI.f28238a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void F0() {
        P(this.f33766b, ZH.f26141a);
    }

    @Override // J4.B
    public final void F4() {
        P(this.f33768d, C3715hI.f28895a);
    }

    @Override // J4.B
    public final void H1() {
    }

    final /* synthetic */ void K(C2944b90 c2944b90) {
        this.f33768d = c2944b90;
    }

    final /* synthetic */ void N(C1863Ia0 c1863Ia0) {
        this.f33769e = c1863Ia0;
    }

    @Override // J4.B
    public final void N0() {
    }

    @Override // J4.B
    public final void S3(final int i10) {
        P(this.f33768d, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.QH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C2944b90) obj).S3(i10);
            }
        });
    }

    @Override // J4.B
    public final void Z1() {
    }

    @Override // J4.B
    public final void Z2() {
        P(this.f33768d, C3589gI.f28614a);
    }

    @Override // J4.B
    public final void Z4() {
        P(this.f33768d, C3841iI.f29317a);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
        P(this.f33766b, WH.f24742a);
        P(this.f33769e, C4721pI.f32356a);
    }

    @Override // J4.B
    public final void b4() {
    }

    @Override // J4.B
    public final void c() {
        P(this.f33768d, C3337eI.f27733a);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
        P(this.f33766b, UH.f23975a);
        P(this.f33769e, C4469nI.f31767a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4717pG
    public final void e(final H4.Z0 z9) {
        P(this.f33769e, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.OH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C1863Ia0) obj).e(z9);
            }
        });
        P(this.f33766b, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.PH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C3432f20) obj).e(z9);
            }
        });
    }

    public final SH h() {
        return this.f33765a;
    }

    @Override // U4.a
    public final void i() {
        P(this.f33769e, C4972rI.f32872a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5096sH
    public final void j(final H4.o2 o2Var) {
        P(this.f33766b, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.LH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C3432f20) obj).j(o2Var);
            }
        });
        P(this.f33769e, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.MH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C1863Ia0) obj).j(o2Var);
            }
        });
        P(this.f33768d, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.NH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C2944b90) obj).j(o2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
        P(this.f33766b, TH.f23466a);
        P(this.f33769e, C4343mI.f31476a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        P(this.f33766b, C2961bI.f26778a);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
        P(this.f33766b, C3086cI.f27082a);
        P(this.f33769e, C5098sI.f33131a);
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        P(this.f33766b, YH.f25577a);
        P(this.f33767c, C4217lI.f31237a);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(final InterfaceC1896Ir interfaceC1896Ir, final String str, final String str2) {
        P(this.f33766b, new InterfaceC5224tI(interfaceC1896Ir, str, str2) { // from class: com.google.android.gms.internal.ads.RH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        P(this.f33769e, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.JH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C1863Ia0) obj).p(interfaceC1896Ir, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void t0() {
        P(this.f33766b, C2835aI.f26467a);
        P(this.f33767c, C4091kI.f30742a);
        P(this.f33769e, C4847qI.f32611a);
        P(this.f33768d, C3965jI.f30387a);
    }

    @Override // J4.B
    public final void t4() {
    }

    final /* synthetic */ void u(C3432f20 c3432f20) {
        this.f33766b = c3432f20;
    }

    @Override // C4.e
    public final void v(final String str, final String str2) {
        P(this.f33766b, new InterfaceC5224tI() { // from class: com.google.android.gms.internal.ads.KH
            @Override // com.google.android.gms.internal.ads.InterfaceC5224tI
            public final /* synthetic */ void zza(Object obj) {
                ((C3432f20) obj).v(str, str2);
            }
        });
    }

    final /* synthetic */ void w(C3934j20 c3934j20) {
        this.f33767c = c3934j20;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
        P(this.f33766b, VH.f24233a);
        P(this.f33769e, C4595oI.f32024a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2833aH
    public final void zzl() {
        P(this.f33768d, C3212dI.f27397a);
    }
}
