package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3908iq extends AbstractBinderC4009je implements InterfaceC4033jq {
    public AbstractBinderC3908iq() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static InterfaceC4033jq y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4033jq ? (InterfaceC4033jq) iInterfaceQueryLocalInterface : new C3783hq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Intent intent = (Intent) AbstractC4135ke.b(parcel, Intent.CREATOR);
                AbstractC4135ke.h(parcel);
                J0(intent);
                break;
            case 2:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC4135ke.h(parcel);
                Q3(aVarJ, string, string2);
                break;
            case 3:
                zzg();
                break;
            case 4:
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                B0(aVarJ2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                z3(strArrCreateStringArray, iArrCreateIntArray, aVarJ3);
                break;
            case 6:
                com.google.android.gms.dynamic.a aVarJ4 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                I4.a aVar = (I4.a) AbstractC4135ke.b(parcel, I4.a.CREATOR);
                AbstractC4135ke.h(parcel);
                s3(aVarJ4, aVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
