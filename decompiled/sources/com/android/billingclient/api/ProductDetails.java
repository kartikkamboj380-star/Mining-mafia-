package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.play_billing.AbstractC6420j;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ProductDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f12476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f12480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f12481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f12483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f12484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f12485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f12486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f12487m;

    @zzj
    public static final class InstallmentPlanDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12489b;

        InstallmentPlanDetails(JSONObject jSONObject) {
            this.f12488a = jSONObject.getInt("commitmentPaymentsCount");
            this.f12489b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzj
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.f12488a;
        }

        @zzj
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.f12489b;
        }
    }

    public static final class OneTimePurchaseOfferDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f12491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f12493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f12494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f12495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AbstractC6420j f12496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Long f12497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final zzcq f12498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final zzcu f12499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final zzcr f12500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final zzcs f12501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final zzct f12502m;

        OneTimePurchaseOfferDetails(JSONObject jSONObject) {
            this.f12490a = jSONObject.optString("formattedPrice");
            this.f12491b = jSONObject.optLong("priceAmountMicros");
            this.f12492c = jSONObject.optString("priceCurrencyCode");
            String strOptString = jSONObject.optString("offerIdToken");
            this.f12493d = true == strOptString.isEmpty() ? null : strOptString;
            String strOptString2 = jSONObject.optString("offerId");
            this.f12494e = true == strOptString2.isEmpty() ? null : strOptString2;
            String strOptString3 = jSONObject.optString("purchaseOptionId");
            this.f12495f = true == strOptString3.isEmpty() ? null : strOptString3;
            jSONObject.optInt("offerType");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f12496g = AbstractC6420j.l(arrayList);
            this.f12497h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.f12498i = jSONObjectOptJSONObject == null ? null : new zzcq(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.f12499j = jSONObjectOptJSONObject2 == null ? null : new zzcu(jSONObjectOptJSONObject2);
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.f12500k = jSONObjectOptJSONObject3 == null ? null : new zzcr(jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f12501l = jSONObjectOptJSONObject4 == null ? null : new zzcs(jSONObjectOptJSONObject4);
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.f12502m = jSONObjectOptJSONObject5 != null ? new zzct(jSONObjectOptJSONObject5) : null;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f12490a;
        }

        public long getPriceAmountMicros() {
            return this.f12491b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f12492c;
        }

        public final String zza() {
            return this.f12493d;
        }
    }

    public static final class PricingPhase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f12504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f12506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f12507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f12508f;

        PricingPhase(JSONObject jSONObject) {
            this.f12506d = jSONObject.optString("billingPeriod");
            this.f12505c = jSONObject.optString("priceCurrencyCode");
            this.f12503a = jSONObject.optString("formattedPrice");
            this.f12504b = jSONObject.optLong("priceAmountMicros");
            this.f12508f = jSONObject.optInt("recurrenceMode");
            this.f12507e = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.f12507e;
        }

        @NonNull
        public String getBillingPeriod() {
            return this.f12506d;
        }

        @NonNull
        public String getFormattedPrice() {
            return this.f12503a;
        }

        public long getPriceAmountMicros() {
            return this.f12504b;
        }

        @NonNull
        public String getPriceCurrencyCode() {
            return this.f12505c;
        }

        public int getRecurrenceMode() {
            return this.f12508f;
        }
    }

    public static class PricingPhases {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12509a;

        PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        arrayList.add(new PricingPhase(jSONObjectOptJSONObject));
                    }
                }
            }
            this.f12509a = arrayList;
        }

        @NonNull
        public List<PricingPhase> getPricingPhaseList() {
            return this.f12509a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    public static final class SubscriptionOfferDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final PricingPhases f12513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f12514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InstallmentPlanDetails f12515f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final zzcv f12516g;

        SubscriptionOfferDetails(JSONObject jSONObject) {
            this.f12510a = jSONObject.optString("basePlanId");
            String strOptString = jSONObject.optString("offerId");
            this.f12511b = true == strOptString.isEmpty() ? null : strOptString;
            this.f12512c = jSONObject.getString("offerIdToken");
            this.f12513d = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f12515f = jSONObjectOptJSONObject == null ? null : new InstallmentPlanDetails(jSONObjectOptJSONObject);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            this.f12516g = jSONObjectOptJSONObject2 != null ? new zzcv(jSONObjectOptJSONObject2) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            this.f12514e = arrayList;
        }

        @NonNull
        public String getBasePlanId() {
            return this.f12510a;
        }

        @zzj
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f12515f;
        }

        public String getOfferId() {
            return this.f12511b;
        }

        @NonNull
        public List<String> getOfferTags() {
            return this.f12514e;
        }

        @NonNull
        public String getOfferToken() {
            return this.f12512c;
        }

        @NonNull
        public PricingPhases getPricingPhases() {
            return this.f12513d;
        }
    }

    ProductDetails(String str) {
        this.f12475a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12476b = jSONObject;
        String strOptString = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f12477c = strOptString;
        String strOptString2 = jSONObject.optString(HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        this.f12478d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f12479e = jSONObject.optString("title");
        this.f12480f = jSONObject.optString(MediationMetaData.KEY_NAME);
        this.f12481g = jSONObject.optString("description");
        this.f12483i = jSONObject.optString("packageDisplayName");
        this.f12484j = jSONObject.optString("iconUrl");
        this.f12482h = jSONObject.optString("skuDetailsToken");
        this.f12485k = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                arrayList.add(new SubscriptionOfferDetails(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
            this.f12486l = arrayList;
        } else {
            this.f12486l = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f12476b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f12476b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(jSONArrayOptJSONArray2.getJSONObject(i11)));
            }
            this.f12487m = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.f12487m = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(jSONObjectOptJSONObject));
            this.f12487m = arrayList2;
        }
    }

    final String a() {
        return this.f12482h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f12475a, ((ProductDetails) obj).f12475a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.f12481g;
    }

    @NonNull
    public String getName() {
        return this.f12480f;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.f12487m;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) this.f12487m.get(0);
    }

    @NonNull
    public String getProductId() {
        return this.f12477c;
    }

    @NonNull
    public String getProductType() {
        return this.f12478d;
    }

    public List<SubscriptionOfferDetails> getSubscriptionOfferDetails() {
        return this.f12486l;
    }

    @NonNull
    public String getTitle() {
        return this.f12479e;
    }

    public int hashCode() {
        return this.f12475a.hashCode();
    }

    @NonNull
    public String toString() {
        List list = this.f12486l;
        return "ProductDetails{jsonString='" + this.f12475a + "', parsedJson=" + this.f12476b.toString() + ", productId='" + this.f12477c + "', productType='" + this.f12478d + "', title='" + this.f12479e + "', productDetailsToken='" + this.f12482h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }

    @NonNull
    public final String zza() {
        return this.f12476b.optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
    }

    public String zzc() {
        return this.f12485k;
    }
}
