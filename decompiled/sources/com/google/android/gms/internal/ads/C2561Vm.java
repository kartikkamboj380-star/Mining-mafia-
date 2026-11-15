package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2561Vm extends AbstractC3885ie implements InterfaceC2665Xm {
    C2561Vm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2665Xm
    public final void n(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2665Xm
    public final void zze() {
        N0(1, J());
    }
}
