package com.android.billingclient.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@zzg
@KeepForSdk
public final class AlternativeBillingOnlyReportingDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12420a;

    AlternativeBillingOnlyReportingDetails(String str) {
        this.f12420a = new JSONObject(str).optString("externalTransactionToken");
    }

    @NonNull
    public String getExternalTransactionToken() {
        return this.f12420a;
    }
}
