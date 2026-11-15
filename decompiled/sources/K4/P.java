package K4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P extends AbstractBinderC4009je implements Q {
    public P() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            AbstractC4135ke.h(parcel);
            boolean zZze = zze(aVarJ, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i10 == 2) {
            com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            AbstractC4135ke.h(parcel);
            zzf(aVarJ2);
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.dynamic.a aVarJ3 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            I4.a aVar = (I4.a) AbstractC4135ke.b(parcel, I4.a.CREATOR);
            AbstractC4135ke.h(parcel);
            boolean zZzg = zzg(aVarJ3, aVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }
}
