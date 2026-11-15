package P5;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends g implements m {
    public l() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // P5.g
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) h.a(parcel, Bundle.CREATOR);
            h.b(parcel);
            h5(bundle);
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) h.a(parcel, Bundle.CREATOR);
        h.b(parcel);
        f0(bundle2);
        return true;
    }
}
