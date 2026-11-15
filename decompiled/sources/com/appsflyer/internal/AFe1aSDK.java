package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.unity3d.services.UnityAdsConstants;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1aSDK extends AFe1bSDK<String> {
    private final AFh1jSDK component2;

    public AFe1aSDK(@NonNull AFh1jSDK aFh1jSDK, @NonNull AFd1zSDK aFd1zSDK) {
        AFe1lSDK aFe1lSDK = aFh1jSDK.hashCode;
        AFe1lSDK aFe1lSDK2 = aFe1lSDK == null ? AFe1lSDK.CACHED_EVENT : aFe1lSDK;
        AFe1lSDK[] aFe1lSDKArr = {AFe1lSDK.RC_CDN};
        StringBuilder sb = new StringBuilder();
        sb.append(aFh1jSDK.component4);
        sb.append("-");
        sb.append(getMonetizationNetwork(aFh1jSDK));
        super(aFe1lSDK2, aFe1lSDKArr, aFd1zSDK, sb.toString(), aFh1jSDK.component4);
        this.component2 = aFh1jSDK;
    }

    private boolean copydefault() {
        ResponseNetwork responseNetwork;
        AFe1lSDK aFe1lSDK = this.component2.hashCode;
        if (aFe1lSDK == null) {
            aFe1lSDK = AFe1lSDK.CACHED_EVENT;
        }
        return aFe1lSDK == AFe1lSDK.ARS_VALIDATE && (responseNetwork = ((AFe1bSDK) this).component4) != null && responseNetwork.getStatusCode() == 424;
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1bSDK) this).component4;
        boolean z9 = this.AFAdRevenueData == AFe1rSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE == 1;
        AFe1lSDK aFe1lSDK = this.getMonetizationNetwork;
        return z9 && (aFe1lSDK == AFe1lSDK.CONVERSION || aFe1lSDK == AFe1lSDK.ATTR);
    }

    private static String getMonetizationNetwork(AFh1jSDK aFh1jSDK) {
        try {
            return new URL(aFh1jSDK.component3).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK, com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || copydefault() || equals();
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    protected final AppsFlyerRequestListener component1() {
        return this.component2.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    protected final boolean copy() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    protected final AFd1fSDK<String> getRevenue(@NonNull String str) {
        String strEncodeToString = Base64.encodeToString(this.component2.getCurrencyIso4217Code(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        ((AFe1bSDK) this).areAllFieldsValid.getMonetizationNetwork(this.component2.component3, strEncodeToString);
        return ((AFe1bSDK) this).component3.getRevenue(this.component2);
    }
}
