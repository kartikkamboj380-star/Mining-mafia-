package H4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class G1 extends com.google.android.gms.dynamic.c {
    public G1() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    public final B0 a(Context context) {
        try {
            IBinder iBinderH1 = ((C0) getRemoteCreatorInstance(context)).H1(com.google.android.gms.dynamic.b.N0(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderH1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderH1.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof B0 ? (B0) iInterfaceQueryLocalInterface : new C0652y0(iBinderH1);
        } catch (RemoteException e10) {
            e = e10;
            L4.p.g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        } catch (com.google.android.gms.dynamic.c.a e11) {
            e = e11;
            L4.p.g("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C0 ? (C0) iInterfaceQueryLocalInterface : new C0(iBinder);
    }
}
