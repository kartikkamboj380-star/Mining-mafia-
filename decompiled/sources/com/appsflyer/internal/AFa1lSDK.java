package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1lSDK implements AFa1gSDK {

    @NotNull
    private final AFc1jSDK getMediationNetwork;

    public AFa1lSDK(@NotNull AFc1jSDK aFc1jSDK) {
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        this.getMediationNetwork = aFc1jSDK;
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    @NotNull
    public final Map<String, Object> getMediationNetwork() {
        if (this.getMediationNetwork.getMonetizationNetwork("deeplink_data")) {
            try {
                String revenue = this.getMediationNetwork.getRevenue("deeplink_data", (String) null);
                return revenue == null ? kotlin.collections.E.g() : AFj1eSDK.getMonetizationNetwork(new JSONObject(revenue));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th, true, false);
            }
        }
        return kotlin.collections.E.g();
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getMonetizationNetwork(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getMediationNetwork.getMediationNetwork("deeplink_data", new JSONObject(map).toString());
    }

    @Override // com.appsflyer.internal.AFa1gSDK
    public final void getRevenue() {
        this.getMediationNetwork.getCurrencyIso4217Code("deeplink_data");
    }
}
