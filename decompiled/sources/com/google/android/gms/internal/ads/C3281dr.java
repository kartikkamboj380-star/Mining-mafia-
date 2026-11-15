package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3281dr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3281dr> CREATOR = new C3407er();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27523a;

    public C3281dr(String str) {
        this.f27523a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f27523a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
