package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.InterfaceC5666wo;
import java.util.List;

/* JADX INFO: renamed from: H4.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0602h0 extends AbstractC3885ie implements InterfaceC0608j0 {
    C0602h0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // H4.InterfaceC0608j0
    public final void N(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(18, parcelJ);
    }

    @Override // H4.InterfaceC0608j0
    public final void i6(List list, InterfaceC0593e0 interfaceC0593e0) {
        Parcel parcelJ = J();
        parcelJ.writeTypedList(list);
        AbstractC4135ke.e(parcelJ, interfaceC0593e0);
        N0(1, parcelJ);
    }

    @Override // H4.InterfaceC0608j0
    public final void q1(InterfaceC5666wo interfaceC5666wo) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC5666wo);
        N0(8, parcelJ);
    }
}
