package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5284tm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5284tm> CREATOR = new C5410um();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f33478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f33479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f33480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f33482h;

    C5284tm(boolean z9, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z10, long j10) {
        this.f33475a = z9;
        this.f33476b = str;
        this.f33477c = i10;
        this.f33478d = bArr;
        this.f33479e = strArr;
        this.f33480f = strArr2;
        this.f33481g = z10;
        this.f33482h = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z9 = this.f33475a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z9);
        SafeParcelWriter.writeString(parcel, 2, this.f33476b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f33477c);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f33478d, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.f33479e, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f33480f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f33481g);
        SafeParcelWriter.writeLong(parcel, 8, this.f33482h);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
