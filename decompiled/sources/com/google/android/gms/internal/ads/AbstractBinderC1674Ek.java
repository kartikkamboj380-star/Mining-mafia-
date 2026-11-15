package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1674Ek extends AbstractBinderC4009je implements InterfaceC1726Fk {
    public AbstractBinderC1674Ek() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static InterfaceC1726Fk y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1726Fk ? (InterfaceC1726Fk) iInterfaceQueryLocalInterface : new C1622Dk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC5154sk c4903qk;
        if (i10 != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c4903qk = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            c4903qk = iInterfaceQueryLocalInterface instanceof InterfaceC5154sk ? (InterfaceC5154sk) iInterfaceQueryLocalInterface : new C4903qk(strongBinder);
        }
        AbstractC4135ke.h(parcel);
        L3(c4903qk);
        parcel2.writeNoException();
        return true;
    }
}
