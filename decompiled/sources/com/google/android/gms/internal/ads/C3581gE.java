package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3581gE implements OG, InterfaceC0580a, IH, InterfaceC5220tG, ZF, VI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f28603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5676wt f28604b;

    public C3581gE(Clock clock, C5676wt c5676wt) {
        this.f28603a = clock;
        this.f28604b = c5676wt;
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void G0(C3011bh c3011bh) {
        this.f28604b.c();
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void K(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void N(C3011bh c3011bh) {
        this.f28604b.b();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
    }

    public final void e(H4.h2 h2Var) {
        this.f28604b.a(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void g0(boolean z9) {
    }

    public final String h() {
        return this.f28604b.j();
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
        this.f28604b.d(this.f28603a.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
        this.f28604b.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        this.f28604b.e();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        this.f28604b.f();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(InterfaceC1896Ir interfaceC1896Ir, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void w0(C3011bh c3011bh) {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        this.f28604b.h(true);
    }

    @Override // com.google.android.gms.internal.ads.VI
    public final void zzo() {
    }
}
