package H4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E0 extends AbstractBinderC4009je implements F0 {
    public static F0 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterfaceQueryLocalInterface instanceof F0 ? (F0) iInterfaceQueryLocalInterface : new D0(iBinder);
    }
}
