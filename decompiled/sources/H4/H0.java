package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H0 extends AbstractBinderC4009je implements I0 {
    public H0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static I0 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof I0 ? (I0) iInterfaceQueryLocalInterface : new G0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i10 != 2) {
                return false;
            }
            String strB = b();
            parcel2.writeNoException();
            parcel2.writeString(strB);
        }
        return true;
    }
}
