package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2505Uk extends com.google.android.gms.dynamic.c {
    public C2505Uk() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final InterfaceC3268dk a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderM3 = ((InterfaceC3645gk) getRemoteCreatorInstance(context)).m3(com.google.android.gms.dynamic.b.N0(context), com.google.android.gms.dynamic.b.N0(frameLayout), com.google.android.gms.dynamic.b.N0(frameLayout2), ModuleDescriptor.MODULE_VERSION);
            if (iBinderM3 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3268dk ? (InterfaceC3268dk) iInterfaceQueryLocalInterface : new C3017bk(iBinderM3);
        } catch (RemoteException e10) {
            e = e10;
            L4.p.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (com.google.android.gms.dynamic.c.a e11) {
            e = e11;
            L4.p.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.c
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3645gk ? (InterfaceC3645gk) iInterfaceQueryLocalInterface : new C3393ek(iBinder);
    }
}
