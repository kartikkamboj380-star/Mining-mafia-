package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5547vr0 extends AbstractBinderC4009je implements InterfaceC5673wr0 {
    public static InterfaceC5673wr0 y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5673wr0 ? (InterfaceC5673wr0) iInterfaceQueryLocalInterface : new C5421ur0(iBinder);
    }
}
