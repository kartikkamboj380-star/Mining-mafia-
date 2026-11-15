package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ur0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5421ur0 extends AbstractC3885ie implements InterfaceC5673wr0 {
    C5421ur0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5673wr0
    public final void U0(Bundle bundle, InterfaceC5925yr0 interfaceC5925yr0) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, bundle);
        AbstractC4135ke.e(parcelJ, interfaceC5925yr0);
        t1(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5673wr0
    public final void p1(Bundle bundle, InterfaceC5925yr0 interfaceC5925yr0) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, bundle);
        AbstractC4135ke.e(parcelJ, interfaceC5925yr0);
        t1(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5673wr0
    public final void x2(String str, Bundle bundle, InterfaceC5925yr0 interfaceC5925yr0) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.c(parcelJ, bundle);
        AbstractC4135ke.e(parcelJ, interfaceC5925yr0);
        t1(1, parcelJ);
    }
}
