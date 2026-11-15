package com.google.android.gms.ads.mediation.customevent;

import N4.B;
import O4.d;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface CustomEventNative extends O4.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@NonNull Context context, @NonNull d dVar, String str, @NonNull B b10, Bundle bundle);
}
