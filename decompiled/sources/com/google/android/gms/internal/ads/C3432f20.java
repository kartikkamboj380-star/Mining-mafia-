package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import H4.InterfaceC0620n0;
import H4.InterfaceC0640u0;
import K4.AbstractC0786o0;
import android.util.Pair;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.f20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3432f20 implements C4.e, IH, OG, InterfaceC3082cG, InterfaceC5220tG, InterfaceC0580a, ZF, InterfaceC5096sH, InterfaceC4717pG, InterfaceC4599oK {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final QR f28145i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f28137a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f28138b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f28139c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicReference f28140d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f28141e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f28142f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f28143g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f28144h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final BlockingQueue f28146j = new ArrayBlockingQueue(((Integer) H4.B.c().d(AbstractC3892ii.oa)).intValue());

    public C3432f20(QR qr) {
        this.f28145i = qr;
    }

    private final void l() {
        if (this.f28143g.get() && this.f28144h.get()) {
            BlockingQueue<Pair> blockingQueue = this.f28146j;
            for (final Pair pair : blockingQueue) {
                J90.a(this.f28138b, new I90() { // from class: com.google.android.gms.internal.ads.Q10
                    @Override // com.google.android.gms.internal.ads.I90
                    public final /* synthetic */ void zza(Object obj) {
                        Pair pair2 = pair;
                        ((InterfaceC0620n0) obj).I0((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            blockingQueue.clear();
            this.f28142f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void F0() {
        J90.a(this.f28137a, W10.f24636a);
    }

    public final void K(H4.I i10) {
        this.f28137a.set(i10);
    }

    public final void N(InterfaceC0620n0 interfaceC0620n0) {
        this.f28138b.set(interfaceC0620n0);
        this.f28143g.set(true);
        l();
    }

    public final void P(H4.S0 s10) {
        this.f28139c.set(s10);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
        J90.a(this.f28137a, S10.f23106a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4717pG
    public final void e(final H4.Z0 z9) {
        J90.a(this.f28141e, new I90() { // from class: com.google.android.gms.internal.ads.N10
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC0640u0) obj).w6(z9);
            }
        });
    }

    public final void g0(H4.L l10) {
        this.f28140d.set(l10);
    }

    public final synchronized H4.I h() {
        return (H4.I) this.f28137a.get();
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
        this.f28142f.set(true);
        this.f28144h.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5096sH
    public final void j(final H4.o2 o2Var) {
        J90.a(this.f28139c, new I90() { // from class: com.google.android.gms.internal.ads.L10
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((H4.S0) obj).a6(o2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
        J90.a(this.f28137a, Z10.f26072a);
        J90.a(this.f28141e, C3306e20.f27663a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        J90.a(this.f28137a, Y10.f25456a);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
        J90.a(this.f28137a, U10.f23895a);
        AtomicReference atomicReference = this.f28141e;
        J90.a(atomicReference, C2930b20.f26704a);
        J90.a(atomicReference, C3055c20.f27007a);
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.kc)).booleanValue()) {
            return;
        }
        J90.a(this.f28137a, V10.f24169a);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(InterfaceC1896Ir interfaceC1896Ir, String str, String str2) {
    }

    public final void s0(InterfaceC0640u0 interfaceC0640u0) {
        this.f28141e.set(interfaceC0640u0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4599oK
    public final void t0() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.kc)).booleanValue()) {
            J90.a(this.f28137a, X10.f25067a);
        }
        J90.a(this.f28141e, C3181d20.f27316a);
    }

    public final synchronized InterfaceC0620n0 u() {
        return (InterfaceC0620n0) this.f28138b.get();
    }

    @Override // C4.e
    public final synchronized void v(final String str, final String str2) {
        if (!this.f28142f.get()) {
            J90.a(this.f28138b, new I90() { // from class: com.google.android.gms.internal.ads.M10
                @Override // com.google.android.gms.internal.ads.I90
                public final /* synthetic */ void zza(Object obj) {
                    ((InterfaceC0620n0) obj).I0(str, str2);
                }
            });
            return;
        }
        if (!this.f28146j.offer(new Pair(str, str2))) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("The queue for app events is full, dropping the new event.");
            QR qr = this.f28145i;
            if (qr != null) {
                PR prA = qr.a();
                prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "dae_action");
                prA.c("dae_name", str);
                prA.c("dae_data", str2);
                prA.d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(final H4.Z0 z9) {
        I90 i90 = new I90() { // from class: com.google.android.gms.internal.ads.R10
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((H4.I) obj).j0(z9);
            }
        };
        AtomicReference atomicReference = this.f28137a;
        J90.a(atomicReference, i90);
        J90.a(atomicReference, new I90() { // from class: com.google.android.gms.internal.ads.J10
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((H4.I) obj).G(z9.f1252a);
            }
        });
        J90.a(this.f28140d, new I90() { // from class: com.google.android.gms.internal.ads.K10
            @Override // com.google.android.gms.internal.ads.I90
            public final /* synthetic */ void zza(Object obj) {
                ((H4.L) obj).H0(z9);
            }
        });
        this.f28142f.set(false);
        this.f28146j.clear();
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final synchronized void zzg() {
        J90.a(this.f28137a, T10.f23368a);
        J90.a(this.f28140d, C2804a20.f26391a);
        this.f28144h.set(true);
        l();
    }
}
