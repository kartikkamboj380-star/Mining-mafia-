package H4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.AbstractBinderC4009je;

/* JADX INFO: renamed from: H4.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC0581a0 extends AbstractBinderC4009je implements InterfaceC0584b0 {
    public static InterfaceC0584b0 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0584b0 ? (InterfaceC0584b0) iInterfaceQueryLocalInterface : new Y(iBinder);
    }
}
