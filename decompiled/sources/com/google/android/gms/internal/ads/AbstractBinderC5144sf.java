package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5144sf extends AbstractBinderC4009je implements InterfaceC5396uf {
    public AbstractBinderC5144sf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static InterfaceC5396uf y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5396uf ? (InterfaceC5396uf) iInterfaceQueryLocalInterface : new C5018rf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC4893qf c4641of;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c4641of = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c4641of = iInterfaceQueryLocalInterface instanceof InterfaceC4893qf ? (InterfaceC4893qf) iInterfaceQueryLocalInterface : new C4641of(strongBinder);
            }
            AbstractC4135ke.h(parcel);
            f5(c4641of);
        } else if (i10 == 2) {
            parcel.readInt();
            AbstractC4135ke.h(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            H4.Z0 z9 = (H4.Z0) AbstractC4135ke.b(parcel, H4.Z0.CREATOR);
            AbstractC4135ke.h(parcel);
            j0(z9);
        }
        parcel2.writeNoException();
        return true;
    }
}
