package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC5540vo;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.InterfaceC5666wo;

/* JADX INFO: renamed from: H4.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0643v0 extends AbstractC3885ie implements InterfaceC0649x0 {
    C0643v0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // H4.InterfaceC0649x0
    public final InterfaceC5666wo getAdapterCreator() {
        Parcel parcelH0 = h0(2, J());
        InterfaceC5666wo interfaceC5666woY6 = AbstractBinderC5540vo.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC5666woY6;
    }

    @Override // H4.InterfaceC0649x0
    public final D1 getLiteSdkVersion() {
        Parcel parcelH0 = h0(1, J());
        D1 d10 = (D1) AbstractC4135ke.b(parcelH0, D1.CREATOR);
        parcelH0.recycle();
        return d10;
    }
}
