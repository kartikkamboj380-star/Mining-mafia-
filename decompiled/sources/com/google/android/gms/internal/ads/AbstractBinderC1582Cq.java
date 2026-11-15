package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC1582Cq extends AbstractBinderC4009je implements InterfaceC1634Dq {
    public static InterfaceC1634Dq y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1634Dq ? (InterfaceC1634Dq) iInterfaceQueryLocalInterface : new C1530Bq(iBinder);
    }
}
