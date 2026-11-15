package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public final class K0 extends AbstractC3885ie implements M0 {
    K0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // H4.M0
    public final void D0(Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(1, parcelJ);
    }
}
