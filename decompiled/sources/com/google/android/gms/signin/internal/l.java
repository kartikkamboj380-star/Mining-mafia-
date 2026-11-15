package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends AbstractSafeParcelable {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f38607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConnectionResult f38608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zav f38609c;

    l(int i10, ConnectionResult connectionResult, zav zavVar) {
        this.f38607a = i10;
        this.f38608b = connectionResult;
        this.f38609c = zavVar;
    }

    public final zav a() {
        return this.f38609c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f38607a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f38608b, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f38609c, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f38608b;
    }
}
