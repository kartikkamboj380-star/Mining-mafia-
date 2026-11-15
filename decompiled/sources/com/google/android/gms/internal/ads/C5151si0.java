package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.si0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5151si0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5151si0> CREATOR = new C5277ti0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f33220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33222e;

    C5151si0(int i10, int i11, int i12, String str, String str2) {
        this.f33218a = i10;
        this.f33219b = i11;
        this.f33220c = str;
        this.f33221d = str2;
        this.f33222e = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f33218a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.f33219b);
        SafeParcelWriter.writeString(parcel, 3, this.f33220c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f33221d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f33222e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C5151si0(int i10, EnumC2647Xd enumC2647Xd, String str, String str2) {
        this(1, 1, enumC2647Xd.zza(), str, str2);
    }
}
