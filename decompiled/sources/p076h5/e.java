package p076h5;

import W4.f;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends b implements f {
    public e() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // p076h5.b
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        F5((Status) c.a(parcel, Status.CREATOR), (f) c.a(parcel, f.CREATOR));
        return true;
    }
}
