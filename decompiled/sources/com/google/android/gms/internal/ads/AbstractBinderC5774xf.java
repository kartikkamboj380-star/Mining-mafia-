package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC5774xf extends AbstractBinderC4009je implements InterfaceC5900yf {
    public AbstractBinderC5774xf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zzc();
        } else if (i10 == 2) {
            zzd();
        } else if (i10 == 3) {
            H4.Z0 z9 = (H4.Z0) AbstractC4135ke.b(parcel, H4.Z0.CREATOR);
            AbstractC4135ke.h(parcel);
            D0(z9);
        } else if (i10 == 4) {
            b();
        } else {
            if (i10 != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
