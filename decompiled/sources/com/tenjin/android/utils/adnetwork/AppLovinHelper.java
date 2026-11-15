package com.tenjin.android.utils.adnetwork;

import android.content.Context;
import android.util.Log;
import com.tenjin.android.utils.Reflection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinHelper extends BaseAdNetworkHelper {
    private static final String APPLOVIN_SDK_CLASS = "com.applovin.sdk.AppLovinSdk";
    private static final String DEFAULT_CURRENCY = "USD";
    public static final String KEY_AD_REVENUE_CURRENCY = "ad_revenue_currency";
    public static final String KEY_AD_UNIT_ID = "ad_unit_id";
    public static final String KEY_COUNTRY = "country";
    public static final String KEY_CREATIVE_ID = "creative_id";
    public static final String KEY_FORMAT = "format";
    public static final String KEY_NETWORK_NAME = "network_name";
    public static final String KEY_NETWORK_PLACEMENT = "network_placement";
    public static final String KEY_PLACEMENT = "placement";
    public static final String KEY_REVENUE = "revenue";
    public static final String KEY_REVENUE_PRECISION = "revenue_precision";
    private static final String METHOD_AD_UNIT_ID = "getAdUnitId";
    private static final String METHOD_CONFIGURATION = "getConfiguration";
    private static final String METHOD_COUNTRY_CODE = "getCountryCode";
    private static final String METHOD_CREATIVE_ID = "getCreativeId";
    private static final String METHOD_DISPLAY_NAME = "getDisplayName";
    private static final String METHOD_FORMAT = "getFormat";
    private static final String METHOD_INSTANCE = "getInstance";
    private static final String METHOD_NETWORK_NAME = "getNetworkName";
    private static final String METHOD_NETWORK_PLACEMENT = "getNetworkPlacement";
    private static final String METHOD_PLACEMENT = "getPlacement";
    private static final String METHOD_REVENUE = "getRevenue";
    private static final String METHOD_REVENUE_PRECISION = "getRevenuePrecision";

    static {
        BaseAdNetworkHelper.logTag = AppLovinHelper.class.getSimpleName();
        BaseAdNetworkHelper.helperObjectName = "AppLovin";
    }

    public static JSONObject convertToJsonObject(Context context, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("revenue", getRevenue(obj));
            jSONObject.put(KEY_AD_REVENUE_CURRENCY, DEFAULT_CURRENCY);
            jSONObject.put("country", getCountry(context));
            jSONObject.put("network_name", getNetworkName(obj));
            jSONObject.put("ad_unit_id", getAdUnitId(obj));
            jSONObject.put("format", getAdFormatName(obj));
            jSONObject.put("placement", getPlacement(obj));
            jSONObject.put(KEY_NETWORK_PLACEMENT, getNetworkPlacement(obj));
            jSONObject.put("creative_id", getCreativeId(obj));
            jSONObject.put("revenue_precision", getRevenuePrecision(obj));
            return jSONObject;
        } catch (JSONException e10) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while creating JSON object from " + BaseAdNetworkHelper.helperObjectName + " data", e10);
            return jSONObject;
        }
    }

    private static String getAdFormatName(Object obj) {
        try {
            return (String) Reflection.runInstanceMethod(Reflection.runInstanceMethod(obj, METHOD_FORMAT, null, new Object[0]), METHOD_DISPLAY_NAME, null, new Object[0]);
        } catch (Exception e10) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while getting adFormatName data from " + BaseAdNetworkHelper.helperObjectName + " object", e10);
            return null;
        }
    }

    private static String getAdUnitId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_UNIT_ID, "ad_unit_id");
    }

    private static String getCountry(Context context) {
        try {
            Object objRunStaticMethod = Reflection.runStaticMethod(APPLOVIN_SDK_CLASS, "getInstance", new Class[]{Context.class}, context);
            if (objRunStaticMethod == null) {
                return null;
            }
            return (String) Reflection.runInstanceMethod(Reflection.runInstanceMethod(objRunStaticMethod, METHOD_CONFIGURATION, null, new Object[0]), METHOD_COUNTRY_CODE, null, new Object[0]);
        } catch (Exception e10) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while getting countryCode data from " + BaseAdNetworkHelper.helperObjectName + " object", e10);
            return null;
        }
    }

    private static String getCreativeId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_CREATIVE_ID, "creative_id");
    }

    private static String getNetworkName(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_NETWORK_NAME, "network_name");
    }

    private static String getNetworkPlacement(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_NETWORK_PLACEMENT, KEY_NETWORK_PLACEMENT);
    }

    private static String getPlacement(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_PLACEMENT, "placement");
    }

    private static double getRevenue(Object obj) {
        return BaseAdNetworkHelper.getDouble(obj, METHOD_REVENUE, "revenue");
    }

    private static String getRevenuePrecision(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_REVENUE_PRECISION, "revenue_precision");
    }
}
