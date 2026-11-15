package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC6048zq extends AbstractBinderC4009je implements InterfaceC1478Aq {
    public static InterfaceC1478Aq y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1478Aq ? (InterfaceC1478Aq) iInterfaceQueryLocalInterface : new C5796xq(iBinder);
    }
}
