package p136n5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.measurement.internal.Z5;

/* JADX INFO: renamed from: n5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC7073i extends O implements InterfaceC7074j {
    public AbstractBinderC7073i() {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.O
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        Z5 z9 = (Z5) P.b(parcel, Z5.CREATOR);
        P.f(parcel);
        Q5(z9);
        return true;
    }
}
