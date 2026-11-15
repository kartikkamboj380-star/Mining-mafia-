package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2711Yj extends AbstractBinderC4009je implements InterfaceC2763Zj {
    public AbstractBinderC2711Yj() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static InterfaceC2763Zj y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2763Zj ? (InterfaceC2763Zj) iInterfaceQueryLocalInterface : new C2659Xj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                com.google.android.gms.dynamic.a aVarZzb = zzb();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarZzb);
                return true;
            case 2:
                Uri uriZzc = zzc();
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, uriZzc);
                return true;
            case 3:
                double dZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzd);
                return true;
            case 4:
                int iZze = zze();
                parcel2.writeNoException();
                parcel2.writeInt(iZze);
                return true;
            case 5:
                int iB = b();
                parcel2.writeNoException();
                parcel2.writeInt(iB);
                return true;
            case 6:
                Map mapZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeMap(mapZzg);
                return true;
            default:
                return false;
        }
    }
}
