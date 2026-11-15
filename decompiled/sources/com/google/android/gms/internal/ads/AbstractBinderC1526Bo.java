package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1526Bo extends AbstractBinderC4009je implements InterfaceC1578Co {
    public AbstractBinderC1526Bo() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static InterfaceC1578Co y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1578Co ? (InterfaceC1578Co) iInterfaceQueryLocalInterface : new C1474Ao(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zze();
                break;
            case 2:
                b();
                break;
            case 3:
                int i12 = parcel.readInt();
                AbstractC4135ke.h(parcel);
                X(i12);
                break;
            case 4:
                c();
                break;
            case 5:
                zzi();
                break;
            case 6:
                d();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof AbstractC1838Ho) {
                        p070h.w.a(iInterfaceQueryLocalInterface);
                    }
                }
                AbstractC4135ke.h(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                AbstractC4135ke.h(parcel);
                k3(string, string2);
                break;
            case 10:
                AbstractBinderC5028rk.y6(parcel.readStrongBinder());
                parcel.readString();
                AbstractC4135ke.h(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                AbstractC4135ke.h(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                C2519Ur c2519Ur = (C2519Ur) AbstractC4135ke.b(parcel, C2519Ur.CREATOR);
                AbstractC4135ke.h(parcel);
                D1(c2519Ur);
                break;
            case 15:
                a();
                break;
            case 16:
                InterfaceC2727Yr interfaceC2727YrY6 = AbstractBinderC2675Xr.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                O4(interfaceC2727YrY6);
                break;
            case 17:
                int i13 = parcel.readInt();
                AbstractC4135ke.h(parcel);
                F(i13);
                break;
            case 18:
                g();
                break;
            case 19:
                AbstractC4135ke.h(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String string3 = parcel.readString();
                AbstractC4135ke.h(parcel);
                b0(string3);
                break;
            case 22:
                int i14 = parcel.readInt();
                String string4 = parcel.readString();
                AbstractC4135ke.h(parcel);
                s6(i14, string4);
                break;
            case 23:
                H4.Z0 z9 = (H4.Z0) AbstractC4135ke.b(parcel, H4.Z0.CREATOR);
                AbstractC4135ke.h(parcel);
                R1(z9);
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                H4.Z0 z10 = (H4.Z0) AbstractC4135ke.b(parcel, H4.Z0.CREATOR);
                AbstractC4135ke.h(parcel);
                w1(z10);
                break;
            case 25:
                m();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
