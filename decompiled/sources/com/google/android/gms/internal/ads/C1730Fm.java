package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1730Fm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1730Fm> CREATOR = new C1782Gm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18834d;

    public C1730Fm(String str, boolean z9, int i10, String str2) {
        this.f18831a = str;
        this.f18832b = z9;
        this.f18833c = i10;
        this.f18834d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f18831a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f18832b);
        SafeParcelWriter.writeInt(parcel, 3, this.f18833c);
        SafeParcelWriter.writeString(parcel, 4, this.f18834d, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
