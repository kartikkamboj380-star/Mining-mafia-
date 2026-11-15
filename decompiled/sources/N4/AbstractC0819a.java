package N4;

import B4.C0564a;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.MobileAds;
import java.util.List;

/* JADX INFO: renamed from: N4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0819a {
    @NonNull
    public abstract B4.v getSDKVersionInfo();

    @NonNull
    public abstract B4.v getVersionInfo();

    public abstract void initialize(@NonNull Context context, @NonNull InterfaceC0820b interfaceC0820b, @NonNull List<o> list);

    public void loadAppOpenAd(@NonNull j jVar, @NonNull InterfaceC0823e interfaceC0823e) {
        interfaceC0823e.b(new C0564a(7, getClass().getSimpleName().concat(" does not support app open ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadBannerAd(@NonNull m mVar, @NonNull InterfaceC0823e interfaceC0823e) {
        interfaceC0823e.b(new C0564a(7, getClass().getSimpleName().concat(" does not support banner ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadInterstitialAd(@NonNull s sVar, @NonNull InterfaceC0823e interfaceC0823e) {
        interfaceC0823e.b(new C0564a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), MobileAds.ERROR_DOMAIN));
    }

    @Deprecated
    public void loadNativeAd(@NonNull v vVar, @NonNull InterfaceC0823e interfaceC0823e) {
        interfaceC0823e.b(new C0564a(7, getClass().getSimpleName().concat(" does not support native ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadNativeAdMapper(@NonNull v vVar, @NonNull InterfaceC0823e interfaceC0823e) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(@NonNull z zVar, @NonNull InterfaceC0823e interfaceC0823e) {
        interfaceC0823e.b(new C0564a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), MobileAds.ERROR_DOMAIN));
    }

    public void loadRewardedInterstitialAd(@NonNull z zVar, @NonNull InterfaceC0823e interfaceC0823e) {
        interfaceC0823e.b(new C0564a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), MobileAds.ERROR_DOMAIN));
    }
}
