package com.tenjin.android.utils.adnetwork;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AdMobHelper extends BaseAdNetworkHelper {
    public static final String KEY_AD_UNIT_ID = "ad_unit_id";
    public static final String KEY_CURRENCY_CODE = "currency_code";
    public static final String KEY_MEDIATION_ADAPTER_CLASS = "mediation_adapter_class_name";
    public static final String KEY_PRECISION_TYPE = "precision_type";
    public static final String KEY_RESPONSE_ID = "response_id";
    public static final String KEY_VALUE_MICROS = "value_micros";
    private static final String METHOD_AD_UNIT_ID = "getAdUnitId";
    private static final String METHOD_CURRENCY_CODE = "getCurrencyCode";
    private static final String METHOD_MEDIATION_ADAPTER_CLASS = "getMediationAdapterClassName";
    private static final String METHOD_PRECISION_TYPE = "getPrecisionType";
    private static final String METHOD_RESPONSE_ID = "getResponseId";
    private static final String METHOD_RESPONSE_INFO = "getResponseInfo";
    private static final String METHOD_VALUE_MICROS = "getValueMicros";

    static {
        BaseAdNetworkHelper.logTag = AdMobHelper.class.getSimpleName();
        BaseAdNetworkHelper.helperObjectName = "AdMob";
    }

    public static JSONObject convertToJsonObject(Object obj, Object obj2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_PRECISION_TYPE, getPrecisionType(obj));
            jSONObject.put(KEY_VALUE_MICROS, getValueMicros(obj));
            jSONObject.put(KEY_CURRENCY_CODE, getCurrencyCode(obj));
            jSONObject.put("ad_unit_id", getAdUnitId(obj2));
            jSONObject.put(KEY_MEDIATION_ADAPTER_CLASS, getMediationAdapterClassName(obj2));
            jSONObject.put(KEY_RESPONSE_ID, getResponseId(obj2));
            return jSONObject;
        } catch (JSONException e10) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while creating JSON object from " + BaseAdNetworkHelper.helperObjectName + " data", e10);
            return jSONObject;
        }
    }

    private static String getAdUnitId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_UNIT_ID, "ad_unit_id");
    }

    private static String getCurrencyCode(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_CURRENCY_CODE, KEY_CURRENCY_CODE);
    }

    private static String getMediationAdapterClassName(Object obj) {
        return BaseAdNetworkHelper.getString(BaseAdNetworkHelper.getObject(obj, METHOD_RESPONSE_INFO, METHOD_RESPONSE_INFO), METHOD_MEDIATION_ADAPTER_CLASS, KEY_MEDIATION_ADAPTER_CLASS);
    }

    private static int getPrecisionType(Object obj) {
        return BaseAdNetworkHelper.getInt(obj, METHOD_PRECISION_TYPE, KEY_PRECISION_TYPE);
    }

    private static String getResponseId(Object obj) {
        return BaseAdNetworkHelper.getString(BaseAdNetworkHelper.getObject(obj, METHOD_RESPONSE_INFO, METHOD_RESPONSE_INFO), METHOD_RESPONSE_ID, KEY_RESPONSE_ID);
    }

    private static long getValueMicros(Object obj) {
        return BaseAdNetworkHelper.getLong(obj, METHOD_VALUE_MICROS, KEY_VALUE_MICROS);
    }
}
