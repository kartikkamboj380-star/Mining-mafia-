package H4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H extends AbstractBinderC4009je implements I {
    public H() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 1:
                zzb();
                break;
            case 2:
                int i12 = parcel.readInt();
                AbstractC4135ke.h(parcel);
                G(i12);
                break;
            case 3:
                break;
            case 4:
                b();
                break;
            case 5:
                zzg();
                break;
            case 6:
                c();
                break;
            case 7:
                d();
                break;
            case 8:
                Z0 z9 = (Z0) AbstractC4135ke.b(parcel, Z0.CREATOR);
                AbstractC4135ke.h(parcel);
                j0(z9);
                break;
            case 9:
                zzi();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
