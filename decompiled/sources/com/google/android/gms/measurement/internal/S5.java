package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class S5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<S5> CREATOR = new T5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37727c;

    S5(String str, long j10, int i10) {
        this.f37725a = str;
        this.f37726b = j10;
        this.f37727c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f37725a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f37726b);
        SafeParcelWriter.writeInt(parcel, 3, this.f37727c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
