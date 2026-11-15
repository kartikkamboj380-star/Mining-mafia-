package H4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N extends AbstractBinderC4009je implements O {
    public N() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            h2 h2Var = (h2) AbstractC4135ke.b(parcel, h2.CREATOR);
            AbstractC4135ke.h(parcel);
            v0(h2Var);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String strB = b();
            parcel2.writeNoException();
            parcel2.writeString(strB);
        } else if (i10 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            int i12 = AbstractC4135ke.f30848b;
            parcel2.writeInt(zZzg ? 1 : 0);
        } else if (i10 == 4) {
            String strC = c();
            parcel2.writeNoException();
            parcel2.writeString(strC);
        } else {
            if (i10 != 5) {
                return false;
            }
            h2 h2Var2 = (h2) AbstractC4135ke.b(parcel, h2.CREATOR);
            int i13 = parcel.readInt();
            AbstractC4135ke.h(parcel);
            T0(h2Var2, i13);
            parcel2.writeNoException();
        }
        return true;
    }
}
