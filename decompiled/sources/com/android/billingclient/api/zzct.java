package com.android.billingclient.api;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12681b;

    zzct(JSONObject jSONObject) {
        this.f12680a = jSONObject.getString("rentalPeriod");
        String strOptString = jSONObject.optString("rentalExpirationPeriod");
        this.f12681b = true == strOptString.isEmpty() ? null : strOptString;
    }
}
