package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6535g extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C6535g> CREATOR = new C6543h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f38066c;

    C6535g(long j10, int i10, long j11) {
        this.f38064a = j10;
        this.f38065b = i10;
        this.f38066c = j11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f38064a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j10);
        SafeParcelWriter.writeInt(parcel, 2, this.f38065b);
        SafeParcelWriter.writeLong(parcel, 3, this.f38066c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
