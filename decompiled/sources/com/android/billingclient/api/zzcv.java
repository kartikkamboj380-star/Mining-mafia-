package com.android.billingclient.api;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ProductDetails.PricingPhase f12687f;

    zzcv(JSONObject jSONObject) {
        this.f12682a = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f12683b = jSONObject.optString("title");
        this.f12684c = jSONObject.optString(MediationMetaData.KEY_NAME);
        this.f12685d = jSONObject.optString("description");
        this.f12686e = jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.f12687f = jSONObjectOptJSONObject == null ? null : new ProductDetails.PricingPhase(jSONObjectOptJSONObject);
    }
}
