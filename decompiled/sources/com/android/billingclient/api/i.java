package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.AbstractBinderC6389b0;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class i extends AbstractBinderC6389b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AlternativeBillingOnlyReportingDetailsListener f12607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f12608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f12609c;

    /* synthetic */ i(AlternativeBillingOnlyReportingDetailsListener alternativeBillingOnlyReportingDetailsListener, r rVar, int i10, zzbd zzbdVar) {
        this.f12607a = alternativeBillingOnlyReportingDetailsListener;
        this.f12608b = rVar;
        this.f12609c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC6476x0
    public final void r(Bundle bundle) {
        if (bundle == null) {
            r rVar = this.f12608b;
            BillingResult billingResult = s.f12646j;
            rVar.d(zzcb.zza(71, 15, billingResult), this.f12609c);
            this.f12607a.onAlternativeBillingOnlyTokenResponse(billingResult, null);
            return;
        }
        int iB = A.b(bundle, "BillingClient");
        BillingResult billingResultA = s.a(iB, A.g(bundle, "BillingClient"));
        if (iB != 0) {
            A.k("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + iB);
            this.f12608b.d(zzcb.zza(23, 15, billingResultA), this.f12609c);
            this.f12607a.onAlternativeBillingOnlyTokenResponse(billingResultA, null);
            return;
        }
        try {
            this.f12607a.onAlternativeBillingOnlyTokenResponse(billingResultA, new AlternativeBillingOnlyReportingDetails(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
        } catch (JSONException e10) {
            A.l("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e10);
            r rVar2 = this.f12608b;
            BillingResult billingResult2 = s.f12646j;
            rVar2.d(zzcb.zza(72, 15, billingResult2), this.f12609c);
            this.f12607a.onAlternativeBillingOnlyTokenResponse(billingResult2, null);
        }
    }
}
