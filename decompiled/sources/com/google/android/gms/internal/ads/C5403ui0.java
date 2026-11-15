package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ui0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5403ui0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5403ui0> CREATOR = new C5529vi0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f33885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33886c;

    C5403ui0(int i10, byte[] bArr, int i11) {
        this.f33884a = i10;
        this.f33885b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f33886c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f33884a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f33885b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f33886c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C5403ui0(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
