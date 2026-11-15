package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5532vk extends AbstractBinderC4009je implements InterfaceC5658wk {
    public static InterfaceC5658wk y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5658wk ? (InterfaceC5658wk) iInterfaceQueryLocalInterface : new C5406uk(iBinder);
    }
}
