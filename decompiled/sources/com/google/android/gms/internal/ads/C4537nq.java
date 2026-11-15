package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4537nq extends com.google.android.gms.dynamic.c {
    public C4537nq() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final InterfaceC4915qq a(Activity activity) {
        try {
            IBinder iBinderI = ((InterfaceC5292tq) getRemoteCreatorInstance(activity)).I(com.google.android.gms.dynamic.b.N0(activity));
            if (iBinderI == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderI.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof InterfaceC4915qq ? (InterfaceC4915qq) iInterfaceQueryLocalInterface : new C4663oq(iBinderI);
        } catch (RemoteException e10) {
            L4.p.g("Could not create remote AdOverlay.", e10);
            return null;
        } catch (com.google.android.gms.dynamic.c.a e11) {
            L4.p.g("Could not create remote AdOverlay.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5292tq ? (InterfaceC5292tq) iInterfaceQueryLocalInterface : new C5040rq(iBinder);
    }
}
