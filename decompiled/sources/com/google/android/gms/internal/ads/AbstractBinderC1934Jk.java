package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1934Jk extends AbstractBinderC4009je implements InterfaceC1986Kk {
    public static InterfaceC1986Kk y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1986Kk ? (InterfaceC1986Kk) iInterfaceQueryLocalInterface : new C1882Ik(iBinder);
    }
}
