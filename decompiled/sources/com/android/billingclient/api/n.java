package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.N2;

/* JADX INFO: loaded from: classes.dex */
final class n extends N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AlternativeBillingOnlyAvailabilityListener f12620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f12621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f12622c;

    /* synthetic */ n(AlternativeBillingOnlyAvailabilityListener alternativeBillingOnlyAvailabilityListener, r rVar, int i10, zzbn zzbnVar) {
        this.f12620a = alternativeBillingOnlyAvailabilityListener;
        this.f12621b = rVar;
        this.f12622c = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.O2
    public final void r(Bundle bundle) {
        if (bundle == null) {
            r rVar = this.f12621b;
            BillingResult billingResult = s.f12646j;
            rVar.d(zzcb.zza(67, 14, billingResult), this.f12622c);
            this.f12620a.onAlternativeBillingOnlyAvailabilityResponse(billingResult);
            return;
        }
        int iB = A.b(bundle, "BillingClient");
        BillingResult billingResultA = s.a(iB, A.g(bundle, "BillingClient"));
        if (iB != 0) {
            A.k("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + iB);
            this.f12621b.d(zzcb.zza(23, 14, billingResultA), this.f12622c);
        }
        this.f12620a.onAlternativeBillingOnlyAvailabilityResponse(billingResultA);
    }
}
