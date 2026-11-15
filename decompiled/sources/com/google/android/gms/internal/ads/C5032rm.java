package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5032rm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5032rm> CREATOR = new C5158sm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f33009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f33010c;

    C5032rm(String str, String[] strArr, String[] strArr2) {
        this.f33008a = str;
        this.f33009b = strArr;
        this.f33010c = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f33008a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f33009b, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.f33010c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
