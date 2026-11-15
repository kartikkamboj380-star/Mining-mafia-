package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5648wf extends AbstractC3885ie implements InterfaceC5900yf {
    C5648wf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void D0(H4.Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(3, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void b() {
        N0(4, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void zzc() {
        N0(1, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void zzd() {
        N0(2, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5900yf
    public final void zzg() {
        N0(5, J());
    }
}
