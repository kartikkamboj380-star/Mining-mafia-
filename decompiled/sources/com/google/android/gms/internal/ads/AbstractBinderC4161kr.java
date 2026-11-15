package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4161kr extends AbstractBinderC4009je implements InterfaceC4287lr {
    public AbstractBinderC4161kr() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) AbstractC4135ke.b(parcel, ParcelFileDescriptor.CREATOR);
            AbstractC4135ke.h(parcel);
            D5(parcelFileDescriptor);
        } else if (i10 == 2) {
            K4.C c10 = (K4.C) AbstractC4135ke.b(parcel, K4.C.CREATOR);
            AbstractC4135ke.h(parcel);
            E1(c10);
        } else {
            if (i10 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) AbstractC4135ke.b(parcel, ParcelFileDescriptor.CREATOR);
            C5420ur c5420ur = (C5420ur) AbstractC4135ke.b(parcel, C5420ur.CREATOR);
            AbstractC4135ke.h(parcel);
            U2(parcelFileDescriptor2, c5420ur);
        }
        parcel2.writeNoException();
        return true;
    }
}
