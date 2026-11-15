package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Np, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2151Np implements J4.B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zzbwl f21344a;

    C2151Np(zzbwl zzbwlVar) {
        Objects.requireNonNull(zzbwlVar);
        this.f21344a = zzbwlVar;
    }

    @Override // J4.B
    public final void B2() {
        L4.p.a("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // J4.B
    public final void F4() {
        L4.p.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // J4.B
    public final void H1() {
        L4.p.a("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // J4.B
    public final void N0() {
        L4.p.a("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // J4.B
    public final void S3(int i10) {
        L4.p.a("AdMobCustomTabsAdapter overlay is closed.");
        zzbwl zzbwlVar = this.f21344a;
        zzbwlVar.b().t(zzbwlVar);
    }

    @Override // J4.B
    public final void Z1() {
        L4.p.a("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // J4.B
    public final void Z2() {
    }

    @Override // J4.B
    public final void Z4() {
        L4.p.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // J4.B
    public final void b4() {
        L4.p.a("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // J4.B
    public final void c() {
        L4.p.a("Opening AdMobCustomTabsAdapter overlay.");
        zzbwl zzbwlVar = this.f21344a;
        zzbwlVar.b().u(zzbwlVar);
    }

    @Override // J4.B
    public final void t4() {
        L4.p.a("AdMobCustomTabsAdapter overlay is destroyed.");
    }
}
