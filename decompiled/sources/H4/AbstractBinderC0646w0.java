package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.InterfaceC5666wo;

/* JADX INFO: renamed from: H4.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0646w0 extends AbstractBinderC4009je implements InterfaceC0649x0 {
    public AbstractBinderC0646w0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static InterfaceC0649x0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0649x0 ? (InterfaceC0649x0) iInterfaceQueryLocalInterface : new C0643v0(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            D1 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            AbstractC4135ke.d(parcel2, liteSdkVersion);
        } else {
            if (i10 != 2) {
                return false;
            }
            InterfaceC5666wo adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            AbstractC4135ke.e(parcel2, adapterCreator);
        }
        return true;
    }
}
