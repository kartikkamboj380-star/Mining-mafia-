package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class g implements Parcelable.Creator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f16982b = new g(new zzb());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable.Creator f16983a;

    private g(Parcelable.Creator creator) {
        this.f16983a = creator;
    }

    public static g a() {
        return f16982b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return zzb.zza(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.getEmptyInstance();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
