package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4285lq extends AbstractBinderC4009je implements InterfaceC4411mq {
    public static InterfaceC4411mq y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4411mq ? (InterfaceC4411mq) iInterfaceQueryLocalInterface : new C4159kq(iBinder);
    }
}
