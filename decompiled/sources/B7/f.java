package B7;

import B4.C0564a;
import N4.InterfaceC0823e;
import android.app.Activity;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends B4.j implements N4.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N4.s f318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0823e f319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C4.c f320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N4.r f321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f322e;

    public f(N4.s mediationInterstitialAdConfiguration, InterfaceC0823e mediationAdLoadCallback) {
        Intrinsics.checkNotNullParameter(mediationInterstitialAdConfiguration, "mediationInterstitialAdConfiguration");
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f318a = mediationInterstitialAdConfiguration;
        this.f319b = mediationAdLoadCallback;
        this.f322e = "";
    }

    @Override // N4.q
    public final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        i("ad is showing");
        C4.c cVar = this.f320c;
        if (cVar == null) {
            Intrinsics.r("adManagerInterstitialAd");
            cVar = null;
        }
        cVar.f((Activity) context);
    }

    @Override // B4.j
    public final void b() {
        i("ad clicked");
        N4.r rVar = this.f321d;
        if (rVar == null) {
            Intrinsics.r("interstitialAdCallback");
            rVar = null;
        }
        rVar.h();
    }

    @Override // B4.j
    public final void c() {
        i("fullscreen ad content dismissed by user");
        N4.r rVar = this.f321d;
        if (rVar == null) {
            Intrinsics.r("interstitialAdCallback");
            rVar = null;
        }
        rVar.onAdClosed();
    }

    @Override // B4.j
    public final void d(C0564a adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        i("fullscreen ad content failed to show due to " + adError);
        this.f319b.b(adError);
        N4.r rVar = this.f321d;
        if (rVar == null) {
            Intrinsics.r("interstitialAdCallback");
            rVar = null;
        }
        rVar.a(adError);
    }

    @Override // B4.j
    public final void e() {
        i("ad impression is recorded");
        N4.r rVar = this.f321d;
        if (rVar == null) {
            Intrinsics.r("interstitialAdCallback");
            rVar = null;
        }
        rVar.g();
    }

    @Override // B4.j
    public final void f() {
        i("fullscreen ad content is shown");
        N4.r rVar = this.f321d;
        if (rVar == null) {
            Intrinsics.r("interstitialAdCallback");
            rVar = null;
        }
        rVar.onAdOpened();
    }

    public final void i(String str) {
        v.a("[Interstitial/" + this.f322e + "] " + str);
    }
}
