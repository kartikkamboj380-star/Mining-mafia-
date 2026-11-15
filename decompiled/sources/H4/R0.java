package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public abstract class R0 extends AbstractBinderC4009je implements S0 {
    public R0() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static S0 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof S0 ? (S0) iInterfaceQueryLocalInterface : new Q0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            o2 o2Var = (o2) AbstractC4135ke.b(parcel, o2.CREATOR);
            AbstractC4135ke.h(parcel);
            a6(o2Var);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            boolean zB = b();
            parcel2.writeNoException();
            int i12 = AbstractC4135ke.f30848b;
            parcel2.writeInt(zB ? 1 : 0);
        }
        return true;
    }
}
