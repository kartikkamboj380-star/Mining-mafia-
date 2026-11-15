package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3533fr extends AbstractC3885ie implements InterfaceC3785hr {
    C3533fr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3785hr
    public final void G3(String str, InterfaceC4287lr interfaceC4287lr) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.e(parcelJ, interfaceC4287lr);
        N0(7, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3785hr
    public final void K1(C5420ur c5420ur, InterfaceC4287lr interfaceC4287lr) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c5420ur);
        AbstractC4135ke.e(parcelJ, interfaceC4287lr);
        N0(6, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3785hr
    public final void M(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(9, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3785hr
    public final void X0(C5420ur c5420ur, InterfaceC4287lr interfaceC4287lr) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c5420ur);
        AbstractC4135ke.e(parcelJ, interfaceC4287lr);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3785hr
    public final void b2(C5420ur c5420ur, InterfaceC4287lr interfaceC4287lr) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c5420ur);
        AbstractC4135ke.e(parcelJ, interfaceC4287lr);
        N0(5, parcelJ);
    }
}
