package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 extends AbstractC6068a implements IInterface {
    S1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.data.IGoogleAuthService");
    }

    public final void H1(R1 r10, Account account, String str, Bundle bundle) {
        Parcel parcelJ = J();
        AbstractC6095j.d(parcelJ, r10);
        AbstractC6095j.c(parcelJ, account);
        parcelJ.writeString(str);
        AbstractC6095j.c(parcelJ, bundle);
        N0(1, parcelJ);
    }

    public final void t1(IStatusCallback iStatusCallback, C6086g c6086g) {
        Parcel parcelJ = J();
        AbstractC6095j.d(parcelJ, iStatusCallback);
        AbstractC6095j.c(parcelJ, c6086g);
        N0(2, parcelJ);
    }
}
