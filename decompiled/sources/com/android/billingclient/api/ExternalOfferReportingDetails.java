package com.android.billingclient.api;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@zzh
public final class ExternalOfferReportingDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12466a;

    ExternalOfferReportingDetails(String str) {
        this.f12466a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f12466a;
    }
}
