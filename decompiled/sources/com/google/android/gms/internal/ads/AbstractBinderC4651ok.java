package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4651ok extends AbstractBinderC4009je implements InterfaceC4777pk {
    public AbstractBinderC4651ok() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                com.google.android.gms.dynamic.a aVarZzb = zzb();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarZzb);
                return true;
            case 3:
                String strZzc = zzc();
                parcel2.writeNoException();
                parcel2.writeString(strZzc);
                return true;
            case 4:
                List listZzd = zzd();
                parcel2.writeNoException();
                parcel2.writeList(listZzd);
                return true;
            case 5:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 6:
                InterfaceC2763Zj interfaceC2763ZjB = b();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2763ZjB);
                return true;
            case 7:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 8:
                String strC = c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 9:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, bundleZzi);
                return true;
            case 10:
                d();
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC0591d1 interfaceC0591d1Zzk = zzk();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0591d1Zzk);
                return true;
            case 12:
                Bundle bundle = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                D2(bundle);
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                boolean zO2 = o2(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zO2 ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                p0(bundle3);
                parcel2.writeNoException();
                return true;
            case 15:
                InterfaceC2399Sj interfaceC2399SjZzo = zzo();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2399SjZzo);
                return true;
            case 16:
                com.google.android.gms.dynamic.a aVarH = h();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarH);
                return true;
            case 17:
                String strA = a();
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            default:
                return false;
        }
    }
}
