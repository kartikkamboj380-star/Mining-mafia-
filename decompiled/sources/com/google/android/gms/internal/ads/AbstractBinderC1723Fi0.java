package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1723Fi0 extends AbstractBinderC4009je implements InterfaceC1775Gi0 {
    public AbstractBinderC1723Fi0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                parcel.readString();
                AbstractC4135ke.h(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC4135ke.h(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC4135ke.h(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC4135ke.h(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC4135ke.h(parcel);
                break;
            case 8:
                com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC4135ke.h(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
