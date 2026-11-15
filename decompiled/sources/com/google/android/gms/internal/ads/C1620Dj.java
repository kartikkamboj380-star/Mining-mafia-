package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C1620Dj implements L4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C1620Dj f18277a = new C1620Dj();

    private /* synthetic */ C1620Dj() {
    }

    @Override // L4.r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
        return iInterfaceQueryLocalInterface instanceof C1724Fj ? (C1724Fj) iInterfaceQueryLocalInterface : new C1724Fj(iBinder);
    }
}
