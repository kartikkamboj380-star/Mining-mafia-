package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinderC4661op extends AbstractBinderC4009je implements InterfaceC4787pp {
    public AbstractBinderC4661op() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC4009je
    protected final boolean x6(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            InterfaceC2097Mo interfaceC2097MoY6 = AbstractBinderC2046Lo.y6(parcel.readStrongBinder());
            AbstractC4135ke.h(parcel);
            d3(interfaceC2097MoY6);
        } else if (i10 == 2) {
            String string = parcel.readString();
            AbstractC4135ke.h(parcel);
            i(string);
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
