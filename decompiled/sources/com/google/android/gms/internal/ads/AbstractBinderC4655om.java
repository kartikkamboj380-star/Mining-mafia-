package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4655om extends AbstractBinderC4009je implements InterfaceC4781pm {
    public AbstractBinderC4655om() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String string = parcel.readString();
            AbstractC4135ke.h(parcel);
            k(string);
        } else {
            if (i10 != 2) {
                return false;
            }
            b();
        }
        parcel2.writeNoException();
        return true;
    }
}
