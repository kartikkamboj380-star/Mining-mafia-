package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC6068a implements F0 {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle c3(String str, Bundle bundle) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC6095j.c(parcelJ, bundle);
        Parcel parcelH0 = h0(2, parcelJ);
        Bundle bundle2 = (Bundle) AbstractC6095j.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.F0
    public final Bundle g4(Account account, String str, Bundle bundle) {
        Parcel parcelJ = J();
        AbstractC6095j.c(parcelJ, account);
        parcelJ.writeString(str);
        AbstractC6095j.c(parcelJ, bundle);
        Parcel parcelH0 = h0(5, parcelJ);
        Bundle bundle2 = (Bundle) AbstractC6095j.a(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle2;
    }
}
