package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2155Nr extends AbstractBinderC4009je implements InterfaceC2207Or {
    public static InterfaceC2207Or y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2207Or ? (InterfaceC2207Or) iInterfaceQueryLocalInterface : new C2103Mr(iBinder);
    }
}
