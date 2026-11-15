package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5028rk extends AbstractBinderC4009je implements InterfaceC5154sk {
    public AbstractBinderC5028rk() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static InterfaceC5154sk y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5154sk ? (InterfaceC5154sk) iInterfaceQueryLocalInterface : new C4903qk(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                String string = parcel.readString();
                AbstractC4135ke.h(parcel);
                String strK = k(string);
                parcel2.writeNoException();
                parcel2.writeString(strK);
                return true;
            case 2:
                String string2 = parcel.readString();
                AbstractC4135ke.h(parcel);
                InterfaceC2763Zj interfaceC2763ZjI = i(string2);
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2763ZjI);
                return true;
            case 3:
                List<String> listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(listZzg);
                return true;
            case 4:
                String strC = c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 5:
                String string3 = parcel.readString();
                AbstractC4135ke.h(parcel);
                M(string3);
                parcel2.writeNoException();
                return true;
            case 6:
                d();
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0591d1 interfaceC0591d1Zzk = zzk();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0591d1Zzk);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                com.google.android.gms.dynamic.a aVarE = e();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarE);
                return true;
            case 10:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                boolean zR = R(aVarJ);
                parcel2.writeNoException();
                parcel2.writeInt(zR ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, null);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i12 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                boolean zH = h();
                parcel2.writeNoException();
                int i13 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 14:
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                X1(aVarJ2);
                parcel2.writeNoException();
                return true;
            case 15:
                l();
                parcel2.writeNoException();
                return true;
            case 16:
                InterfaceC2607Wj interfaceC2607WjF = f();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2607WjF);
                return true;
            case 17:
                com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                boolean zX0 = x0(aVarJ3);
                parcel2.writeNoException();
                parcel2.writeInt(zX0 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
