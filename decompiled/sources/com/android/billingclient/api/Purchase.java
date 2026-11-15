package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Purchase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f12529c;

    @zzk
    public static final class PendingPurchaseUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final JSONObject f12530a;

        private PendingPurchaseUpdate(JSONObject jSONObject) {
            this.f12530a = jSONObject;
        }

        @NonNull
        public List<String> getProducts() {
            JSONArray jSONArrayOptJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.f12530a.has("productIds") && (jSONArrayOptJSONArray = this.f12530a.optJSONArray("productIds")) != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
            return arrayList;
        }

        @NonNull
        public String getPurchaseToken() {
            return this.f12530a.optString("purchaseToken");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(@NonNull String str, @NonNull String str2) {
        this.f12527a = str;
        this.f12528b = str2;
        this.f12529c = new JSONObject(str);
    }

    private final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        if (this.f12529c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.f12529c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i10));
                }
            }
        } else if (this.f12529c.has(InAppPurchaseMetaData.KEY_PRODUCT_ID)) {
            arrayList.add(this.f12529c.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f12527a, purchase.getOriginalJson()) && TextUtils.equals(this.f12528b, purchase.getSignature());
    }

    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.f12529c;
        String strOptString = jSONObject.optString("obfuscatedAccountId");
        String strOptString2 = jSONObject.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.f12529c.optString("developerPayload");
    }

    public String getOrderId() {
        String strOptString = this.f12529c.optString("orderId");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public String getOriginalJson() {
        return this.f12527a;
    }

    @NonNull
    public String getPackageName() {
        return this.f12529c.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @zzk
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject jSONObjectOptJSONObject = this.f12529c.optJSONObject("pendingPurchaseUpdate");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(jSONObjectOptJSONObject);
    }

    @NonNull
    public List<String> getProducts() {
        return a();
    }

    public int getPurchaseState() {
        return this.f12529c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.f12529c.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.f12529c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.f12529c.optInt("quantity", 1);
    }

    @NonNull
    public String getSignature() {
        return this.f12528b;
    }

    @NonNull
    @Deprecated
    public ArrayList<String> getSkus() {
        return a();
    }

    public int hashCode() {
        return this.f12527a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.f12529c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.f12529c.optBoolean("autoRenewing");
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f12527a));
    }
}
