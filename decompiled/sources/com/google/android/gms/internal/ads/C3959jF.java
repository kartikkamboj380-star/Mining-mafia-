package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3959jF implements ZF, SJ, GI, InterfaceC4717pG, InterfaceC5520ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4968rG f30373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5348uH f30374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3502fb0 f30375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f30376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f30377e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture f30379g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f30381i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2376Rx0 f30378f = C2376Rx0.B();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f30380h = new AtomicBoolean();

    C3959jF(C4968rG c4968rG, C3502fb0 c3502fb0, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, C5348uH c5348uH) {
        this.f30373a = c4968rG;
        this.f30375c = c3502fb0;
        this.f30376d = scheduledExecutorService;
        this.f30377e = executor;
        this.f30381i = str;
        this.f30374b = c5348uH;
    }

    private final boolean i() {
        return this.f30381i.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.SJ
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4717pG
    public final synchronized void e(H4.Z0 z9) {
        try {
            C2376Rx0 c2376Rx0 = this.f30378f;
            if (c2376Rx0.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f30379g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            c2376Rx0.l(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void g() {
        synchronized (this) {
            try {
                C2376Rx0 c2376Rx0 = this.f30378f;
                if (c2376Rx0.isDone()) {
                    return;
                }
                c2376Rx0.k(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ C4968rG h() {
        return this.f30373a;
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
        C3502fb0 c3502fb0 = this.f30375c;
        if (c3502fb0.f28403e == 3) {
            return;
        }
        int i10 = c3502fb0.f28393Y;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Vc)).booleanValue() && i()) {
                return;
            }
            this.f30373a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(InterfaceC1896Ir interfaceC1896Ir, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520ve
    public final void s0(C5394ue c5394ue) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Vc)).booleanValue() && i() && c5394ue.f33869j && this.f30380h.compareAndSet(false, true) && this.f30375c.f28403e != 3) {
            AbstractC0786o0.k("Full screen 1px impression occurred");
            this.f30373a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final synchronized void v() {
        if (this.f30375c.f28403e == 4) {
            this.f30373a.zza();
            return;
        }
        C2376Rx0 c2376Rx0 = this.f30378f;
        if (c2376Rx0.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f30379g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        c2376Rx0.k(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.SJ
    public final void zzg() {
        C3502fb0 c3502fb0 = this.f30375c;
        int i10 = c3502fb0.f28403e;
        if (i10 == 3) {
            return;
        }
        if (i10 == 4) {
            this.f30374b.zza();
            return;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29784c2)).booleanValue() && c3502fb0.f28393Y == 2) {
            int i11 = c3502fb0.f28427q;
            if (i11 == 0) {
                this.f30373a.zza();
            } else {
                AbstractC5685wx0.r(this.f30378f, new C3709hF(this), this.f30377e);
                this.f30379g = this.f30376d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.iF
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f29313a.g();
                    }
                }, i11, TimeUnit.MILLISECONDS);
            }
        }
    }
}
