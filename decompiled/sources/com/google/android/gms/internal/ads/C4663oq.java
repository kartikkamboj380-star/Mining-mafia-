package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4663oq extends AbstractC3885ie implements InterfaceC4915qq {
    C4663oq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void C1(int i10, int i11, Intent intent) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        parcelJ.writeInt(i11);
        AbstractC4135ke.c(parcelJ, intent);
        N0(12, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void C3(Bundle bundle) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, bundle);
        N0(1, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void P(Bundle bundle) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, bundle);
        Parcel parcelH0 = h0(6, parcelJ);
        if (parcelH0.readInt() != 0) {
            bundle.readFromParcel(parcelH0);
        }
        parcelH0.recycle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void R(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(13, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void a() {
        N0(8, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void b() {
        N0(14, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void d() {
        N0(3, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void f() {
        N0(9, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void h() {
        N0(7, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void s4(int i10, String[] strArr, int[] iArr) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        parcelJ.writeStringArray(strArr);
        parcelJ.writeIntArray(iArr);
        N0(15, parcelJ);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void zze() {
        N0(10, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final boolean zzg() {
        Parcel parcelH0 = h0(11, J());
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void zzi() {
        N0(2, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void zzk() {
        N0(4, J());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4915qq
    public final void zzl() {
        N0(5, J());
    }
}
