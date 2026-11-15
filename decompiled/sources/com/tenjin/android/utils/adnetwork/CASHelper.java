package com.tenjin.android.utils.adnetwork;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CASHelper extends BaseAdNetworkHelper {
    public static final String KEY_AD_NETWORK = "network_name";
    public static final String KEY_AD_UNIT = "ad_unit_id";
    public static final String KEY_CREATIVE_ID = "creative_id";
    public static final String KEY_FORMAT = "format";
    public static final String KEY_PRECISION = "revenue_precision";
    public static final String KEY_REVENUE = "revenue";
    private static final String METHOD_AD_NETWORK = "getNetwork";
    private static final String METHOD_AD_TYPE = "getAdType";
    private static final String METHOD_AD_UNIT_ID = "getIdentifier";
    private static final String METHOD_CREATIVE_ID = "getCreativeIdentifier";
    private static final String METHOD_PRECISION = "getPriceAccuracy";
    private static final String METHOD_REVENUE = "getCpm";

    static {
        BaseAdNetworkHelper.logTag = IronSourceHelper.class.getSimpleName();
        BaseAdNetworkHelper.helperObjectName = "IronSource";
    }

    public static JSONObject convertToJsonObject(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_unit_id", getAdUnitId(obj));
            jSONObject.put("creative_id", getCreativeId(obj));
            jSONObject.put("network_name", getAdNetwork(obj));
            jSONObject.put("revenue", getRevenue(obj));
            jSONObject.put("revenue_precision", getPrecision(obj));
            jSONObject.put("format", getFormat(obj));
            return jSONObject;
        } catch (JSONException e10) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while creating JSON object from " + BaseAdNetworkHelper.helperObjectName + " data", e10);
            return jSONObject;
        }
    }

    private static String getAdNetwork(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_NETWORK, "network_name");
    }

    private static String getAdUnitId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_UNIT_ID, "ad_unit_id");
    }

    private static String getCreativeId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_CREATIVE_ID, "creative_id");
    }

    private static String getFormat(Object obj) {
        int intFromEnum = BaseAdNetworkHelper.getIntFromEnum(obj, METHOD_AD_TYPE, "format");
        if (intFromEnum == 1) {
            return "banner";
        }
        if (intFromEnum == 2) {
            return "interstitial";
        }
        if (intFromEnum != 3) {
            return intFromEnum != 4 ? "none" : "rewarded";
        }
        return "native";
    }

    private static String getPrecision(Object obj) {
        int i10 = BaseAdNetworkHelper.getInt(obj, METHOD_PRECISION, "revenue_precision");
        if (i10 == 0) {
            return "floor";
        }
        if (i10 != 1) {
            return i10 != 2 ? "none" : "undisclosed";
        }
        return "bid";
    }

    private static double getRevenue(Object obj) {
        return BaseAdNetworkHelper.getDouble(obj, METHOD_REVENUE, "revenue");
    }
}
