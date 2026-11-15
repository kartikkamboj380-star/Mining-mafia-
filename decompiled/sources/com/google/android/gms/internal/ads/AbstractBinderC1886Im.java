package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1886Im extends AbstractBinderC4009je implements InterfaceC1938Jm {
    public AbstractBinderC1886Im() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static InterfaceC1938Jm y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1938Jm ? (InterfaceC1938Jm) iInterfaceQueryLocalInterface : new C1834Hm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            zze();
        } else {
            if (i10 != 3) {
                return false;
            }
            String string = parcel.readString();
            AbstractC4135ke.h(parcel);
            i(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
