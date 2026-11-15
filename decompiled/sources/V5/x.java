package V5;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x extends p implements y {
    public x() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // V5.p
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            Bundle bundle = (Bundle) q.a(parcel, Bundle.CREATOR);
            q.b(parcel);
            r5(bundle);
            return true;
        }
        if (i10 == 3) {
            Bundle bundle2 = (Bundle) q.a(parcel, Bundle.CREATOR);
            q.b(parcel);
            n0(bundle2);
            return true;
        }
        if (i10 == 4) {
            Bundle bundle3 = (Bundle) q.a(parcel, Bundle.CREATOR);
            q.b(parcel);
            M5(bundle3);
            return true;
        }
        if (i10 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) q.a(parcel, Bundle.CREATOR);
        q.b(parcel);
        r0(bundle4);
        return true;
    }
}
