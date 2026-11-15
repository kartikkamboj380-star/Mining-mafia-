package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3142ck extends AbstractBinderC4009je implements InterfaceC3268dk {
    public AbstractBinderC3142ck() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static InterfaceC3268dk y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3268dk ? (InterfaceC3268dk) iInterfaceQueryLocalInterface : new C3017bk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2607Wj c2503Uj;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                E4(string, aVarJ);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC4135ke.h(parcel);
                com.google.android.gms.dynamic.a aVarH = H(string2);
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarH);
                return true;
            case 3:
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                W(aVarJ2);
                parcel2.writeNoException();
                return true;
            case 4:
                zze();
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                parcel.readInt();
                AbstractC4135ke.h(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                e0(aVarJ3);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.dynamic.a aVarJ4 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                G1(aVarJ4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2503Uj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    c2503Uj = iInterfaceQueryLocalInterface instanceof InterfaceC2607Wj ? (InterfaceC2607Wj) iInterfaceQueryLocalInterface : new C2503Uj(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                J3(c2503Uj);
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.a aVarJ5 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                B5(aVarJ5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
