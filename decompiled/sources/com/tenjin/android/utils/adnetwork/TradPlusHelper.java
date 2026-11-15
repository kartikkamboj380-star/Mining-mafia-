package com.tenjin.android.utils.adnetwork;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TradPlusHelper extends BaseAdNetworkHelper {
    public static final String KEY_AB_TEST = "ab_test";
    public static final String KEY_AD_NETWORK = "network_name";
    public static final String KEY_AD_UNIT = "ad_unit_id";
    public static final String KEY_COUNTRY = "country";
    public static final String KEY_FORMAT = "format";
    public static final String KEY_PLACEMENT = "placement";
    public static final String KEY_PRECISION = "revenue_precision";
    public static final String KEY_REVENUE = "revenue";
    public static final String KEY_SEGMENT = "segment";
    private static final String METHOD_AD_NETWORK = "adSourceName";
    private static final String METHOD_AD_TYPE = "format";
    private static final String METHOD_AD_UNIT_ID = "tpAdUnitId";
    private static final String METHOD_BUCKET = "bucketId";
    private static final String METHOD_COUNTRY = "isoCode";
    private static final String METHOD_PLACEMENT = "adSourcePlacementId";
    private static final String METHOD_PRECISION = "ecpmPrecision";
    private static final String METHOD_REVENUE = "ecpm";
    private static final String METHOD_SEGMENT = "segmentId";

    static {
        BaseAdNetworkHelper.logTag = TradPlusHelper.class.getSimpleName();
        BaseAdNetworkHelper.helperObjectName = "TradPlus";
        BaseAdNetworkHelper.useFields = true;
    }

    public static JSONObject convertToJsonObject(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_unit_id", getAdUnitId(obj));
            jSONObject.put("network_name", getAdNetwork(obj));
            jSONObject.put("revenue", getRevenue(obj));
            jSONObject.put("revenue_precision", getPrecision(obj));
            jSONObject.put("format", getFormat(obj));
            jSONObject.put(KEY_SEGMENT, getSegmentId(obj));
            jSONObject.put(KEY_AB_TEST, getBucketId(obj));
            jSONObject.put("country", getCountry(obj));
            jSONObject.put("placement", getPlacementId(obj));
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

    private static String getBucketId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_BUCKET, KEY_AB_TEST);
    }

    private static String getCountry(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_COUNTRY, "country");
    }

    private static String getFormat(Object obj) {
        return BaseAdNetworkHelper.getString(obj, "format", "format");
    }

    private static String getPlacementId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_PLACEMENT, "placement");
    }

    private static String getPrecision(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_PRECISION, "revenue_precision");
    }

    private static String getRevenue(Object obj) {
        return BaseAdNetworkHelper.getString(obj, "ecpm", "revenue");
    }

    private static String getSegmentId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_SEGMENT, KEY_SEGMENT);
    }
}
