package H4;

import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0597f1 extends AbstractBinderC4009je implements InterfaceC0600g1 {
    public AbstractBinderC0597f1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zze();
        } else if (i10 == 2) {
            b();
        } else if (i10 == 3) {
            zzg();
        } else if (i10 == 4) {
            c();
        } else {
            if (i10 != 5) {
                return false;
            }
            boolean zA = AbstractC4135ke.a(parcel);
            AbstractC4135ke.h(parcel);
            K2(zA);
        }
        parcel2.writeNoException();
        return true;
    }
}
