package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class J2 extends X2 implements K2 {
    public J2() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.X2
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) Y2.a(parcel, Bundle.CREATOR);
        Y2.b(parcel);
        r(bundle);
        parcel2.writeNoException();
        return true;
    }
}
