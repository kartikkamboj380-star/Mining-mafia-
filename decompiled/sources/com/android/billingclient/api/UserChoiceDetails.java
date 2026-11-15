package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@zzl
public final class UserChoiceDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f12557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12558c;

    @zzl
    public static class Product {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f12559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f12560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12561c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f12559a.equals(product.getId()) && this.f12560b.equals(product.getType()) && Objects.equals(this.f12561c, product.getOfferToken());
        }

        @NonNull
        public String getId() {
            return this.f12559a;
        }

        public String getOfferToken() {
            return this.f12561c;
        }

        @NonNull
        public String getType() {
            return this.f12560b;
        }

        public int hashCode() {
            return Objects.hash(this.f12559a, this.f12560b, this.f12561c);
        }

        @NonNull
        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", this.f12559a, this.f12560b, this.f12561c);
        }

        private Product(JSONObject jSONObject) {
            this.f12559a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            this.f12560b = jSONObject.optString("productType");
            String strOptString = jSONObject.optString("offerToken");
            this.f12561c = true == strOptString.isEmpty() ? null : strOptString;
        }
    }

    UserChoiceDetails(String str) {
        this.f12556a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12557b = jSONObject;
        this.f12558c = a(jSONObject.optJSONArray("products"));
    }

    private static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new Product(jSONObjectOptJSONObject));
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f12557b.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId() {
        String strOptString = this.f12557b.optString("originalExternalTransactionId");
        if (strOptString.isEmpty()) {
            return null;
        }
        return strOptString;
    }

    @NonNull
    public List<Product> getProducts() {
        return this.f12558c;
    }
}
