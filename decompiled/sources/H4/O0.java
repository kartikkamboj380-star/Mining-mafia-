package H4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0 extends AbstractBinderC4009je implements P0 {
    public static P0 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return iInterfaceQueryLocalInterface instanceof P0 ? (P0) iInterfaceQueryLocalInterface : new N0(iBinder);
    }
}
