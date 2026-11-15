package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends AbstractSafeParcelable {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f38605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final zat f38606b;

    j(int i10, zat zatVar) {
        this.f38605a = i10;
        this.f38606b = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f38605a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f38606b, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
