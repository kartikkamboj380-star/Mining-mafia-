package com.google.android.gms.ads.mediation;

import N4.B;
import N4.g;
import N4.w;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface MediationNativeAdapter extends g {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NonNull Context context, @NonNull w wVar, @NonNull Bundle bundle, @NonNull B b10, Bundle bundle2);
}
