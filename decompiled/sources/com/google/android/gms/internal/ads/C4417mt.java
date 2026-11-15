package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4417mt extends AbstractC3885ie implements InterfaceC4669ot {
    C4417mt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4669ot
    public final InterfaceC4291lt A0(com.google.android.gms.dynamic.a aVar, InterfaceC5666wo interfaceC5666wo, int i10) {
        InterfaceC4291lt c4039jt;
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, interfaceC5666wo);
        parcelJ.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelH0 = h0(2, parcelJ);
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            c4039jt = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c4039jt = iInterfaceQueryLocalInterface instanceof InterfaceC4291lt ? (InterfaceC4291lt) iInterfaceQueryLocalInterface : new C4039jt(strongBinder);
        }
        parcelH0.recycle();
        return c4039jt;
    }
}
