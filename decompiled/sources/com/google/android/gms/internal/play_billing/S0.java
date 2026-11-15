package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class S0 extends X2 implements InterfaceC6457s1 {
    public S0() {
        super("com.android.vending.billing.IInAppBillingCreateExternalPaymentReportingDetailsCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.X2
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) Y2.a(parcel, Bundle.CREATOR);
        Y2.b(parcel);
        r(bundle);
        return true;
    }
}
