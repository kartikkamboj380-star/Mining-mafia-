package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1518Bk extends AbstractBinderC4009je implements InterfaceC1570Ck {
    public AbstractBinderC1518Bk() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static InterfaceC1570Ck y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1570Ck ? (InterfaceC1570Ck) iInterfaceQueryLocalInterface : new C1466Ak(iBinder);
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
        String string = parcel.readString();
        AbstractC4135ke.h(parcel);
        V1(c4903qk, string);
        parcel2.writeNoException();
        return true;
    }
}
