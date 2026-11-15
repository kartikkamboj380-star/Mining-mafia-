package com.google.android.gms.internal.auth;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q1 extends AbstractBinderC6074c implements R1 {
    public Q1() {
        super("com.google.android.gms.auth.account.data.IGetTokenWithDetailsCallback");
    }

    @Override // com.google.android.gms.internal.auth.AbstractBinderC6074c
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Status status = (Status) AbstractC6095j.a(parcel, Status.CREATOR);
        Bundle bundle = (Bundle) AbstractC6095j.a(parcel, Bundle.CREATOR);
        AbstractC6095j.b(parcel);
        n3(status, bundle);
        return true;
    }
}
