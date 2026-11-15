package H4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.InterfaceC5666wo;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends com.google.android.gms.dynamic.c {
    public d2() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final S a(Context context, String str, InterfaceC5666wo interfaceC5666wo) {
        try {
            IBinder iBinderH1 = ((T) getRemoteCreatorInstance(context)).H1(com.google.android.gms.dynamic.b.N0(context), str, interfaceC5666wo, ModuleDescriptor.MODULE_VERSION);
            if (iBinderH1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderH1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof S ? (S) iInterfaceQueryLocalInterface : new P(iBinderH1);
        } catch (RemoteException e10) {
            e = e10;
            L4.p.g("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (com.google.android.gms.dynamic.c.a e11) {
            e = e11;
            L4.p.g("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new T(iBinder);
    }
}
