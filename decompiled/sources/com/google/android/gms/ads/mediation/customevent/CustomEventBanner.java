package com.google.android.gms.ads.mediation.customevent;

import B4.f;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface CustomEventBanner extends O4.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@NonNull Context context, @NonNull O4.b bVar, String str, @NonNull f fVar, @NonNull N4.f fVar2, Bundle bundle);
}
