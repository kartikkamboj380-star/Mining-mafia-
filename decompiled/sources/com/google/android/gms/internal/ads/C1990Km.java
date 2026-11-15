package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Km, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1990Km extends AbstractC3885ie implements InterfaceC2093Mm {
    C1990Km(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2093Mm
    public final void e3(List list) {
        Parcel parcelJ = J();
        parcelJ.writeTypedList(list);
        N0(1, parcelJ);
    }
}
