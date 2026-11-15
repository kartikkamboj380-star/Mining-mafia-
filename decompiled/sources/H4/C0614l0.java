package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;

/* JADX INFO: renamed from: H4.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0614l0 extends AbstractC3885ie implements InterfaceC0620n0 {
    C0614l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // H4.InterfaceC0620n0
    public final void I0(String str, String str2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        N0(1, parcelJ);
    }
}
