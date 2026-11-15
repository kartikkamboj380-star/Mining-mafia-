package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class PurchaseHistoryRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f12533c;

    public PurchaseHistoryRecord(@NonNull String str, @NonNull String str2) {
        this.f12531a = str;
        this.f12532b = str2;
        this.f12533c = new JSONObject(str);
    }

    private final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f12533c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f12533c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f12533c.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(this.f12533c.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.f12531a, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.f12532b, purchaseHistoryRecord.getSignature());
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f12533c.optString("developerPayload");
    }

    @NonNull
    public String getOriginalJson() {
        return this.f12531a;
    }

    @NonNull
    public List<String> getProducts() {
        return a();
    }

    public long getPurchaseTime() {
        return this.f12533c.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f12533c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f12533c.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.f12532b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f12531a.hashCode();
    }

    @NonNull
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f12531a));
    }
}
