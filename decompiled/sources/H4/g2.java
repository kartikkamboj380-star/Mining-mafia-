package H4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.InterfaceC5666wo;

/* JADX INFO: loaded from: classes2.dex */
public final class g2 extends com.google.android.gms.dynamic.c {
    public g2() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    public final InterfaceC0608j0 a(Context context, InterfaceC5666wo interfaceC5666wo) {
        try {
            IBinder iBinderH1 = ((C0611k0) getRemoteCreatorInstance(context)).H1(com.google.android.gms.dynamic.b.N0(context), interfaceC5666wo, ModuleDescriptor.MODULE_VERSION);
            if (iBinderH1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderH1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            return iInterfaceQueryLocalInterface instanceof InterfaceC0608j0 ? (InterfaceC0608j0) iInterfaceQueryLocalInterface : new C0602h0(iBinderH1);
        } catch (RemoteException e10) {
            e = e10;
            L4.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (com.google.android.gms.dynamic.c.a e11) {
            e = e11;
            L4.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            L4.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof C0611k0 ? (C0611k0) iInterfaceQueryLocalInterface : new C0611k0(iBinder);
    }
}
