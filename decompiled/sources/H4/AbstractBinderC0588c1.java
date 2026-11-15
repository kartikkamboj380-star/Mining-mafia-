package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0588c1 extends AbstractBinderC4009je implements InterfaceC0591d1 {
    public AbstractBinderC0588c1() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static InterfaceC0591d1 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0591d1 ? (InterfaceC0591d1) iInterfaceQueryLocalInterface : new C0585b1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC0600g1 c0594e1;
        switch (i10) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                b();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zA = AbstractC4135ke.a(parcel);
                AbstractC4135ke.h(parcel);
                Z(zA);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zC = c();
                parcel2.writeNoException();
                int i12 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zC ? 1 : 0);
                return true;
            case 5:
                int iZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeInt(iZzi);
                return true;
            case 6:
                float fD = d();
                parcel2.writeNoException();
                parcel2.writeFloat(fD);
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c0594e1 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    c0594e1 = iInterfaceQueryLocalInterface instanceof InterfaceC0600g1 ? (InterfaceC0600g1) iInterfaceQueryLocalInterface : new C0594e1(strongBinder);
                }
                AbstractC4135ke.h(parcel);
                B1(c0594e1);
                parcel2.writeNoException();
                return true;
            case 9:
                float fE = e();
                parcel2.writeNoException();
                parcel2.writeFloat(fE);
                return true;
            case 10:
                boolean zZzn = zzn();
                parcel2.writeNoException();
                int i13 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zZzn ? 1 : 0);
                return true;
            case 11:
                InterfaceC0600g1 interfaceC0600g1Zzo = zzo();
                parcel2.writeNoException();
                AbstractC4135ke.e(parcel2, interfaceC0600g1Zzo);
                return true;
            case 12:
                boolean zH = h();
                parcel2.writeNoException();
                int i14 = AbstractC4135ke.f30848b;
                parcel2.writeInt(zH ? 1 : 0);
                return true;
            case 13:
                a();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
