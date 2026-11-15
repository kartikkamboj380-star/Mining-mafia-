package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;

/* JADX INFO: loaded from: classes2.dex */
public final class FS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4529nm f18757a;

    FS(InterfaceC4529nm interfaceC4529nm) {
        this.f18757a = interfaceC4529nm;
    }

    private final void s(ES es) {
        String strA = es.a();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strA);
        int i10 = AbstractC0786o0.f2696b;
        L4.p.e(strConcat);
        this.f18757a.j(strA);
    }

    public final void a() {
        s(new ES(MobileAdsBridgeBase.initializeMethodName, null));
    }

    public final void b(long j10) {
        ES es = new ES("creation", null);
        es.b(Long.valueOf(j10));
        es.c("nativeObjectCreated");
        s(es);
    }

    public final void c(long j10) {
        ES es = new ES("creation", null);
        es.b(Long.valueOf(j10));
        es.c("nativeObjectNotCreated");
        s(es);
    }

    public final void d(long j10) {
        ES es = new ES("interstitial", null);
        es.b(Long.valueOf(j10));
        es.c("onNativeAdObjectNotAvailable");
        s(es);
    }

    public final void e(long j10) {
        ES es = new ES("interstitial", null);
        es.b(Long.valueOf(j10));
        es.c("onAdLoaded");
        s(es);
    }

    public final void f(long j10, int i10) {
        ES es = new ES("interstitial", null);
        es.b(Long.valueOf(j10));
        es.c("onAdFailedToLoad");
        es.d(Integer.valueOf(i10));
        s(es);
    }

    public final void g(long j10) {
        ES es = new ES("interstitial", null);
        es.b(Long.valueOf(j10));
        es.c("onAdOpened");
        s(es);
    }

    public final void h(long j10) {
        ES es = new ES("interstitial", null);
        es.b(Long.valueOf(j10));
        es.c("onAdClicked");
        this.f18757a.j(es.a());
    }

    public final void i(long j10) {
        ES es = new ES("interstitial", null);
        es.b(Long.valueOf(j10));
        es.c("onAdClosed");
        s(es);
    }

    public final void j(long j10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onNativeAdObjectNotAvailable");
        s(es);
    }

    public final void k(long j10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onRewardedAdLoaded");
        s(es);
    }

    public final void l(long j10, int i10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onRewardedAdFailedToLoad");
        es.d(Integer.valueOf(i10));
        s(es);
    }

    public final void m(long j10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onRewardedAdOpened");
        s(es);
    }

    public final void n(long j10, int i10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onRewardedAdFailedToShow");
        es.d(Integer.valueOf(i10));
        s(es);
    }

    public final void o(long j10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onRewardedAdClosed");
        s(es);
    }

    public final void p(long j10, InterfaceC2727Yr interfaceC2727Yr) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onUserEarnedReward");
        es.e(interfaceC2727Yr.zze());
        es.f(Integer.valueOf(interfaceC2727Yr.b()));
        s(es);
    }

    public final void q(long j10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onAdImpression");
        s(es);
    }

    public final void r(long j10) {
        ES es = new ES("rewarded", null);
        es.b(Long.valueOf(j10));
        es.c("onAdClicked");
        s(es);
    }
}
