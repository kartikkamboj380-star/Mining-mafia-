package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.tenjin.android.config.TenjinConsts;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1fSDK {
    public static void AFAdRevenueData(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", getCurrencyIso4217Code(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", getMediationNetwork("tcstring"));
                }
                if (jSONObject.has(TenjinConsts.REFERRER_PARAM)) {
                    jSONObject.put(TenjinConsts.REFERRER_PARAM, getMediationNetwork(TenjinConsts.REFERRER_PARAM));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(jSONObject);
                aFLogger.i(aFg1cSDK, sb.toString());
            } catch (JSONException e10) {
                AFLogger.INSTANCE.e(AFg1cSDK.OTHER, "Not able to log the payload", e10);
            }
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 == 0 || i10 == str.length() - 1) {
                sb.append(str.charAt(i10));
            } else {
                sb.append("*");
            }
        }
        return sb.toString();
    }

    public static String getMediationNetwork(String str) {
        if (str.length() <= 20) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 10));
        sb.append("...");
        return sb.toString();
    }
}
