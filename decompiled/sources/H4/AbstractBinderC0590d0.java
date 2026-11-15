package H4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0590d0 extends AbstractBinderC4009je implements InterfaceC0593e0 {
    public AbstractBinderC0590d0() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            S1 s10 = (S1) AbstractC4135ke.b(parcel, S1.CREATOR);
            AbstractC4135ke.h(parcel);
            S5(s10);
        } else {
            if (i10 != 2) {
                return false;
            }
            S1 s11 = (S1) AbstractC4135ke.b(parcel, S1.CREATOR);
            AbstractC4135ke.h(parcel);
            E5(s11);
        }
        parcel2.writeNoException();
        return true;
    }
}
