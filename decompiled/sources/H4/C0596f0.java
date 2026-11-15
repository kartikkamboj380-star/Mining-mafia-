package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0596f0 extends AbstractC3885ie implements InterfaceC0599g0 {
    C0596f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // H4.InterfaceC0599g0
    public final void H2(String str, Z0 z9) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }

    @Override // H4.InterfaceC0599g0
    public final void O3(String str, InterfaceC0582a1 interfaceC0582a1) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.e(parcelJ, interfaceC0582a1);
        N0(1, parcelJ);
    }

    @Override // H4.InterfaceC0599g0
    public final void i(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(2, parcelJ);
    }
}
