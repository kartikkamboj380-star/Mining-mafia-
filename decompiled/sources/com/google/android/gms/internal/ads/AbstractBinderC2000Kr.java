package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0581a0;
import H4.InterfaceC0582a1;
import H4.InterfaceC0584b0;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2000Kr extends AbstractBinderC4009je implements Lr {
    public AbstractBinderC2000Kr() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C2259Pr c2259Pr = (C2259Pr) AbstractC4135ke.b(parcel, C2259Pr.CREATOR);
            AbstractC4135ke.h(parcel);
            h2(c2259Pr);
            parcel2.writeNoException();
        } else if (i10 != 2) {
            InterfaceC2207Or c2103Mr = null;
            C1948Jr c1948Jr = null;
            if (i10 == 3) {
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c2103Mr = iInterfaceQueryLocalInterface instanceof InterfaceC2207Or ? (InterfaceC2207Or) iInterfaceQueryLocalInterface : new C2103Mr(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                Q1(c2103Mr);
                parcel2.writeNoException();
            } else if (i10 != 34) {
                switch (i10) {
                    case 5:
                        boolean zZze = zze();
                        parcel2.writeNoException();
                        int i12 = AbstractC4135ke.f30848b;
                        parcel2.writeInt(zZze ? 1 : 0);
                        break;
                    case 6:
                        b();
                        parcel2.writeNoException();
                        break;
                    case 7:
                        zzg();
                        parcel2.writeNoException();
                        break;
                    case 8:
                        c();
                        parcel2.writeNoException();
                        break;
                    case 9:
                        com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                        AbstractC4135ke.h(parcel);
                        F0(aVarJ);
                        parcel2.writeNoException();
                        break;
                    case 10:
                        com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                        AbstractC4135ke.h(parcel);
                        i0(aVarJ2);
                        parcel2.writeNoException();
                        break;
                    case 11:
                        com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                        AbstractC4135ke.h(parcel);
                        E0(aVarJ3);
                        parcel2.writeNoException();
                        break;
                    case 12:
                        String strZzl = zzl();
                        parcel2.writeNoException();
                        parcel2.writeString(strZzl);
                        break;
                    case 13:
                        String string = parcel.readString();
                        AbstractC4135ke.h(parcel);
                        T(string);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        InterfaceC0584b0 interfaceC0584b0Y6 = AbstractBinderC0581a0.y6(parcel.readStrongBinder());
                        AbstractC4135ke.h(parcel);
                        Z5(interfaceC0584b0Y6);
                        parcel2.writeNoException();
                        break;
                    case 15:
                        Bundle bundleZzo = zzo();
                        parcel2.writeNoException();
                        AbstractC4135ke.d(parcel2, bundleZzo);
                        break;
                    case 16:
                        IBinder strongBinder2 = parcel.readStrongBinder();
                        if (strongBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            c1948Jr = iInterfaceQueryLocalInterface2 instanceof C1948Jr ? (C1948Jr) iInterfaceQueryLocalInterface2 : new C1948Jr(strongBinder2);
                        }
                        AbstractC4135ke.h(parcel);
                        i3(c1948Jr);
                        parcel2.writeNoException();
                        break;
                    case 17:
                        parcel.readString();
                        AbstractC4135ke.h(parcel);
                        parcel2.writeNoException();
                        break;
                    case 18:
                        com.google.android.gms.dynamic.a aVarJ4 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                        AbstractC4135ke.h(parcel);
                        s0(aVarJ4);
                        parcel2.writeNoException();
                        break;
                    case 19:
                        String string2 = parcel.readString();
                        AbstractC4135ke.h(parcel);
                        Y(string2);
                        parcel2.writeNoException();
                        break;
                    case 20:
                        boolean zF = f();
                        parcel2.writeNoException();
                        int i13 = AbstractC4135ke.f30848b;
                        parcel2.writeInt(zF ? 1 : 0);
                        break;
                    case 21:
                        InterfaceC0582a1 interfaceC0582a1G = g();
                        parcel2.writeNoException();
                        AbstractC4135ke.e(parcel2, interfaceC0582a1G);
                        break;
                    default:
                        return false;
                }
            } else {
                boolean zA = AbstractC4135ke.a(parcel);
                AbstractC4135ke.h(parcel);
                I5(zA);
                parcel2.writeNoException();
            }
        } else {
            zzc();
            parcel2.writeNoException();
        }
        return true;
    }
}
