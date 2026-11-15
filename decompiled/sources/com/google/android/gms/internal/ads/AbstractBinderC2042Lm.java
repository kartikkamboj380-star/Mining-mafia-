package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC2042Lm extends AbstractBinderC4009je implements InterfaceC2093Mm {
    public AbstractBinderC2042Lm() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static InterfaceC2093Mm y6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2093Mm ? (InterfaceC2093Mm) iInterfaceQueryLocalInterface : new C1990Km(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(C1730Fm.CREATOR);
        AbstractC4135ke.h(parcel);
        e3(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
