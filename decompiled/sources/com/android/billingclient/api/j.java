package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.S0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class j extends S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ExternalOfferReportingDetailsListener f12610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f12611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f12612c;

    /* synthetic */ j(ExternalOfferReportingDetailsListener externalOfferReportingDetailsListener, r rVar, int i10, zzbf zzbfVar) {
        this.f12610a = externalOfferReportingDetailsListener;
        this.f12611b = rVar;
        this.f12612c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6457s1
    public final void r(Bundle bundle) {
        if (bundle == null) {
            r rVar = this.f12611b;
            BillingResult billingResult = s.f12646j;
            rVar.d(zzcb.zza(95, 24, billingResult), this.f12612c);
            this.f12610a.onExternalOfferReportingDetailsResponse(billingResult, null);
            return;
        }
        int iB = A.b(bundle, "BillingClient");
        BillingResult billingResultA = s.a(iB, A.g(bundle, "BillingClient"));
        if (iB != 0) {
            A.k("BillingClient", "createExternalOfferReportingDetailsAsync() failed. Response code: " + iB);
            this.f12611b.d(zzcb.zza(23, 24, billingResultA), this.f12612c);
            this.f12610a.onExternalOfferReportingDetailsResponse(billingResultA, null);
            return;
        }
        try {
            this.f12610a.onExternalOfferReportingDetailsResponse(billingResultA, new ExternalOfferReportingDetails(bundle.getString("CREATE_EXTERNAL_PAYMENT_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            A.l("BillingClient", "Error when parsing invalid external offer reporting details. \n Exception: ", e10);
            r rVar2 = this.f12611b;
            BillingResult billingResult2 = s.f12646j;
            rVar2.d(zzcb.zza(104, 24, billingResult2), this.f12612c);
            this.f12610a.onExternalOfferReportingDetailsResponse(billingResult2, null);
        }
    }
}
