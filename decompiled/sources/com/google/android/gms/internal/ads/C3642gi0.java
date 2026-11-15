package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3642gi0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3642gi0> CREATOR = new C3768hi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f28717b;

    C3642gi0(int i10, byte[] bArr) {
        this.f28716a = i10;
        this.f28717b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f28716a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f28717b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C3642gi0(byte[] bArr) {
        this(1, bArr);
    }
}
