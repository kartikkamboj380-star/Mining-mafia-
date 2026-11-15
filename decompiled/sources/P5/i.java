package P5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends AbstractC0923a implements k {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // P5.k
    public final void L0(String str, Bundle bundle, m mVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        h.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(mVar);
        h0(2, parcelJ);
    }
}
