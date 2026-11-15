package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwl implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f35892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private N4.t f35893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f35894c;

    final /* synthetic */ Activity a() {
        return this.f35892a;
    }

    final /* synthetic */ N4.t b() {
        return this.f35893b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        L4.p.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        L4.p.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        L4.p.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, N4.t tVar, Bundle bundle, N4.f fVar, Bundle bundle2) {
        this.f35893b = tVar;
        if (tVar == null) {
            L4.p.f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            L4.p.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f35893b.c(this, 0);
            return;
        }
        if (!C1982Ki.a(context)) {
            L4.p.f("Default browser does not support custom tabs. Bailing out.");
            this.f35893b.c(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            L4.p.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f35893b.c(this, 0);
        } else {
            this.f35892a = (Activity) context;
            this.f35894c = Uri.parse(string);
            this.f35893b.s(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        p180s.d dVarB = new s.d.e().b();
        dVarB.f48557a.setData(this.f35894c);
        K4.F0.f2598l.post(new RunnableC2203Op(this, new AdOverlayInfoParcel(new J4.m(dVarB.f48557a, null), null, new C2151Np(this), null, new L4.a(0, 0, false), null, null, "")));
        G4.t.l().g();
    }
}
