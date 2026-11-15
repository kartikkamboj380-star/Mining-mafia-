package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class X5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<X5> CREATOR = new Y5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f37813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f37815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f37817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f37818g;

    X5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f37812a = j10;
        this.f37813b = bArr;
        this.f37814c = str;
        this.f37815d = bundle;
        this.f37816e = i10;
        this.f37817f = j11;
        this.f37818g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f37812a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j10);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f37813b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f37814c, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.f37815d, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f37816e);
        SafeParcelWriter.writeLong(parcel, 6, this.f37817f);
        SafeParcelWriter.writeString(parcel, 7, this.f37818g, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
