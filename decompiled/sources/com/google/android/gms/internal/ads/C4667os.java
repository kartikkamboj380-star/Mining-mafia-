package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4667os {
    public static final InterfaceC3033bs a(Context context, String str, InterfaceC5666wo interfaceC5666wo) {
        try {
            IBinder iBinderH1 = ((C3661gs) L4.t.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", C4541ns.f31900a)).H1(com.google.android.gms.dynamic.b.N0(context), str, interfaceC5666wo, ModuleDescriptor.MODULE_VERSION);
            if (iBinderH1 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderH1.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3033bs ? (InterfaceC3033bs) iInterfaceQueryLocalInterface : new C2779Zr(iBinderH1);
        } catch (L4.s e10) {
            e = e10;
            L4.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (RemoteException e11) {
            e = e11;
            L4.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
