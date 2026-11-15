package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4765pe extends AbstractBinderC4009je implements InterfaceC5016re {
    public static InterfaceC5016re y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5016re ? (InterfaceC5016re) iInterfaceQueryLocalInterface : new C4639oe(iBinder);
    }
}
