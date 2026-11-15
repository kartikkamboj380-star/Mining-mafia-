package com.google.android.gms.internal.ads;

import H4.C0603h1;
import H4.C0631r0;
import H4.InterfaceC0582a1;
import H4.InterfaceC0584b0;
import H4.InterfaceC0591d1;
import H4.InterfaceC0620n0;
import H4.InterfaceC0640u0;
import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3948j90 extends H4.V implements J4.B, InterfaceC4137kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2791Zx f30319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f30320b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3195d90 f30323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2944b90 f30324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L4.a f30325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final QR f30326h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private LB f30328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected YB f30329k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f30321c = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f30327i = -1;

    public BinderC3948j90(AbstractC2791Zx abstractC2791Zx, Context context, String str, C3195d90 c3195d90, C2944b90 c2944b90, L4.a aVar, QR qr) {
        this.f30319a = abstractC2791Zx;
        this.f30320b = context;
        this.f30322d = str;
        this.f30323e = c3195d90;
        this.f30324f = c2944b90;
        this.f30325g = aVar;
        this.f30326h = qr;
        c2944b90.m(this);
    }

    private final synchronized void B6(int i10) {
        try {
            if (this.f30321c.compareAndSet(false, true)) {
                this.f30324f.g();
                LB lb = this.f30328j;
                if (lb != null) {
                    G4.t.k().c(lb);
                }
                if (this.f30329k != null) {
                    long jElapsedRealtime = -1;
                    if (this.f30327i != -1) {
                        jElapsedRealtime = G4.t.o().elapsedRealtime() - this.f30327i;
                    }
                    this.f30329k.o(jElapsedRealtime, i10);
                }
                zzc();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ QR A6() {
        return this.f30326h;
    }

    @Override // J4.B
    public final void B2() {
    }

    @Override // H4.W
    public final synchronized void B3(H4.m2 m2Var) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // H4.W
    public final void D4(InterfaceC5396uf interfaceC5396uf) {
        this.f30324f.i(interfaceC5396uf);
    }

    @Override // J4.B
    public final void F4() {
    }

    @Override // H4.W
    public final void G5(String str) {
    }

    @Override // J4.B
    public final void H1() {
    }

    final /* synthetic */ void J() {
        B6(5);
    }

    @Override // H4.W
    public final synchronized void J2(boolean z9) {
    }

    @Override // J4.B
    public final void N0() {
    }

    @Override // H4.W
    public final synchronized void O1(C0631r0 c0631r0) {
    }

    @Override // H4.W
    public final synchronized void O5(InterfaceC1618Di interfaceC1618Di) {
    }

    @Override // H4.W
    public final long S() {
        return 0L;
    }

    @Override // J4.B
    public final void S3(int i10) {
        if (i10 == 0) {
            throw null;
        }
        int i11 = i10 - 1;
        if (i11 == 0) {
            B6(2);
            return;
        }
        if (i11 == 1) {
            B6(4);
        } else if (i11 != 2) {
            B6(6);
        } else {
            B6(3);
        }
    }

    @Override // H4.W
    public final void T2(H4.s2 s2Var) {
        this.f30323e.c(s2Var);
    }

    @Override // J4.B
    public final void Z1() {
    }

    @Override // J4.B
    public final synchronized void Z2() {
        YB yb = this.f30329k;
        if (yb != null) {
            yb.o(G4.t.o().elapsedRealtime() - this.f30327i, 1);
        }
    }

    @Override // J4.B
    public final void Z4() {
    }

    @Override // H4.W
    public final synchronized void b() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // J4.B
    public final void b4() {
    }

    @Override // J4.B
    public final synchronized void c() {
        if (this.f30329k != null) {
            this.f30327i = G4.t.o().elapsedRealtime();
            int iN = this.f30329k.n();
            if (iN > 0) {
                LB lb = new LB(this.f30319a.k(), G4.t.o());
                this.f30328j = lb;
                lb.a(iN, new Runnable() { // from class: com.google.android.gms.internal.ads.h90
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f28854a.y6();
                    }
                });
            }
        }
    }

    @Override // H4.W
    public final synchronized void e() {
    }

    @Override // H4.W
    public final synchronized String f() {
        return null;
    }

    @Override // H4.W
    public final synchronized InterfaceC0582a1 g() {
        return null;
    }

    @Override // H4.W
    public final void j1(long j10) {
    }

    @Override // H4.W
    public final void j2(InterfaceC1634Dq interfaceC1634Dq, String str) {
    }

    @Override // H4.W
    public final synchronized String l() {
        return null;
    }

    @Override // H4.W
    public final void m5(InterfaceC1478Aq interfaceC1478Aq) {
    }

    @Override // H4.W
    public final void o5(String str) {
    }

    @Override // H4.W
    public final H4.I p() {
        return null;
    }

    @Override // H4.W
    public final InterfaceC0620n0 q() {
        return null;
    }

    @Override // H4.W
    public final synchronized boolean s() {
        return false;
    }

    @Override // H4.W
    public final synchronized InterfaceC0591d1 t() {
        return null;
    }

    @Override // J4.B
    public final void t4() {
    }

    @Override // H4.W
    public final void u1(InterfaceC2207Or interfaceC2207Or) {
    }

    @Override // H4.W
    public final void u3(com.google.android.gms.dynamic.a aVar) {
    }

    @Override // H4.W
    public final synchronized void u6(H4.a2 a2Var) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // H4.W
    public final synchronized boolean v0(H4.h2 h2Var) {
        boolean z9;
        try {
            if (!h2Var.j()) {
                if (((Boolean) AbstractC3894ij.f30047d.e()).booleanValue()) {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.Gc)).booleanValue()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                if (this.f30325g.f3099c < ((Integer) H4.B.c().d(AbstractC3892ii.Hc)).intValue() || !z9) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
            }
            G4.t.g();
            if (K4.F0.m(this.f30320b) && h2Var.f1281J == null) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.c("Failed to load the ad because app ID is missing.");
                this.f30324f.w(AbstractC3127cc0.d(4, null, null));
                return false;
            }
            if (y()) {
                return false;
            }
            this.f30321c = new AtomicBoolean();
            return this.f30323e.a(h2Var, this.f30322d, new C3446f90(this), new C3572g90(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // H4.W
    public final synchronized boolean y() {
        return this.f30323e.zzb();
    }

    final /* synthetic */ void y6() {
        this.f30319a.j().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.i90
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f29289a.J();
            }
        });
    }

    @Override // H4.W
    public final void z0(boolean z9) {
    }

    final /* synthetic */ C2944b90 z6() {
        return this.f30324f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4137kf
    public final void zza() {
        B6(3);
    }

    @Override // H4.W
    public final com.google.android.gms.dynamic.a zzb() {
        return null;
    }

    @Override // H4.W
    public final synchronized void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        YB yb = this.f30329k;
        if (yb != null) {
            yb.a();
        }
    }

    @Override // H4.W
    public final boolean zzd() {
        return false;
    }

    @Override // H4.W
    public final synchronized void zzg() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // H4.W
    public final Bundle zzk() {
        return new Bundle();
    }

    @Override // H4.W
    public final synchronized void zzl() {
    }

    @Override // H4.W
    public final synchronized H4.m2 zzn() {
        return null;
    }

    @Override // H4.W
    public final synchronized String zzu() {
        return this.f30322d;
    }

    @Override // H4.W
    public final void C2(InterfaceC0640u0 interfaceC0640u0) {
    }

    @Override // H4.W
    public final void J4(H4.I i10) {
    }

    @Override // H4.W
    public final void P1(InterfaceC0584b0 interfaceC0584b0) {
    }

    @Override // H4.W
    public final void S1(C0603h1 c0603h1) {
    }

    @Override // H4.W
    public final void e5(H4.F f10) {
    }

    @Override // H4.W
    public final void h3(InterfaceC0620n0 interfaceC0620n0) {
    }

    @Override // H4.W
    public final void u5(H4.S0 s10) {
    }

    @Override // H4.W
    public final void r1(H4.h2 h2Var, H4.L l10) {
    }
}
