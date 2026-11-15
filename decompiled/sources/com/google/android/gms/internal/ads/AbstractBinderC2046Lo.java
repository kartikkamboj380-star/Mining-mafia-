package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2046Lo extends AbstractBinderC4009je implements InterfaceC2097Mo {
    public AbstractBinderC2046Lo() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static InterfaceC2097Mo y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2097Mo ? (InterfaceC2097Mo) iInterfaceQueryLocalInterface : new C1994Ko(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listB = b();
                parcel2.writeNoException();
                parcel2.writeList(listB);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                InterfaceC2763Zj interfaceC2763ZjC = c();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2763ZjC);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 11:
                InterfaceC0591d1 interfaceC0591d1Zzn = zzn();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0591d1Zzn);
                return true;
            case 12:
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, null);
                return true;
            case 13:
                com.google.android.gms.dynamic.a aVarH = h();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarH);
                return true;
            case 14:
                com.google.android.gms.dynamic.a aVarA = a();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarA);
                return true;
            case 15:
                com.google.android.gms.dynamic.a aVarL = l();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarL);
                return true;
            case 16:
                Bundle bundleF = f();
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, bundleF);
                return true;
            case 17:
                boolean zG = g();
                parcel2.writeNoException();
                int i12 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zG ? 1 : 0);
                return true;
            case 18:
                boolean zZzu = zzu();
                parcel2.writeNoException();
                int i13 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zZzu ? 1 : 0);
                return true;
            case 19:
                q();
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                y0(aVarJ);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarJ4 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                i1(aVarJ2, aVarJ3, aVarJ4);
                parcel2.writeNoException();
                return true;
            case 22:
                com.google.android.gms.dynamic.a aVarJ5 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                B4(aVarJ5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fM = m();
                parcel2.writeNoException();
                parcel2.writeFloat(fM);
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                float fS = s();
                parcel2.writeNoException();
                parcel2.writeFloat(fS);
                return true;
            case 25:
                float fY = y();
                parcel2.writeNoException();
                parcel2.writeFloat(fY);
                return true;
            case 26:
                z();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
