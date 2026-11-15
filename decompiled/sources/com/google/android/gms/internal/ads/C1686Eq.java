package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1686Eq extends AbstractC3885ie implements InterfaceC1790Gq {
    C1686Eq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1790Gq
    public final void i(String str) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        N0(2, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1790Gq
    public final void w0(List list) {
        Parcel parcelJ = J();
        parcelJ.writeTypedList(list);
        N0(1, parcelJ);
    }
}
