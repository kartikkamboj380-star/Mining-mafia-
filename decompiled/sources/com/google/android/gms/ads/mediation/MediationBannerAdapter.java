package com.google.android.gms.ads.mediation;

import B4.f;
import N4.g;
import N4.n;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface MediationBannerAdapter extends g {
    @NonNull
    View getBannerView();

    @Override // N4.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // N4.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // N4.g, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(@NonNull Context context, @NonNull n nVar, @NonNull Bundle bundle, @NonNull f fVar, @NonNull N4.f fVar2, Bundle bundle2);
}
