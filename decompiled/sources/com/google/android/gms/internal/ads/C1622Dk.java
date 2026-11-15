package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1622Dk extends AbstractC3885ie implements InterfaceC1726Fk {
    C1622Dk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1726Fk
    public final void L3(InterfaceC5154sk interfaceC5154sk) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC5154sk);
        N0(1, parcelJ);
    }
}
