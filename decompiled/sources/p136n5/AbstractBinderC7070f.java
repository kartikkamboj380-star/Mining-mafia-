package p136n5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.O;
import com.google.android.gms.internal.measurement.P;
import com.google.android.gms.measurement.internal.S5;
import java.util.ArrayList;

/* JADX INFO: renamed from: n5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC7070f extends O implements InterfaceC7071g {
    public AbstractBinderC7070f() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.O
    protected final boolean J(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(S5.CREATOR);
        P.f(parcel);
        w0(arrayListCreateTypedArrayList);
        return true;
    }
}
