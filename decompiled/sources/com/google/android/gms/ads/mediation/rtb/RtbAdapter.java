package com.google.android.gms.ads.mediation.rtb;

import N4.AbstractC0819a;
import N4.InterfaceC0823e;
import N4.j;
import N4.m;
import N4.s;
import N4.v;
import N4.z;
import P4.a;
import P4.b;
import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RtbAdapter extends AbstractC0819a {
    public abstract void collectSignals(@NonNull a aVar, @NonNull b bVar);

    public void loadRtbAppOpenAd(@NonNull j jVar, @NonNull InterfaceC0823e interfaceC0823e) {
        loadAppOpenAd(jVar, interfaceC0823e);
    }

    public void loadRtbBannerAd(@NonNull m mVar, @NonNull InterfaceC0823e interfaceC0823e) {
        loadBannerAd(mVar, interfaceC0823e);
    }

    public void loadRtbInterstitialAd(@NonNull s sVar, @NonNull InterfaceC0823e interfaceC0823e) {
        loadInterstitialAd(sVar, interfaceC0823e);
    }

    @Deprecated
    public void loadRtbNativeAd(@NonNull v vVar, @NonNull InterfaceC0823e interfaceC0823e) {
        loadNativeAd(vVar, interfaceC0823e);
    }

    public void loadRtbNativeAdMapper(@NonNull v vVar, @NonNull InterfaceC0823e interfaceC0823e) throws RemoteException {
        loadNativeAdMapper(vVar, interfaceC0823e);
    }

    public void loadRtbRewardedAd(@NonNull z zVar, @NonNull InterfaceC0823e interfaceC0823e) {
        loadRewardedAd(zVar, interfaceC0823e);
    }

    public void loadRtbRewardedInterstitialAd(@NonNull z zVar, @NonNull InterfaceC0823e interfaceC0823e) {
        loadRewardedInterstitialAd(zVar, interfaceC0823e);
    }
}
