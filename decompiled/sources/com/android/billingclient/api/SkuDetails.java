package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SkuDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f12549b;

    public SkuDetails(@NonNull String str) {
        this.f12548a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12549b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    final String a() {
        return this.f12549b.optString("skuDetailsToken");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.f12548a, ((SkuDetails) obj).f12548a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f12549b.optString("description");
    }

    @NonNull
    public String getFreeTrialPeriod() {
        return this.f12549b.optString("freeTrialPeriod");
    }

    @NonNull
    public String getIconUrl() {
        return this.f12549b.optString("iconUrl");
    }

    @NonNull
    public String getIntroductoryPrice() {
        return this.f12549b.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.f12549b.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.f12549b.optInt("introductoryPriceCycles");
    }

    @NonNull
    public String getIntroductoryPricePeriod() {
        return this.f12549b.optString("introductoryPricePeriod");
    }

    @NonNull
    public String getOriginalJson() {
        return this.f12548a;
    }

    @NonNull
    public String getOriginalPrice() {
        return this.f12549b.has("original_price") ? this.f12549b.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        return this.f12549b.has("original_price_micros") ? this.f12549b.optLong("original_price_micros") : getPriceAmountMicros();
    }

    @NonNull
    public String getPrice() {
        return this.f12549b.optString(InAppPurchaseMetaData.KEY_PRICE);
    }

    public long getPriceAmountMicros() {
        return this.f12549b.optLong("price_amount_micros");
    }

    @NonNull
    public String getPriceCurrencyCode() {
        return this.f12549b.optString("price_currency_code");
    }

    @NonNull
    public String getSku() {
        return this.f12549b.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
    }

    @NonNull
    public String getSubscriptionPeriod() {
        return this.f12549b.optString("subscriptionPeriod");
    }

    @NonNull
    public String getTitle() {
        return this.f12549b.optString("title");
    }

    @NonNull
    public String getType() {
        return this.f12549b.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
    }

    public int hashCode() {
        return this.f12548a.hashCode();
    }

    @NonNull
    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.f12548a));
    }

    public int zza() {
        return this.f12549b.optInt("offer_type");
    }

    @NonNull
    public String zzb() {
        return this.f12549b.optString("offer_id");
    }

    @NonNull
    public String zzc() {
        String strOptString = this.f12549b.optString("offerIdToken");
        return strOptString.isEmpty() ? this.f12549b.optString("offer_id_token") : strOptString;
    }

    @NonNull
    public final String zzd() {
        return this.f12549b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    @NonNull
    public String zze() {
        return this.f12549b.optString("serializedDocid");
    }
}
