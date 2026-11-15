package H4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y0 extends AbstractBinderC4009je implements InterfaceC0582a1 {
    public Y0() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static InterfaceC0582a1 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0582a1 ? (InterfaceC0582a1) iInterfaceQueryLocalInterface : new X0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 2:
                String strB = b();
                parcel2.writeNoException();
                parcel2.writeString(strB);
                return true;
            case 3:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 4:
                q2 q2VarC = c();
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, q2VarC);
                return true;
            case 5:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                AbstractC4135ke.d(parcel2, bundleZzi);
                return true;
            case 6:
                String strD = d();
                parcel2.writeNoException();
                parcel2.writeString(strD);
                return true;
            default:
                return false;
        }
    }
}
