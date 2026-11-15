package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4789pq extends AbstractBinderC4009je implements InterfaceC4915qq {
    public AbstractBinderC4789pq() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static InterfaceC4915qq y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4915qq ? (InterfaceC4915qq) iInterfaceQueryLocalInterface : new C4663oq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                C3(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                zzi();
                parcel2.writeNoException();
                return true;
            case 3:
                d();
                parcel2.writeNoException();
                return true;
            case 4:
                zzk();
                parcel2.writeNoException();
                return true;
            case 5:
                zzl();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                P(bundle2);
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, bundle2);
                return true;
            case 7:
                h();
                parcel2.writeNoException();
                return true;
            case 8:
                a();
                parcel2.writeNoException();
                return true;
            case 9:
                f();
                parcel2.writeNoException();
                return true;
            case 10:
                zze();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zZzg = zzg();
                parcel2.writeNoException();
                int i12 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zZzg ? 1 : 0);
                return true;
            case 12:
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                Intent intent = (Intent) AbstractC4135ke.b(parcel, Intent.CREATOR);
                AbstractC4135ke.h(parcel);
                C1(i13, i14, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                R(aVarJ);
                parcel2.writeNoException();
                return true;
            case 14:
                b();
                parcel2.writeNoException();
                return true;
            case 15:
                int i15 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                AbstractC4135ke.h(parcel);
                s4(i15, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
