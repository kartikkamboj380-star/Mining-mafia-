package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 extends AbstractC3885ie implements S0 {
    Q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // H4.S0
    public final void a6(o2 o2Var) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, o2Var);
        N0(1, parcelJ);
    }

    @Override // H4.S0
    public final boolean b() {
        Parcel parcelH0 = h0(2, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }
}
