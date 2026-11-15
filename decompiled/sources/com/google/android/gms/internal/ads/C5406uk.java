package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5406uk extends AbstractC3885ie implements InterfaceC5658wk {
    C5406uk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5658wk
    public final void V4(InterfaceC4525nk interfaceC4525nk) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC4525nk);
        N0(1, parcelJ);
    }
}
