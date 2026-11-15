package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2415Sr extends AbstractBinderC4009je implements InterfaceC2467Tr {
    public AbstractBinderC2415Sr() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static InterfaceC2467Tr y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2467Tr ? (InterfaceC2467Tr) iInterfaceQueryLocalInterface : new C2363Rr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                I(aVarJ);
                break;
            case 2:
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                AbstractC4135ke.h(parcel);
                q0(aVarJ2, i12);
                break;
            case 3:
                com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                e0(aVarJ3);
                break;
            case 4:
                com.google.android.gms.dynamic.a aVarJ4 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                B0(aVarJ4);
                break;
            case 5:
                com.google.android.gms.dynamic.a aVarJ5 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                F0(aVarJ5);
                break;
            case 6:
                com.google.android.gms.dynamic.a aVarJ6 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                i0(aVarJ6);
                break;
            case 7:
                com.google.android.gms.dynamic.a aVarJ7 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                C2519Ur c2519Ur = (C2519Ur) AbstractC4135ke.b(parcel, C2519Ur.CREATOR);
                AbstractC4135ke.h(parcel);
                u2(aVarJ7, c2519Ur);
                break;
            case 8:
                com.google.android.gms.dynamic.a aVarJ8 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                o6(aVarJ8);
                break;
            case 9:
                com.google.android.gms.dynamic.a aVarJ9 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                AbstractC4135ke.h(parcel);
                G4(aVarJ9, i13);
                break;
            case 10:
                com.google.android.gms.dynamic.a aVarJ10 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                R(aVarJ10);
                break;
            case 11:
                com.google.android.gms.dynamic.a aVarJ11 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                g1(aVarJ11);
                break;
            case 12:
                AbstractC4135ke.h(parcel);
                break;
            case 13:
                com.google.android.gms.dynamic.a aVarJ12 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                s0(aVarJ12);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
