package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C5373uT0 implements Parcelable.Creator {
    C5373uT0() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new VT0(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VT0[i10];
    }
}
