package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2259Pr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2259Pr> CREATOR = new C2311Qr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4.h2 f22199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22200b;

    public C2259Pr(H4.h2 h2Var, String str) {
        this.f22199a = h2Var;
        this.f22200b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        H4.h2 h2Var = this.f22199a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, h2Var, i10, false);
        SafeParcelWriter.writeString(parcel, 3, this.f22200b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
