package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends AbstractC3885ie implements O {
    M(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // H4.O
    public final void v0(h2 h2Var) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, h2Var);
        N0(1, parcelJ);
    }
}
