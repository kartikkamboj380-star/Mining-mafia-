package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4339mG extends AbstractC3214dJ implements InterfaceC3208dG {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f31472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledFuture f31473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31474d;

    public C4339mG(C3837iG c3837iG, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f31474d = false;
        this.f31472b = scheduledExecutorService;
        super.b1(c3837iG, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void H0(final H4.Z0 z9) {
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.lG
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3208dG) obj).H0(z9);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void P(final GL gl) {
        if (this.f31474d) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f31473c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        g1(new InterfaceC3088cJ() { // from class: com.google.android.gms.internal.ads.jG
            @Override // com.google.android.gms.internal.ads.InterfaceC3088cJ
            public final /* synthetic */ void zza(Object obj) {
                ((InterfaceC3208dG) obj).P(gl);
            }
        });
    }

    final /* synthetic */ void b() {
        synchronized (this) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.c("Timeout waiting for show call succeed to be called.");
            P(new GL("Timeout for show call succeed."));
            this.f31474d = true;
        }
    }

    public final void j1() {
        this.f31473c = this.f31472b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.kG
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f30736a.b();
            }
        }, ((Integer) H4.B.c().d(AbstractC3892ii.hc)).intValue(), TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        ScheduledFuture scheduledFuture = this.f31473c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3208dG
    public final void zze() {
        g1(C3333eG.f27728a);
    }
}
