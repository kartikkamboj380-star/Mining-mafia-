package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3409es extends AbstractBinderC4009je implements InterfaceC3535fs {
    public AbstractBinderC3409es() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2727Yr c2623Wr;
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                b();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2623Wr = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c2623Wr = iInterfaceQueryLocalInterface instanceof InterfaceC2727Yr ? (InterfaceC2727Yr) iInterfaceQueryLocalInterface : new C2623Wr(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                R2(c2623Wr);
                break;
            case 4:
                int i12 = parcel.readInt();
                AbstractC4135ke.h(parcel);
                x(i12);
                break;
            case 5:
                H4.Z0 z9 = (H4.Z0) AbstractC4135ke.b(parcel, H4.Z0.CREATOR);
                AbstractC4135ke.h(parcel);
                o1(z9);
                break;
            case 6:
                d();
                break;
            case 7:
                zzk();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
