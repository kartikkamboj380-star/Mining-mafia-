package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2555Vj extends AbstractBinderC4009je implements InterfaceC2607Wj {
    public AbstractBinderC2555Vj() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        C1830Hk c1830Hk;
        switch (i10) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                zzf(aVarJ);
                parcel2.writeNoException();
                return true;
            case 4:
                com.google.android.gms.dynamic.a aVarZzg = zzg();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarZzg);
                return true;
            case 5:
                float fC = c();
                parcel2.writeNoException();
                parcel2.writeFloat(fC);
                return true;
            case 6:
                float fZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzi);
                return true;
            case 7:
                InterfaceC0591d1 interfaceC0591d1D = d();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0591d1D);
                return true;
            case 8:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                int i12 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c1830Hk = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    c1830Hk = iInterfaceQueryLocalInterface instanceof C1830Hk ? (C1830Hk) iInterfaceQueryLocalInterface : new C1830Hk(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                H5(c1830Hk);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i13 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
