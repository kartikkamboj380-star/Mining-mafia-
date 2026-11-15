package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class OS0 extends F60 implements XQ0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LR0 f21554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IN f21555c;

    OS0(VQ0 vq0) {
        IN in = new IN(InterfaceC3471fM.f28270a);
        this.f21555c = in;
        try {
            this.f21554b = new LR0(vq0, this);
            in.a();
        } catch (Throwable th) {
            this.f21555c.a();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void A(InterfaceC4131kc interfaceC4131kc) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void B(InterfaceC4131kc interfaceC4131kc) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final AbstractC5270tf a() {
        this.f21555c.d();
        return this.f21554b.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final int c() {
        this.f21555c.d();
        return this.f21554b.c();
    }

    @Override // com.google.android.gms.internal.ads.XQ0
    public final void d(InterfaceC5889yZ0 interfaceC5889yZ0) {
        this.f21555c.d();
        this.f21554b.d(interfaceC5889yZ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final boolean e() {
        this.f21555c.d();
        this.f21554b.e();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final int f() {
        this.f21555c.d();
        return this.f21554b.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final long g() {
        this.f21555c.d();
        return this.f21554b.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final C3395el h() {
        this.f21555c.d();
        return this.f21554b.h();
    }

    @Override // com.google.android.gms.internal.ads.XQ0
    public final void i(US0 us0) {
        this.f21555c.d();
        this.f21554b.i(us0);
    }

    @Override // com.google.android.gms.internal.ads.XQ0
    public final void j(US0 us0) {
        this.f21555c.d();
        this.f21554b.j(us0);
    }

    @Override // com.google.android.gms.internal.ads.F60
    protected final void k(int i10, long j10, int i11, boolean z9) {
        this.f21555c.d();
        this.f21554b.k(i10, j10, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final int l() {
        this.f21555c.d();
        return this.f21554b.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final int m() {
        this.f21555c.d();
        return this.f21554b.m();
    }

    public final LQ0 n() {
        this.f21555c.d();
        return this.f21554b.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final long p() {
        this.f21555c.d();
        return this.f21554b.p();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final long q() {
        this.f21555c.d();
        return this.f21554b.q();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final long s() {
        this.f21555c.d();
        return this.f21554b.s();
    }

    @Override // com.google.android.gms.internal.ads.XQ0
    public final int t() {
        this.f21555c.d();
        this.f21554b.t();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final int u() {
        this.f21555c.d();
        return this.f21554b.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final boolean v() {
        this.f21555c.d();
        return this.f21554b.v();
    }

    @Override // com.google.android.gms.internal.ads.XQ0
    public final void w() {
        this.f21555c.d();
        this.f21554b.w();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void x(float f10) {
        this.f21555c.d();
        this.f21554b.x(f10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void y(Surface surface) {
        this.f21555c.d();
        this.f21554b.y(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void z(boolean z9) {
        this.f21555c.d();
        this.f21554b.z(z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final Looper zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void zzg() {
        this.f21555c.d();
        this.f21554b.zzg();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final int zzi() {
        this.f21555c.d();
        return this.f21554b.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final boolean zzk() {
        this.f21555c.d();
        return this.f21554b.zzk();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final int zzl() {
        this.f21555c.d();
        this.f21554b.zzl();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final C3122ca zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final void zzo() {
        this.f21555c.d();
        this.f21554b.zzo();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4637od
    public final long zzu() {
        this.f21555c.d();
        return this.f21554b.zzu();
    }
}
