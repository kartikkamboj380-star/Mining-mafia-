package com.google.android.gms.internal.ads;

import H4.InterfaceC0582a1;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4641of extends AbstractC3885ie implements InterfaceC4893qf {
    C4641of(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qf
    public final void U(boolean z9) {
        Parcel parcelJ = J();
        int i10 = AbstractC4135ke.f30848b;
        parcelJ.writeInt(z9 ? 1 : 0);
        N0(6, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qf
    public final void b3(H4.S0 s10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, s10);
        N0(7, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qf
    public final void c6(com.google.android.gms.dynamic.a aVar, InterfaceC5900yf interfaceC5900yf) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.e(parcelJ, interfaceC5900yf);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4893qf
    public final InterfaceC0582a1 zzg() {
        Parcel parcelH0 = h0(5, J());
        InterfaceC0582a1 interfaceC0582a1Y6 = H4.Y0.y6(parcelH0.readStrongBinder());
        parcelH0.recycle();
        return interfaceC0582a1Y6;
    }
}
