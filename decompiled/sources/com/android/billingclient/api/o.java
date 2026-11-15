package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.P2;

/* JADX INFO: loaded from: classes.dex */
final class o extends P2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ExternalOfferAvailabilityListener f12623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f12624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f12625c;

    /* synthetic */ o(ExternalOfferAvailabilityListener externalOfferAvailabilityListener, r rVar, int i10, zzbp zzbpVar) {
        this.f12623a = externalOfferAvailabilityListener;
        this.f12624b = rVar;
        this.f12625c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.Q2
    public final void r(Bundle bundle) {
        if (bundle == null) {
            r rVar = this.f12624b;
            BillingResult billingResult = s.f12646j;
            rVar.d(zzcb.zza(92, 23, billingResult), this.f12625c);
            this.f12623a.onExternalOfferAvailabilityResponse(billingResult);
            return;
        }
        int iB = A.b(bundle, "BillingClient");
        BillingResult billingResultA = s.a(iB, A.g(bundle, "BillingClient"));
        if (iB != 0) {
            A.k("BillingClient", "isExternalOfferAvailableAsync() failed. Response code: " + iB);
            this.f12624b.d(zzcb.zza(23, 23, billingResultA), this.f12625c);
        }
        this.f12623a.onExternalOfferAvailabilityResponse(billingResultA);
    }
}
