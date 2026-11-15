package V5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends AbstractC0964a implements w {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V5.w
    public final void P3(Bundle bundle, y yVar) {
        Parcel parcelJ = J();
        q.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(yVar);
        h0(3, parcelJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V5.w
    public final void e6(Bundle bundle, y yVar) {
        Parcel parcelJ = J();
        q.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(yVar);
        h0(2, parcelJ);
    }
}
