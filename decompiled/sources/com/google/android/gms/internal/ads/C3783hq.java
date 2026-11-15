package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783hq extends AbstractC3885ie implements InterfaceC4033jq {
    C3783hq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033jq
    public final void B0(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(4, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033jq
    public final void J0(Intent intent) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, intent);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033jq
    public final void s3(com.google.android.gms.dynamic.a aVar, I4.a aVar2) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.c(parcelJ, aVar2);
        N0(6, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033jq
    public final void z3(String[] strArr, int[] iArr, com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        parcelJ.writeStringArray(strArr);
        parcelJ.writeIntArray(iArr);
        AbstractC4135ke.e(parcelJ, aVar);
        N0(5, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4033jq
    public final void zzg() {
        N0(3, J());
    }
}
