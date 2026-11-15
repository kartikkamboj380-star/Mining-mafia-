package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4165kt extends AbstractBinderC4009je implements InterfaceC4291lt {
    public AbstractBinderC4165kt() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static InterfaceC4291lt y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4291lt ? (InterfaceC4291lt) iInterfaceQueryLocalInterface : new C4039jt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC3789ht c3160ct = null;
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                C4795pt c4795pt = (C4795pt) AbstractC4135ke.b(parcel, C4795pt.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c3160ct = iInterfaceQueryLocalInterface instanceof InterfaceC3789ht ? (InterfaceC3789ht) iInterfaceQueryLocalInterface : new C3160ct(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                N2(aVarJ, c4795pt, c3160ct);
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                zzf(aVarJ2);
                parcel2.writeNoException();
                return true;
            case 3:
                com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, null);
                return true;
            case 4:
                com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                InterfaceC1790Gq interfaceC1790GqY6 = AbstractBinderC1738Fq.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                j6(arrayListCreateTypedArrayList, aVarJ3, interfaceC1790GqY6);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.a aVarJ4 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                InterfaceC1790Gq interfaceC1790GqY7 = AbstractBinderC1738Fq.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                k5(arrayListCreateTypedArrayList2, aVarJ4, interfaceC1790GqY7);
                parcel2.writeNoException();
                return true;
            case 7:
                C1946Jq c1946Jq = (C1946Jq) AbstractC4135ke.b(parcel, C1946Jq.CREATOR);
                AbstractC4135ke.h(parcel);
                b5(c1946Jq);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.dynamic.a aVarJ5 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                i0(aVarJ5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.a aVarJ6 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                InterfaceC1790Gq interfaceC1790GqY8 = AbstractBinderC1738Fq.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                r2(arrayListCreateTypedArrayList3, aVarJ6, interfaceC1790GqY8);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                com.google.android.gms.dynamic.a aVarJ7 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                InterfaceC1790Gq interfaceC1790GqY9 = AbstractBinderC1738Fq.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                e1(arrayListCreateTypedArrayList4, aVarJ7, interfaceC1790GqY9);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.dynamic.a aVarJ8 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarJ9 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                String string = parcel.readString();
                com.google.android.gms.dynamic.a aVarJ10 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                com.google.android.gms.dynamic.a aVarR4 = R4(aVarJ8, aVarJ9, string, aVarJ10);
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarR4);
                return true;
            default:
                return false;
        }
    }
}
