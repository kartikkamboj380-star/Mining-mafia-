package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class H0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f36284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f36285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f36286e;

    public H0(long j10, long j11, boolean z9, Bundle bundle, String str) {
        this.f36282a = j10;
        this.f36283b = j11;
        this.f36284c = z9;
        this.f36285d = bundle;
        this.f36286e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f36282a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j10);
        SafeParcelWriter.writeLong(parcel, 2, this.f36283b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f36284c);
        SafeParcelWriter.writeBundle(parcel, 7, this.f36285d, false);
        SafeParcelWriter.writeString(parcel, 8, this.f36286e, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
