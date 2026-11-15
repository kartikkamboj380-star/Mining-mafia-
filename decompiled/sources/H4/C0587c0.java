package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0587c0 extends AbstractC3885ie implements InterfaceC0593e0 {
    C0587c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // H4.InterfaceC0593e0
    public final void E5(S1 s10) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, s10);
        N0(2, parcelJ);
    }

    @Override // H4.InterfaceC0593e0
    public final void S5(S1 s10) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, s10);
        N0(1, parcelJ);
    }
}
