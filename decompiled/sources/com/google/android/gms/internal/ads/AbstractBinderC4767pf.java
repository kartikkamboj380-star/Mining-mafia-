package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4767pf extends AbstractBinderC4009je implements InterfaceC4893qf {
    public AbstractBinderC4767pf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC5900yf c5648wf;
        switch (i10) {
            case 2:
                H4.W wZze = zze();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, wZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof InterfaceC5522vf) {
                    }
                }
                AbstractC4135ke.h(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    c5648wf = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    c5648wf = iInterfaceQueryLocalInterface2 instanceof InterfaceC5900yf ? (InterfaceC5900yf) iInterfaceQueryLocalInterface2 : new C5648wf(strongBinder2);
                }
                AbstractC4135ke.h(parcel);
                c6(aVarJ, c5648wf);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC0582a1 interfaceC0582a1Zzg = zzg();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0582a1Zzg);
                return true;
            case 6:
                boolean zA = AbstractC4135ke.a(parcel);
                AbstractC4135ke.h(parcel);
                U(zA);
                parcel2.writeNoException();
                return true;
            case 7:
                H4.S0 s0Y6 = H4.R0.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                b3(s0Y6);
                parcel2.writeNoException();
                return true;
            case 8:
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 9:
                long jZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j10 = parcel.readLong();
                AbstractC4135ke.h(parcel);
                C0(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
