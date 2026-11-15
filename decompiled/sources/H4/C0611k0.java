package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.InterfaceC5666wo;

/* JADX INFO: renamed from: H4.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0611k0 extends AbstractC3885ie implements IInterface {
    C0611k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
    }

    public final IBinder H1(com.google.android.gms.dynamic.a aVar, InterfaceC5666wo interfaceC5666wo, int i10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, interfaceC5666wo);
        parcelJ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelH0 = h0(1, parcelJ);
        IBinder strongBinder = parcelH0.readStrongBinder();
        parcelH0.recycle();
        return strongBinder;
    }
}
