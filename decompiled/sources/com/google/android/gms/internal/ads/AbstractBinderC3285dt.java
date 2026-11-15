package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3285dt extends AbstractBinderC4009je implements InterfaceC3789ht {
    public AbstractBinderC3285dt() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC4135ke.h(parcel);
        } else if (i10 == 2) {
            String string = parcel.readString();
            AbstractC4135ke.h(parcel);
            j(string);
        } else {
            if (i10 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC4135ke.b(parcel, Bundle.CREATOR);
            AbstractC4135ke.h(parcel);
            x1(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
