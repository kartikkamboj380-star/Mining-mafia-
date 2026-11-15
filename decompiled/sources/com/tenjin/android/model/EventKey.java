package com.tenjin.android.model;

import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.utils.adnetwork.IronSourceHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class EventKey {
    public static String getEventKey(String str) {
        return str;
    }

    public static String getEventKey(String str, String str2) {
        return str + "." + str2;
    }

    public static String getEventKey(String str, int i10) {
        return str + "." + Integer.toString(i10);
    }

    public static String getEventKey(String str, String str2, int i10, double d10) {
        return str + "." + str2 + "." + Integer.toString(i10) + "." + Double.toString(d10);
    }

    public static String getEventKey(String str, String str2, int i10, double d10, String str3, String str4) {
        return str + "." + str2 + "." + Integer.toString(i10) + "." + Double.toString(d10);
    }

    public static String getEventKey(String str, String str2, int i10, double d10, String str3, String str4, String str5) {
        return str + "." + str2 + "." + Integer.toString(i10) + "." + Double.toString(d10) + "." + str3 + "." + str4 + "." + str5;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String getEventKey(String str, JSONObject jSONObject, String str2) {
        byte b10;
        try {
            switch (str.hashCode()) {
                case -927389981:
                    if (!str.equals(TenjinConsts.AD_NETWORK_IRONSOURCE)) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case -114321647:
                    if (!str.equals(TenjinConsts.AD_NETWORK_HYPERBID)) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 92668925:
                    if (!str.equals(TenjinConsts.AD_NETWORK_ADMOB)) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case 110546420:
                    if (!str.equals(TenjinConsts.AD_NETWORK_TOPON)) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case 1179703863:
                    if (!str.equals(TenjinConsts.AD_NETWORK_APPLOVIN)) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                return "ad_revenue." + str + "." + jSONObject.get("ad_unit_id").toString();
            }
            if (b10 == 1) {
                return "ad_revenue." + str + "." + jSONObject.get(IronSourceHelper.KEY_AUCTION_ID).toString();
            }
            if (b10 == 2) {
                return "ad_revenue." + str + "." + jSONObject.get("adsource_id").toString();
            }
            if (b10 == 3) {
                return "ad_revenue." + str + "." + jSONObject.get("ad_unit_id").toString();
            }
            if (b10 != 4) {
                return "ad_revenue." + str + "." + str2;
            }
            return "ad_revenue." + str + "." + jSONObject.get("adsource_id").toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "ad_revenue." + str + "." + str2;
        }
    }

    public static String getEventKey(Transaction transaction) {
        return transaction.getProductId() + "." + transaction.getCurrencyCode() + "." + Integer.toString(transaction.getQuantity()) + "." + Double.toString(transaction.getUnitPrice()) + "." + transaction.getReceiptId() + "." + transaction.getUserId() + "." + transaction.getPurchaseData();
    }
}
