package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4159kq extends AbstractC3885ie implements InterfaceC4411mq {
    C4159kq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4411mq
    public final InterfaceC4033jq A0(com.google.android.gms.dynamic.a aVar, InterfaceC5666wo interfaceC5666wo, int i10) {
        InterfaceC4033jq c3783hq;
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, interfaceC5666wo);
        parcelJ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelH0 = h0(1, parcelJ);
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            c3783hq = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3783hq = iInterfaceQueryLocalInterface instanceof InterfaceC4033jq ? (InterfaceC4033jq) iInterfaceQueryLocalInterface : new C3783hq(strongBinder);
        }
        parcelH0.recycle();
        return c3783hq;
    }
}
