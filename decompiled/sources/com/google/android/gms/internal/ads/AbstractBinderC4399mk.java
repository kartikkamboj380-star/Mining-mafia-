package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4399mk extends AbstractBinderC4009je implements InterfaceC4525nk {
    public AbstractBinderC4399mk() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
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
                double dC = c();
                parcel2.writeNoException();
                parcel2.writeDouble(dC);
                return true;
            case 9:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 10:
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 11:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, bundleZzk);
                return true;
            case 12:
                zzl();
                parcel2.writeNoException();
                return true;
            case 13:
                InterfaceC0591d1 interfaceC0591d1E = e();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0591d1E);
                return true;
            case 14:
                Bundle bundle = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                p0(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                boolean zP = P(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zP ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                k0(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                InterfaceC2399Sj interfaceC2399SjA = a();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2399SjA);
                return true;
            case 18:
                com.google.android.gms.dynamic.a aVarL = l();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarL);
                return true;
            case 19:
                String strF = f();
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            default:
                return false;
        }
    }
}
