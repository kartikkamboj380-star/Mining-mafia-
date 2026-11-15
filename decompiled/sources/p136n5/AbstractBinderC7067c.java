package p136n5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.measurement.internal.B6;
import com.google.android.gms.measurement.internal.C6535g;
import com.google.android.gms.measurement.internal.C6551i;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.v6;
import com.google.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: renamed from: n5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC7067c extends O implements InterfaceC7068d {
    public AbstractBinderC7067c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.O
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC7074j c7072h = null;
        InterfaceC7071g c7069e = null;
        switch (i10) {
            case 1:
                G g10 = (G) P.b(parcel, G.CREATOR);
                B6 b10 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                l2(g10, b10);
                parcel2.writeNoException();
                return true;
            case 2:
                v6 v6Var = (v6) P.b(parcel, v6.CREATOR);
                B6 b11 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                G2(v6Var, b11);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                B6 b12 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                N5(b12);
                parcel2.writeNoException();
                return true;
            case 5:
                G g11 = (G) P.b(parcel, G.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                P.f(parcel);
                f4(g11, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                B6 b13 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                m2(b13);
                parcel2.writeNoException();
                return true;
            case 7:
                B6 b14 = (B6) P.b(parcel, B6.CREATOR);
                boolean zA = P.a(parcel);
                P.f(parcel);
                List listM3 = M3(b14, zA);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM3);
                return true;
            case 9:
                G g12 = (G) P.b(parcel, G.CREATOR);
                String string3 = parcel.readString();
                P.f(parcel);
                byte[] bArrW2 = w2(g12, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrW2);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                P.f(parcel);
                o4(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                B6 b15 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                String strT3 = t3(b15);
                parcel2.writeNoException();
                parcel2.writeString(strT3);
                return true;
            case 12:
                C6551i c6551i = (C6551i) P.b(parcel, C6551i.CREATOR);
                B6 b16 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                W0(c6551i, b16);
                parcel2.writeNoException();
                return true;
            case 13:
                C6551i c6551i2 = (C6551i) P.b(parcel, C6551i.CREATOR);
                P.f(parcel);
                z2(c6551i2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA2 = P.a(parcel);
                B6 b17 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                List listY5 = Y5(string7, string8, zA2, b17);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY5);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zA3 = P.a(parcel);
                P.f(parcel);
                List listQ0 = Q0(string9, string10, string11, zA3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listQ0);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                B6 b18 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                List listH6 = h6(string12, string13, b18);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH6);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                P.f(parcel);
                List listJ1 = J1(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ1);
                return true;
            case 18:
                B6 b19 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                p4(b19);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) P.b(parcel, Bundle.CREATOR);
                B6 b20 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                t5(bundle, b20);
                parcel2.writeNoException();
                return true;
            case 20:
                B6 b21 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                r6(b21);
                parcel2.writeNoException();
                return true;
            case 21:
                B6 b22 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                C7065a c7065aS5 = s5(b22);
                parcel2.writeNoException();
                if (c7065aS5 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    c7065aS5.writeToParcel(parcel2, 1);
                }
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                B6 b23 = (B6) P.b(parcel, B6.CREATOR);
                Bundle bundle2 = (Bundle) P.b(parcel, Bundle.CREATOR);
                P.f(parcel);
                List listE2 = e2(b23, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE2);
                return true;
            case 25:
                B6 b24 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                Y1(b24);
                parcel2.writeNoException();
                return true;
            case 26:
                B6 b25 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                p2(b25);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                B6 b26 = (B6) P.b(parcel, B6.CREATOR);
                P.f(parcel);
                V5(b26);
                parcel2.writeNoException();
                return true;
            case 29:
                B6 b27 = (B6) P.b(parcel, B6.CREATOR);
                J j11 = (J) P.b(parcel, J.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c7072h = iInterfaceQueryLocalInterface instanceof InterfaceC7074j ? (InterfaceC7074j) iInterfaceQueryLocalInterface : new C7072h(strongBinder);
                }
                P.f(parcel);
                K3(b27, j11, c7072h);
                parcel2.writeNoException();
                return true;
            case 30:
                B6 b28 = (B6) P.b(parcel, B6.CREATOR);
                C6535g c6535g = (C6535g) P.b(parcel, C6535g.CREATOR);
                P.f(parcel);
                i5(b28, c6535g);
                parcel2.writeNoException();
                return true;
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                B6 b29 = (B6) P.b(parcel, B6.CREATOR);
                Bundle bundle3 = (Bundle) P.b(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c7069e = iInterfaceQueryLocalInterface2 instanceof InterfaceC7071g ? (InterfaceC7071g) iInterfaceQueryLocalInterface2 : new C7069e(strongBinder2);
                }
                P.f(parcel);
                h1(b29, bundle3, c7069e);
                parcel2.writeNoException();
                return true;
        }
    }
}
