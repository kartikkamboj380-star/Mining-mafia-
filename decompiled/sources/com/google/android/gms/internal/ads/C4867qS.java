package com.google.android.gms.internal.ads;

import H4.InterfaceC0580a;
import K4.AbstractC0786o0;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4867qS implements C4.e, IH, InterfaceC0580a, ZF, InterfaceC5220tG, InterfaceC5472vG, OG, InterfaceC3082cG, InterfaceC2180Od0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3357eS f32635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f32636c;

    public C4867qS(C3357eS c3357eS, AbstractC2791Zx abstractC2791Zx) {
        this.f32635b = c3357eS;
        this.f32634a = Collections.singletonList(abstractC2791Zx);
    }

    private final void g0(Class cls, String str, Object... objArr) {
        this.f32635b.a(this.f32634a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
        this.f32636c = G4.t.o().elapsedRealtime();
        g0(IH.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void K(EnumC1817Hd0 enumC1817Hd0, String str) {
        g0(InterfaceC1765Gd0.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void N(EnumC1817Hd0 enumC1817Hd0, String str) {
        g0(InterfaceC1765Gd0.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void P(Context context) {
        g0(InterfaceC5472vG.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void b() {
        g0(ZF.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void d0() {
        g0(ZF.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void e(Context context) {
        g0(InterfaceC5472vG.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5472vG
    public final void h(Context context) {
        g0(InterfaceC5472vG.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void j(EnumC1817Hd0 enumC1817Hd0, String str, Throwable th) {
        g0(InterfaceC1765Gd0.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void k() {
        g0(ZF.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5220tG
    public final void m() {
        g0(InterfaceC5220tG.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void o() {
        g0(ZF.class, "onAdOpened", new Object[0]);
    }

    @Override // H4.InterfaceC0580a
    public final void onAdClicked() {
        g0(InterfaceC0580a.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void p(InterfaceC1896Ir interfaceC1896Ir, String str, String str2) {
        g0(ZF.class, "onRewarded", interfaceC1896Ir, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void u(EnumC1817Hd0 enumC1817Hd0, String str) {
        g0(InterfaceC1765Gd0.class, "onTaskCreated", str);
    }

    @Override // C4.e
    public final void v(String str, String str2) {
        g0(C4.e.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3082cG
    public final void w(H4.Z0 z9) {
        g0(InterfaceC3082cG.class, "onAdFailedToLoad", Integer.valueOf(z9.f1252a), z9.f1253b, z9.f1254c);
    }

    @Override // com.google.android.gms.internal.ads.ZF
    public final void zze() {
        g0(ZF.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        long jElapsedRealtime = G4.t.o().elapsedRealtime() - this.f32636c;
        StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(jElapsedRealtime);
        AbstractC0786o0.k(sb.toString());
        g0(OG.class, "onAdLoaded", new Object[0]);
    }
}
