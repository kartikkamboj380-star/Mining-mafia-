package com.tenjin.android.utils.adnetwork;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class HyperBidHelper extends BaseAdNetworkHelper {
    public static final String KEY_AD_NETWORK_TYPE = "ad_network_type";
    public static final String KEY_AD_SOURCE_ID = "adsource_id";
    public static final String KEY_AD_SOURCE_INDEX = "adsource_index";
    public static final String KEY_CHANNEL = "channel";
    public static final String KEY_COUNTRY = "country";
    public static final String KEY_CURRENCY = "currency";
    public static final String KEY_CUSTOM_RULE = "custom_rule";
    public static final String KEY_ECPM = "ecpm";
    public static final String KEY_ECPM_LEVEL = "ecpm_level";
    public static final String KEY_ECPM_PRECISION = "ecpm_precision";
    public static final String KEY_HEADER_BIDDING_ADSOURCE = "is_header_bidding_adsource";
    public static final String KEY_HYPERBID_AD_FORMAT = "hyper_bid_ad_format";
    public static final String KEY_HYPERBID_PLACEMENT_ID = "hyper_bid_placement_id";
    public static final String KEY_NETWORK_FIRM_ID = "network_firm_id";
    public static final String KEY_NETWORK_PLACEMENT_ID = "network_placement_id";
    public static final String KEY_PUBLISHER_REVENUE = "publisher_revenue";
    public static final String KEY_REWARD_USER_CUSTOM_DATA = "reward_user_custom_data";
    public static final String KEY_SCENARIO_ID = "scenario_id";
    public static final String KEY_SCENARIO_REWARD_NAME = "scenario_reward_name";
    public static final String KEY_SCENARIO_REWARD_NUMBER = "scenario_reward_number";
    public static final String KEY_SEGMENT_ID = "segment_id";
    public static final String KEY_SHOW_ID = "show_id";
    public static final String KEY_SUB_CHANNEL = "sub_channel";
    private static final String METHOD_AD_NETWORK_TYPE = "getAdNetworkType";
    private static final String METHOD_AD_SOURCE_ID = "getAdsourceId";
    private static final String METHOD_AD_SOURCE_INDEX = "getAdsourceIndex";
    private static final String METHOD_CHANNEL = "getChannel";
    private static final String METHOD_COUNTRY = "getCountry";
    private static final String METHOD_CURRENCY = "getCurrency";
    private static final String METHOD_CUSTOM_RULE = "getCustomRule";
    private static final String METHOD_ECPM = "getEcpm";
    private static final String METHOD_ECPM_LEVEL = "getEcpmLevel";
    private static final String METHOD_ECPM_PRECISION = "getEcpmPrecision";
    private static final String METHOD_HEADER_BIDDING_ADSOURCE = "isHeaderBiddingAdsource";
    private static final String METHOD_HYPERBID_AD_FORMAT = "getHyperBidAdFormat";
    private static final String METHOD_HYPERBID_PLACEMENT_ID = "getHyperBidPlacementId";
    private static final String METHOD_NETWORK_FIRM_ID = "getNetworkFirmId";
    private static final String METHOD_NETWORK_PLACEMENT_ID = "getNetworkPlacementId";
    private static final String METHOD_PUBLISHER_REVENUE = "getPublisherRevenue";
    private static final String METHOD_REWARD_USER_CUSTOM_DATA = "getRewardUserCustomData";
    private static final String METHOD_SCENARIO_ID = "getScenarioId";
    private static final String METHOD_SCENARIO_REWARD_NAME = "getScenarioRewardName";
    private static final String METHOD_SCENARIO_REWARD_NUMBER = "getScenarioRewardNumber";
    private static final String METHOD_SEGMENT_ID = "getSegmentId";
    private static final String METHOD_SHOW_ID = "getShowId";
    private static final String METHOD_SUB_CHANNEL = "getSubChannel";

    static {
        BaseAdNetworkHelper.logTag = HyperBidHelper.class.getSimpleName();
        BaseAdNetworkHelper.helperObjectName = "HyperBid";
    }

    public static JSONObject convertToJsonObject(Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("network_firm_id", getNetworkFirmId(obj));
            jSONObject.put("adsource_id", getAdsourceId(obj));
            jSONObject.put("adsource_index", getAdsourceIndex(obj));
            jSONObject.put("ecpm", getEcpm(obj));
            jSONObject.put("is_header_bidding_adsource", isHeaderBiddingAdsource(obj));
            jSONObject.put("show_id", getShowId(obj));
            jSONObject.put("publisher_revenue", getPublisherRevenue(obj));
            jSONObject.put("currency", getCurrency(obj));
            jSONObject.put("country", getCountry(obj));
            jSONObject.put(KEY_HYPERBID_PLACEMENT_ID, getHyperBidPlacementId(obj));
            jSONObject.put(KEY_HYPERBID_AD_FORMAT, getHyperBidAdFormat(obj));
            jSONObject.put("ecpm_precision", getEcpmPrecision(obj));
            jSONObject.put("ad_network_type", getAdNetworkType(obj));
            jSONObject.put("network_placement_id", getNetworkPlacementId(obj));
            jSONObject.put("ecpm_level", getEcpmLevel(obj));
            jSONObject.put("segment_id", getSegmentId(obj));
            jSONObject.put("scenario_id", getScenarioId(obj));
            jSONObject.put("scenario_reward_name", getScenarioRewardName(obj));
            jSONObject.put("scenario_reward_number", getScenarioRewardNumber(obj));
            jSONObject.put("sub_channel", getSubChannel(obj));
            jSONObject.put("channel", getChannel(obj));
            jSONObject.put("custom_rule", getCustomRule(obj));
            jSONObject.put("reward_user_custom_data", getRewardUserCustomData(obj));
            return jSONObject;
        } catch (JSONException e10) {
            Log.d(BaseAdNetworkHelper.logTag, "Error while creating JSON object from " + BaseAdNetworkHelper.helperObjectName + " data", e10);
            return jSONObject;
        }
    }

    private static String getAdNetworkType(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_NETWORK_TYPE, "ad_network_type");
    }

    private static String getAdsourceId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_AD_SOURCE_ID, "adsource_id");
    }

    private static int getAdsourceIndex(Object obj) {
        return BaseAdNetworkHelper.getInt(obj, METHOD_AD_SOURCE_INDEX, "adsource_index");
    }

    private static String getChannel(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_CHANNEL, "channel");
    }

    private static String getCountry(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_COUNTRY, "country");
    }

    private static String getCurrency(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_CURRENCY, "currency");
    }

    private static String getCustomRule(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_CUSTOM_RULE, "custom_rule");
    }

    private static double getEcpm(Object obj) {
        return BaseAdNetworkHelper.getDouble(obj, METHOD_ECPM, "ecpm");
    }

    private static int getEcpmLevel(Object obj) {
        return BaseAdNetworkHelper.getInt(obj, METHOD_ECPM_LEVEL, "ecpm_level");
    }

    private static String getEcpmPrecision(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_ECPM_PRECISION, "ecpm_precision");
    }

    private static String getHyperBidAdFormat(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_HYPERBID_AD_FORMAT, KEY_HYPERBID_AD_FORMAT);
    }

    private static String getHyperBidPlacementId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_HYPERBID_PLACEMENT_ID, KEY_HYPERBID_PLACEMENT_ID);
    }

    private static int getNetworkFirmId(Object obj) {
        return BaseAdNetworkHelper.getInt(obj, METHOD_NETWORK_FIRM_ID, "network_firm_id");
    }

    private static String getNetworkPlacementId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_NETWORK_PLACEMENT_ID, "network_placement_id");
    }

    private static double getPublisherRevenue(Object obj) {
        return BaseAdNetworkHelper.getDouble(obj, METHOD_PUBLISHER_REVENUE, "publisher_revenue");
    }

    private static String getRewardUserCustomData(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_REWARD_USER_CUSTOM_DATA, "reward_user_custom_data");
    }

    private static String getScenarioId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_SCENARIO_ID, "scenario_id");
    }

    private static String getScenarioRewardName(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_SCENARIO_REWARD_NAME, "scenario_reward_name");
    }

    private static int getScenarioRewardNumber(Object obj) {
        return BaseAdNetworkHelper.getInt(obj, METHOD_SCENARIO_REWARD_NUMBER, "scenario_reward_number");
    }

    private static int getSegmentId(Object obj) {
        return BaseAdNetworkHelper.getInt(obj, METHOD_SEGMENT_ID, "segment_id");
    }

    private static String getShowId(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_SHOW_ID, "show_id");
    }

    private static String getSubChannel(Object obj) {
        return BaseAdNetworkHelper.getString(obj, METHOD_SUB_CHANNEL, "sub_channel");
    }

    private static int isHeaderBiddingAdsource(Object obj) {
        return BaseAdNetworkHelper.getInt(obj, METHOD_HEADER_BIDDING_ADSOURCE, "is_header_bidding_adsource");
    }
}
