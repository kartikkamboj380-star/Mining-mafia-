package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.InterfaceC5666wo;

/* JADX INFO: loaded from: classes2.dex */
public final class W0 extends AbstractC3885ie implements IInterface {
    W0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final V0 H1(com.google.android.gms.dynamic.a aVar, InterfaceC5666wo interfaceC5666wo, int i10) {
        V0 t10;
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, interfaceC5666wo);
        parcelJ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelH0 = h0(1, parcelJ);
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            t10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            t10 = iInterfaceQueryLocalInterface instanceof V0 ? (V0) iInterfaceQueryLocalInterface : new T0(strongBinder);
        }
        parcelH0.recycle();
        return t10;
    }
}
