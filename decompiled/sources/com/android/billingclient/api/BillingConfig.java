package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@zzi
public final class BillingConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f12428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12429c;

    BillingConfig(String str) {
        this.f12427a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f12428b = jSONObject;
        this.f12429c = jSONObject.optString("countryCode");
    }

    @NonNull
    public String getCountryCode() {
        return this.f12429c;
    }
}
