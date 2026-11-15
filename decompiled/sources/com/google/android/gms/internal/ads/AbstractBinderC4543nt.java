package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4543nt extends AbstractBinderC4009je implements InterfaceC4669ot {
    public static InterfaceC4669ot y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4669ot ? (InterfaceC4669ot) iInterfaceQueryLocalInterface : new C4417mt(iBinder);
    }
}
