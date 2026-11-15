package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3912is extends AbstractBinderC4009je implements InterfaceC4037js {
    public AbstractBinderC3912is() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zze();
        } else if (i10 == 2) {
            int i12 = parcel.readInt();
            AbstractC4135ke.h(parcel);
            n(i12);
        } else {
            if (i10 != 3) {
                return false;
            }
            H4.Z0 z9 = (H4.Z0) AbstractC4135ke.b(parcel, H4.Z0.CREATOR);
            AbstractC4135ke.h(parcel);
            o(z9);
        }
        parcel2.writeNoException();
        return true;
    }
}
