package com.google.android.gms.ads.mediation.customevent;

import N4.f;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface CustomEventInterstitial extends O4.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@NonNull Context context, @NonNull O4.c cVar, String str, @NonNull f fVar, Bundle bundle);

    void showInterstitial();
}
