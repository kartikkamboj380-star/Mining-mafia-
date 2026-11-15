package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5038rp extends AbstractBinderC4009je implements InterfaceC5164sp {
    public AbstractBinderC5038rp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            zze();
        } else if (i10 == 3) {
            String string = parcel.readString();
            AbstractC4135ke.h(parcel);
            i(string);
        } else {
            if (i10 != 4) {
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
