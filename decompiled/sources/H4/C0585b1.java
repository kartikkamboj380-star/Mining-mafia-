package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0585b1 extends AbstractC3885ie implements InterfaceC0591d1 {
    C0585b1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // H4.InterfaceC0591d1
    public final void B1(InterfaceC0600g1 interfaceC0600g1) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC0600g1);
        N0(8, parcelJ);
    }

    @Override // H4.InterfaceC0591d1
    public final float d() {
        throw null;
    }

    @Override // H4.InterfaceC0591d1
    public final float e() {
        throw null;
    }

    @Override // H4.InterfaceC0591d1
    public final float zzk() {
        throw null;
    }

    @Override // H4.InterfaceC0591d1
    public final InterfaceC0600g1 zzo() {
        InterfaceC0600g1 c0594e1;
        Parcel parcelH0 = h0(11, J());
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            c0594e1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c0594e1 = iInterfaceQueryLocalInterface instanceof InterfaceC0600g1 ? (InterfaceC0600g1) iInterfaceQueryLocalInterface : new C0594e1(strongBinder);
        }
        parcelH0.recycle();
        return c0594e1;
    }
}
