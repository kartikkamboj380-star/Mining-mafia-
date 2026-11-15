package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3896ik extends AbstractBinderC4009je implements InterfaceC4021jk {
    public AbstractBinderC3896ik() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            AbstractC4135ke.h(parcel);
            t0(aVarJ);
        } else if (i10 == 2) {
            zzc();
        } else {
            if (i10 != 3) {
                return false;
            }
            com.google.android.gms.dynamic.a aVarJ2 = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            AbstractC4135ke.h(parcel);
            W(aVarJ2);
        }
        parcel2.writeNoException();
        return true;
    }
}
