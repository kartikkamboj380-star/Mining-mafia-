package com.tenjin.android.model;

import com.tenjin.android.AttributionInfoCallback;
import com.tenjin.android.BasicCallback;
import com.tenjin.android.Callback;
import com.tenjin.android.config.TenjinConsts;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class EventName {
    private String adImpressionAdNetwork;
    private JSONObject adImpressionData;
    private AttributionInfoCallback attributionInfoCallback;
    private String currencyCode;
    private String dataSignature;
    private Callback deferredDeeplinkCallback;
    private int intValue;
    private String name;
    private String productId;
    private String purchaseData;
    private int quantity;
    private String receiptId;
    private Transaction transactionData;
    private final String type;
    private double unitPrice;
    private String userId;
    private String value;

    public EventName(String str) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = TenjinConsts.EVENT_NAME;
        this.name = str;
    }

    public String getAdImpressionAdNetwork() {
        return this.adImpressionAdNetwork;
    }

    public JSONObject getAdImpressionData() {
        return this.adImpressionData;
    }

    public AttributionInfoCallback getAttributionInfoCallback() {
        return this.attributionInfoCallback;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getDataSignature() {
        return this.dataSignature;
    }

    public Callback getDeferredDeeplinkCallback() {
        return this.deferredDeeplinkCallback;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public String getName() {
        return this.name;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getPurchaseData() {
        return this.purchaseData;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getReceiptId() {
        return this.receiptId;
    }

    public Transaction getTransactionData() {
        return this.transactionData;
    }

    public String getType() {
        return this.type;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getValue() {
        return this.value;
    }

    public EventName(String str, String str2) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = TenjinConsts.EVENT_NAME_VALUE;
        this.name = str;
        this.value = str2;
    }

    public EventName(String str, int i10) {
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = TenjinConsts.EVENT_NAME_INT_VALUE;
        this.name = str;
        this.intValue = i10;
    }

    public EventName(String str, String str2, int i10) {
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = str2;
        this.name = str;
        this.intValue = i10;
    }

    public EventName(String str, String str2, int i10, double d10) {
        this.intValue = 0;
        this.type = TenjinConsts.EVENT_NAME_TRANSACTION;
        this.productId = str;
        this.currencyCode = str2;
        this.quantity = i10;
        this.unitPrice = d10;
    }

    public EventName(String str, String str2, int i10, double d10, String str3, String str4) {
        this.intValue = 0;
        this.type = TenjinConsts.EVENT_NAME_TRANSACTION_DATA;
        this.productId = str;
        this.currencyCode = str2;
        this.quantity = i10;
        this.unitPrice = d10;
        this.purchaseData = str3;
        this.dataSignature = str4;
    }

    public EventName(Transaction transaction) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = transaction.transactionEventName();
        this.transactionData = transaction;
    }

    public EventName(String str, JSONObject jSONObject) {
        byte b10 = 0;
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        str.getClass();
        switch (str.hashCode()) {
            case -927389981:
                if (!str.equals(TenjinConsts.AD_NETWORK_IRONSOURCE)) {
                    b10 = -1;
                }
                break;
            case -114321647:
                b10 = !str.equals(TenjinConsts.AD_NETWORK_HYPERBID) ? (byte) -1 : (byte) 1;
                break;
            case 98261:
                b10 = !str.equals(TenjinConsts.AD_NETWORK_CAS) ? (byte) -1 : (byte) 2;
                break;
            case 92668925:
                b10 = !str.equals(TenjinConsts.AD_NETWORK_ADMOB) ? (byte) -1 : (byte) 3;
                break;
            case 110546420:
                b10 = !str.equals(TenjinConsts.AD_NETWORK_TOPON) ? (byte) -1 : (byte) 4;
                break;
            case 1179703863:
                b10 = !str.equals(TenjinConsts.AD_NETWORK_APPLOVIN) ? (byte) -1 : (byte) 5;
                break;
            case 1271564347:
                b10 = !str.equals(TenjinConsts.AD_NETWORK_TRADPLUS) ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_IRONSOURCE;
                break;
            case 1:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_HYPERBID;
                break;
            case 2:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_CAS;
                break;
            case 3:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_ADMOB;
                break;
            case 4:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_TOPON;
                break;
            case 5:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_APPLOVIN;
                break;
            case 6:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA_TRADPLUS;
                break;
            default:
                this.type = TenjinConsts.EVENT_AD_IMPRESSION_DATA;
                break;
        }
        this.adImpressionAdNetwork = str;
        this.adImpressionData = jSONObject;
    }

    public EventName(String str, BasicCallback basicCallback) {
        this.intValue = 0;
        this.quantity = 0;
        this.unitPrice = 0.0d;
        this.type = str;
        if (basicCallback instanceof Callback) {
            this.deferredDeeplinkCallback = (Callback) basicCallback;
        } else {
            if (basicCallback instanceof AttributionInfoCallback) {
                this.attributionInfoCallback = (AttributionInfoCallback) basicCallback;
                return;
            }
            throw new UnsupportedOperationException("Missing callback implementation");
        }
    }
}
