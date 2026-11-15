package H4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class X0 extends AbstractC3885ie implements InterfaceC0582a1 {
    X0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // H4.InterfaceC0582a1
    public final String b() {
        Parcel parcelH0 = h0(2, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // H4.InterfaceC0582a1
    public final q2 c() {
        Parcel parcelH0 = h0(4, J());
        q2 q2Var = (q2) AbstractC4135ke.b(parcelH0, q2.CREATOR);
        parcelH0.recycle();
        return q2Var;
    }

    @Override // H4.InterfaceC0582a1
    public final String d() {
        Parcel parcelH0 = h0(6, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // H4.InterfaceC0582a1
    public final String zze() {
        Parcel parcelH0 = h0(1, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // H4.InterfaceC0582a1
    public final List zzg() {
        Parcel parcelH0 = h0(3, J());
        ArrayList arrayListCreateTypedArrayList = parcelH0.createTypedArrayList(q2.CREATOR);
        parcelH0.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // H4.InterfaceC0582a1
    public final Bundle zzi() {
        Parcel parcelH0 = h0(5, J());
        Bundle bundle = (Bundle) AbstractC4135ke.b(parcelH0, Bundle.CREATOR);
        parcelH0.recycle();
        return bundle;
    }
}
