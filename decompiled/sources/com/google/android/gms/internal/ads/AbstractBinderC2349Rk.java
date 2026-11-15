package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import H4.InterfaceC0591d1;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2349Rk extends AbstractBinderC4009je implements InterfaceC2401Sk {
    public AbstractBinderC2349Rk() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2245Pk c2193Ok;
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
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 13:
                h();
                parcel2.writeNoException();
                return true;
            case 14:
                InterfaceC2399Sj interfaceC2399SjA = a();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2399SjA);
                return true;
            case 15:
                Bundle bundle = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                T5(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                boolean zA5 = A5(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zA5 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                g5(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                com.google.android.gms.dynamic.a aVarZzu = zzu();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarZzu);
                return true;
            case 19:
                com.google.android.gms.dynamic.a aVarQ = q();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, aVarQ);
                return true;
            case 20:
                Bundle bundleP = p();
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, bundleP);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c2193Ok = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    c2193Ok = iInterfaceQueryLocalInterface instanceof InterfaceC2245Pk ? (InterfaceC2245Pk) iInterfaceQueryLocalInterface : new C2193Ok(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                z4(c2193Ok);
                parcel2.writeNoException();
                return true;
            case 22:
                u();
                parcel2.writeNoException();
                return true;
            case 23:
                List listM = m();
                parcel2.writeNoException();
                parcel2.writeList(listM);
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                boolean zS = s();
                parcel2.writeNoException();
                int i12 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zS ? 1 : 0);
                return true;
            case 25:
                H4.I0 i0Y6 = H4.H0.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                f2(i0Y6);
                parcel2.writeNoException();
                return true;
            case 26:
                H4.F0 f0Y6 = H4.E0.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                S2(f0Y6);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                A();
                parcel2.writeNoException();
                return true;
            case 28:
                B();
                parcel2.writeNoException();
                return true;
            case 29:
                InterfaceC2607Wj interfaceC2607WjT = t();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC2607WjT);
                return true;
            case 30:
                boolean zO = O();
                parcel2.writeNoException();
                int i13 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zO ? 1 : 0);
                return true;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                InterfaceC0582a1 interfaceC0582a1W = w();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0582a1W);
                return true;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                H4.S0 s0Y6 = H4.R0.y6(parcel.readStrongBinder());
                AbstractC4135ke.h(parcel);
                c2(s0Y6);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
                AbstractC4135ke.h(parcel);
                F2(bundle4);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                long jC = C();
                parcel2.writeNoException();
                parcel2.writeLong(jC);
                return true;
            case 35:
                long j10 = parcel.readLong();
                AbstractC4135ke.h(parcel);
                r4(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
