package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC3885ie implements L {
    J(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // H4.L
    public final void H0(Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(2, parcelJ);
    }

    @Override // H4.L
    public final void zzb() {
        N0(1, J());
    }
}
