package V5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends AbstractC0964a implements B {
    z(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V5.B
    public final void a2(Bundle bundle, D d10) {
        Parcel parcelJ = J();
        q.c(parcelJ, bundle);
        parcelJ.writeStrongBinder(d10);
        h0(2, parcelJ);
    }
}
