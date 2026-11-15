package p136n5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.N;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.measurement.internal.Z5;

/* JADX INFO: renamed from: n5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7072h extends N implements InterfaceC7074j {
    C7072h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // p136n5.InterfaceC7074j
    public final void Q5(Z5 z9) {
        Parcel parcelH0 = h0();
        P.c(parcelH0, z9);
        t1(2, parcelH0);
    }
}
