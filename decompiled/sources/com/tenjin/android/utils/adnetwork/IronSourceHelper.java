package com.tenjin.android.utils.adnetwork;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IronSourceHelper extends BaseAdNetworkHelper {
    public static final String KEY_AB = "ab";
    public static final String KEY_AD_NETWORK = "ad_network";
    public static final String KEY_AD_UNIT = "ad_unit";
    public static final String KEY_AUCTION_ID = "auction_id";
    public static final String KEY_COUNTRY = "country";
    public static final String KEY_ENCRYPTED_CPM = "encrypted_cpm";
    public static final String KEY_INSTANCE_ID = "instance_id";
    public static final String KEY_INSTANCE_NAME = "instance_name";
    public static final String KEY_LIFETIME_REVENUE = "lifetime_revenue";
    public static final String KEY_PLACEMENT = "placement";
    public static final String KEY_PRECISION = "precision";
    public static final String KEY_REVENUE = "revenue";
    public static final String KEY_SEGMENT_NAME = "segment_name";
    private static final String METHOD_AB = "getAb";
    private static final String METHOD_AD_NETWORK = "getAdNetwork";
    private static final String METHOD_AD_UNIT = "getAdUnit";
    private static final String METHOD_AUCTION_ID = "getAuctionId";
    private static final String METHOD_COUNTRY = "getCountry";
    private static final String METHOD_ENCRYPTED_CPM = "getEncryptedCPM";
    private static final String METHOD_INSTANCE_ID = "getInstanceId";
    private static final String METHOD_INSTANCE_NAME = "getInstanceName";
    private static final String METHOD_LIFETIME_REVENUE = "getLifetimeRevenue";
    private static final String METHOD_PLACEMENT = "getPlacement";
    private static final String METHOD_PRECISION = "getPrecision";
    private static final String METHOD_REVENUE = "getRevenue";
    private static final String METHOD_SEGMENT_NAME = "getSegmentName";

    static {
        BaseAdNetworkHelper.logTag = IronSourceHelper.class.getSimpleName();
        BaseAdNetworkHelper.helperObjectName = "IronSource";
    }

    public static JSONObject convertToJsonObject(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_AUCTION_ID, getAuctionId(obj));
            jSONObject.put("ad_unit", getAdUnit(obj));
            jSONObject.put("country", getCountry(obj));
            jSONObject.put(KEY_AB, getAb(obj));
            jSONObject.put(KEY_SEGMENT_NAME, getSegmentName(obj));
            jSONObject.put("placement", getPlacement(obj));
            jSONObject.put("ad_network", getAdNetwork(obj));
            jSONObject.put(KEY_INSTANCE_NAME, getInstanceName(obj));
            jSONObject.put(KEY_INSTANCE_ID, getInstanceId(obj));
            jSONObject.put("revenue", getRevenue(obj));
            jSONObject.put(KEY_PRECISION, getPrecision(obj));
            jSONObject.put(KEY_LIFETIME_REVENUE, getLifetimeRevenue(obj));
            jSONObject.put(KEY_ENCRYPTED_CPM, getEncryptedCPM(obj));
            return jSONObject;
        } catch (JSONException e10) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while creating JSON object from " + BaseAdNetworkHelper.helperObjectName + " data", e10);
            return jSONObject;
        }
    }

    private static String getAb(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AB, KEY_AB);
    }

    private static String getAdNetwork(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_NETWORK, "ad_network");
    }

    private static String getAdUnit(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_UNIT, "ad_unit");
    }

    private static String getAuctionId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AUCTION_ID, KEY_AUCTION_ID);
    }

    private static String getCountry(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_COUNTRY, "country");
    }

    private static String getEncryptedCPM(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_ENCRYPTED_CPM, KEY_ENCRYPTED_CPM);
    }

    private static String getInstanceId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_INSTANCE_ID, KEY_INSTANCE_ID);
    }

    private static String getInstanceName(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_INSTANCE_NAME, KEY_INSTANCE_NAME);
    }

    private static double getLifetimeRevenue(Object obj) {
        return BaseAdNetworkHelper.getDouble(obj, METHOD_LIFETIME_REVENUE, KEY_LIFETIME_REVENUE);
    }

    private static String getPlacement(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_PLACEMENT, "placement");
    }

    private static String getPrecision(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_PRECISION, KEY_PRECISION);
    }

    private static double getRevenue(Object obj) {
        return BaseAdNetworkHelper.getDouble(obj, METHOD_REVENUE, "revenue");
    }

    private static String getSegmentName(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_SEGMENT_NAME, KEY_SEGMENT_NAME);
    }
}
