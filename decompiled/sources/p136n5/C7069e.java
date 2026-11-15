package p136n5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.N;
import java.util.List;

/* JADX INFO: renamed from: n5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7069e extends N implements InterfaceC7071g {
    C7069e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // p136n5.InterfaceC7071g
    public final void w0(List list) {
        Parcel parcelH0 = h0();
        parcelH0.writeTypedList(list);
        t1(2, parcelH0);
    }
}
