package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public final class T0 extends AbstractC3885ie implements V0 {
    T0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // H4.V0
    public final void M2(String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, aVar2);
        N0(1, parcelJ);
    }
}
