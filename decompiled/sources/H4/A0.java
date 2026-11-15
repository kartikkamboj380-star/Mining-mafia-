package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC2042Lm;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractBinderC5540vo;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.InterfaceC2093Mm;
import com.google.android.gms.internal.ads.InterfaceC5666wo;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A0 extends AbstractBinderC4009je implements B0 {
    public A0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        M0 k10;
        switch (i10) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                AbstractC4135ke.h(parcel);
                m0(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                AbstractC4135ke.h(parcel);
                g0(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zA = AbstractC4135ke.a(parcel);
                AbstractC4135ke.h(parcel);
                U(zA);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                String string2 = parcel.readString();
                AbstractC4135ke.h(parcel);
                y1(aVarJ, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                F1(string3, aVarJ2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i12 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strE = e();
                parcel2.writeNoException();
                parcel2.writeString(strE);
                return true;
            case 10:
                String string4 = parcel.readString();
                AbstractC4135ke.h(parcel);
                o0(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC5666wo interfaceC5666woY6 = AbstractBinderC5540vo.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                b6(interfaceC5666woY6);
                parcel2.writeNoException();
                return true;
            case 12:
                InterfaceC2093Mm interfaceC2093MmY6 = AbstractBinderC2042Lm.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                L4(interfaceC2093MmY6);
                parcel2.writeNoException();
                return true;
            case 13:
                List listA = a();
                parcel2.writeNoException();
                parcel2.writeTypedList(listA);
                return true;
            case 14:
                U1 u10 = (U1) AbstractC4135ke.b(parcel, U1.CREATOR);
                AbstractC4135ke.h(parcel);
                M0(u10);
                parcel2.writeNoException();
                return true;
            case 15:
                f();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    k10 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    k10 = iInterfaceQueryLocalInterface instanceof M0 ? (M0) iInterfaceQueryLocalInterface : new K0(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                b1(k10);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zA2 = AbstractC4135ke.a(parcel);
                AbstractC4135ke.h(parcel);
                S0(zA2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                AbstractC4135ke.h(parcel);
                b0(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                p();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
