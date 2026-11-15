package com.google.android.gms.internal.ads;

import H4.InterfaceC0591d1;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2457Tm extends AbstractBinderC4009je implements InterfaceC2509Um {
    public AbstractBinderC2457Tm() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC2665Xm c2561Vm;
        if (i10 == 3) {
            InterfaceC0591d1 interfaceC0591d1Zzb = zzb();
            parcel2.writeNoException();
            AbstractC4135ke.e(parcel2, interfaceC0591d1Zzb);
            return true;
        }
        if (i10 == 4) {
            zzc();
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 5) {
            com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c2561Vm = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                c2561Vm = iInterfaceQueryLocalInterface instanceof InterfaceC2665Xm ? (InterfaceC2665Xm) iInterfaceQueryLocalInterface : new C2561Vm(strongBinder);
            }
            AbstractC4135ke.h(parcel);
            v4(aVarJ, c2561Vm);
            parcel2.writeNoException();
            return true;
        }
        if (i10 == 6) {
            com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            AbstractC4135ke.h(parcel);
            I(aVarJ2);
            parcel2.writeNoException();
            return true;
        }
        if (i10 != 7) {
            return false;
        }
        InterfaceC2607Wj interfaceC2607WjB = b();
        parcel2.writeNoException();
        AbstractC4135ke.e(parcel2, interfaceC2607WjB);
        return true;
    }
}
