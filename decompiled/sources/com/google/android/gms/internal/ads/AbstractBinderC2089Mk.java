package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2089Mk extends AbstractBinderC4009je implements InterfaceC2141Nk {
    public AbstractBinderC2089Mk() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static InterfaceC2141Nk y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2141Nk ? (InterfaceC2141Nk) iInterfaceQueryLocalInterface : new C2038Lk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2401Sk c2297Qk;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c2297Qk = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c2297Qk = iInterfaceQueryLocalInterface instanceof InterfaceC2401Sk ? (InterfaceC2401Sk) iInterfaceQueryLocalInterface : new C2297Qk(strongBinder);
        }
        AbstractC4135ke.h(parcel);
        H4(c2297Qk);
        parcel2.writeNoException();
        return true;
    }
}
