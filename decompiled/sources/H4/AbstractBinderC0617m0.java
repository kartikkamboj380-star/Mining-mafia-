package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0617m0 extends AbstractBinderC4009je implements InterfaceC0620n0 {
    public AbstractBinderC0617m0() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static InterfaceC0620n0 y6(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0620n0 ? (InterfaceC0620n0) iInterfaceQueryLocalInterface : new C0614l0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        AbstractC4135ke.h(parcel);
        I0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
