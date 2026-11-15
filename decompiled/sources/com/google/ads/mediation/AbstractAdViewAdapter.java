package com.google.ads.mediation;

import B4.h;
import H4.C0654z;
import H4.InterfaceC0591d1;
import L4.g;
import N4.B;
import N4.C;
import N4.E;
import N4.f;
import N4.n;
import N4.t;
import N4.w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, C, E {

    @NonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private com.google.android.gms.ads.b adLoader;

    @NonNull
    protected h mAdView;

    @NonNull
    protected M4.a mInterstitialAd;

    AdRequest buildAdRequest(Context context, f fVar, Bundle bundle, Bundle bundle2) {
        AdRequest.Builder builder = new AdRequest.Builder();
        Set setG = fVar.g();
        if (setG != null) {
            Iterator it = setG.iterator();
            while (it.hasNext()) {
                builder.c((String) it.next());
            }
        }
        if (fVar.d()) {
            C0654z.a();
            builder.k(g.d(context));
        }
        if (fVar.b() != -1) {
            builder.l(fVar.b() == 1);
        }
        builder.m(fVar.c());
        builder.d(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return builder.n();
    }

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    @NonNull
    public String getAdUnitId(@NonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.mAdView;
    }

    M4.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // N4.E
    public InterfaceC0591d1 getVideoController() {
        h hVar = this.mAdView;
        if (hVar != null) {
            return hVar.e().c();
        }
        return null;
    }

    com.google.android.gms.ads.b.a newAdLoader(Context context, String str) {
        return new com.google.android.gms.ads.b.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N4.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        h hVar = this.mAdView;
        if (hVar != null) {
            hVar.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // N4.C
    public void onImmersiveModeUpdated(boolean z9) {
        M4.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z9);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N4.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        h hVar = this.mAdView;
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, N4.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        h hVar = this.mAdView;
        if (hVar != null) {
            hVar.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull n nVar, @NonNull Bundle bundle, @NonNull B4.f fVar, @NonNull f fVar2, @NonNull Bundle bundle2) {
        h hVar = new h(context);
        this.mAdView = hVar;
        hVar.setAdSize(new B4.f(fVar.f(), fVar.c()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, nVar));
        this.mAdView.b(buildAdRequest(context, fVar2, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull t tVar, @NonNull Bundle bundle, @NonNull f fVar, @NonNull Bundle bundle2) {
        M4.a.b(context, getAdUnitId(bundle), buildAdRequest(context, fVar, bundle2, bundle), new c(this, tVar));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@NonNull Context context, @NonNull w wVar, @NonNull Bundle bundle, @NonNull B b10, @NonNull Bundle bundle2) {
        e eVar = new e(this, wVar);
        com.google.android.gms.ads.b.a aVarNewAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        aVarNewAdLoader.c(eVar);
        aVarNewAdLoader.g(b10.e());
        aVarNewAdLoader.d(b10.a());
        if (b10.f()) {
            aVarNewAdLoader.e(eVar);
        }
        if (b10.zza()) {
            for (String str : b10.zzb().keySet()) {
                aVarNewAdLoader.f(str, eVar, true != ((Boolean) b10.zzb().get(str)).booleanValue() ? null : eVar);
            }
        }
        com.google.android.gms.ads.b bVarA = aVarNewAdLoader.a();
        this.adLoader = bVarA;
        bVarA.b(buildAdRequest(context, b10, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        M4.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.f(null);
        }
    }
}
