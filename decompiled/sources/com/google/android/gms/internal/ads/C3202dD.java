package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3202dD implements OG, InterfaceC5520ve, GI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3502fb0 f27373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4968rG f27374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final YG f27375c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5348uH f27378f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f27376d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f27377e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f27379g = new AtomicBoolean();

    public C3202dD(C3502fb0 c3502fb0, C4968rG c4968rG, YG yg, C5348uH c5348uH) {
        this.f27373a = c3502fb0;
        this.f27374b = c4968rG;
        this.f27375c = yg;
        this.f27378f = c5348uH;
    }

    private final void b() {
        if (this.f27376d.compareAndSet(false, true)) {
            this.f27374b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520ve
    public final void s0(C5394ue c5394ue) {
        int i10 = this.f27373a.f28403e;
        if (i10 == 1) {
            if (c5394ue.f33869j) {
                b();
            }
        } else if (i10 == 4 && c5394ue.f33869j && this.f27379g.compareAndSet(false, true)) {
            this.f27378f.zza();
        }
        if (c5394ue.f33869j && this.f27377e.compareAndSet(false, true)) {
            this.f27375c.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final void v() {
        if (this.f27373a.f28403e == 4) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.GI
    public final void w() {
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final synchronized void zzg() {
        int i10 = this.f27373a.f28403e;
        if (i10 == 1 || i10 == 4) {
            return;
        }
        b();
    }
}
