package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1dSDK implements AFf1cSDK {

    @NotNull
    private final Context getCurrencyIso4217Code;

    @NotNull
    private final AppsFlyerProperties getMonetizationNetwork;

    public AFf1dSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getCurrencyIso4217Code = context;
        this.getMonetizationNetwork = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1cSDK
    @Nullable
    public final AFf1fSDK getMediationNetwork() {
        String string;
        if (!Boolean.parseBoolean(this.getMonetizationNetwork.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getCurrencyIso4217Code);
            int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i11 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i13 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i10 == 1 && (string = defaultSharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFf1fSDK(i12, i10, i11, i13, str);
        } catch (Exception e10) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e10, false, false, false, false, 120, null);
            return null;
        }
    }
}
