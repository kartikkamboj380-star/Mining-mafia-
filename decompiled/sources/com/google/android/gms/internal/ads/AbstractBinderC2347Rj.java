package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2347Rj extends AbstractBinderC4009je implements InterfaceC2399Sj {
    public AbstractBinderC2347Rj() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static InterfaceC2399Sj y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2399Sj ? (InterfaceC2399Sj) iInterfaceQueryLocalInterface : new C2295Qj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        List listZzc = zzc();
        parcel2.writeNoException();
        parcel2.writeList(listZzc);
        return true;
    }
}
