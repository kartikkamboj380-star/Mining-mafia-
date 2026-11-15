package com.google.android.gms.ads.mediation;

import N4.f;
import N4.g;
import N4.t;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface MediationInterstitialAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@NonNull Context context, @NonNull t tVar, @NonNull Bundle bundle, @NonNull f fVar, Bundle bundle2);

    void showInterstitial();
}
