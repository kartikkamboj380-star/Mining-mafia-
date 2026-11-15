package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.J2;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class l extends J2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BillingConfigResponseListener f12615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f12616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f12617c;

    /* synthetic */ l(BillingConfigResponseListener billingConfigResponseListener, r rVar, int i10, zzbj zzbjVar) {
        this.f12615a = billingConfigResponseListener;
        this.f12616b = rVar;
        this.f12617c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.K2
    public final void r(Bundle bundle) {
        if (bundle == null) {
            r rVar = this.f12616b;
            BillingResult billingResult = s.f12646j;
            rVar.d(zzcb.zza(63, 13, billingResult), this.f12617c);
            this.f12615a.onBillingConfigResponse(billingResult, null);
            return;
        }
        int iB = A.b(bundle, "BillingClient");
        String strG = A.g(bundle, "BillingClient");
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(iB);
        builderNewBuilder.setDebugMessage(strG);
        if (iB != 0) {
            A.k("BillingClient", "getBillingConfig() failed. Response code: " + iB);
            BillingResult billingResultBuild = builderNewBuilder.build();
            this.f12616b.d(zzcb.zza(23, 13, billingResultBuild), this.f12617c);
            this.f12615a.onBillingConfigResponse(billingResultBuild, null);
            return;
        }
        if (!bundle.containsKey("BILLING_CONFIG")) {
            A.k("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
            builderNewBuilder.setResponseCode(6);
            BillingResult billingResultBuild2 = builderNewBuilder.build();
            this.f12616b.d(zzcb.zza(64, 13, billingResultBuild2), this.f12617c);
            this.f12615a.onBillingConfigResponse(billingResultBuild2, null);
            return;
        }
        try {
            this.f12615a.onBillingConfigResponse(builderNewBuilder.build(), new BillingConfig(bundle.getString("BILLING_CONFIG")));
        } catch (JSONException e10) {
            A.l("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e10);
            r rVar2 = this.f12616b;
            BillingResult billingResult2 = s.f12646j;
            rVar2.d(zzcb.zza(65, 13, billingResult2), this.f12617c);
            this.f12615a.onBillingConfigResponse(billingResult2, null);
        }
    }
}
