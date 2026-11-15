package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ip, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC3906ip extends AbstractBinderC4009je implements InterfaceC4031jp {
    public AbstractBinderC3906ip() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            com.google.android.gms.dynamic.a aVarJ = com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(parcel.readStrongBinder());
            AbstractC4135ke.h(parcel);
            I(aVarJ);
        } else if (i10 == 2) {
            String string = parcel.readString();
            AbstractC4135ke.h(parcel);
            i(string);
        } else if (i10 == 3) {
            H4.Z0 z9 = (H4.Z0) AbstractC4135ke.b(parcel, H4.Z0.CREATOR);
            AbstractC4135ke.h(parcel);
            o(z9);
        } else {
            if (i10 != 4) {
                return false;
            }
            InterfaceC1786Go interfaceC1786GoY6 = AbstractBinderC1734Fo.y6(parcel.readStrongBinder());
            AbstractC4135ke.h(parcel);
            F3(interfaceC1786GoY6);
        }
        parcel2.writeNoException();
        return true;
    }
}
