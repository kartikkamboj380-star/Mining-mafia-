package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.AbstractC6143a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzt extends AbstractC6143a implements IAccountAccessor {
    zzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        Parcel parcelZzB = zzB(2, zza());
        Account account = (Account) com.google.android.gms.internal.common.o.b(parcelZzB, Account.CREATOR);
        parcelZzB.recycle();
        return account;
    }
}
