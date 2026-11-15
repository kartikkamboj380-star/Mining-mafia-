package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5540vo extends AbstractBinderC4009je implements InterfaceC5666wo {
    public AbstractBinderC5540vo() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static InterfaceC5666wo y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5666wo ? (InterfaceC5666wo) iInterfaceQueryLocalInterface : new C5414uo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            AbstractC4135ke.h(parcel);
            InterfaceC6044zo interfaceC6044zoJ = j(string);
            parcel2.writeNoException();
            AbstractC4135ke.e(parcel2, interfaceC6044zoJ);
        } else if (i10 == 2) {
            String string2 = parcel.readString();
            AbstractC4135ke.h(parcel);
            boolean zH = H(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zH ? 1 : 0);
        } else if (i10 == 3) {
            String string3 = parcel.readString();
            AbstractC4135ke.h(parcel);
            InterfaceC5542vp interfaceC5542vpK = k(string3);
            parcel2.writeNoException();
            AbstractC4135ke.e(parcel2, interfaceC5542vpK);
        } else {
            if (i10 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            AbstractC4135ke.h(parcel);
            boolean zD0 = d0(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zD0 ? 1 : 0);
        }
        return true;
    }
}
