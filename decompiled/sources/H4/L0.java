package H4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L0 extends AbstractBinderC4009je implements M0 {
    public L0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Z0 z9 = (Z0) AbstractC4135ke.b(parcel, Z0.CREATOR);
        AbstractC4135ke.h(parcel);
        D0(z9);
        parcel2.writeNoException();
        return true;
    }
}
