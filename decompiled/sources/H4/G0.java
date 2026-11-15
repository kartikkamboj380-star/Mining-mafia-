package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;

/* JADX INFO: loaded from: classes2.dex */
public final class G0 extends AbstractC3885ie implements I0 {
    G0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // H4.I0
    public final String b() {
        Parcel parcelH0 = h0(2, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // H4.I0
    public final String zze() {
        Parcel parcelH0 = h0(1, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }
}
