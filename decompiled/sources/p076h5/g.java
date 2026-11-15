package p076h5;

import W4.d;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a implements IInterface {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void N0(d dVar, f fVar) {
        Parcel parcelJ = J();
        c.b(parcelJ, dVar);
        c.c(parcelJ, fVar);
        h0(1, parcelJ);
    }
}
