package H4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0637t0 extends AbstractBinderC4009je implements InterfaceC0640u0 {
    public AbstractBinderC0637t0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            Z0 z9 = (Z0) AbstractC4135ke.b(parcel, Z0.CREATOR);
            AbstractC4135ke.h(parcel);
            w6(z9);
        } else if (i10 == 2) {
            zzc();
        } else if (i10 == 3) {
            zzd();
        } else if (i10 == 4) {
            zze();
        } else {
            if (i10 != 5) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
