package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2353Rm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2353Rm> CREATOR = new C2405Sm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22910d;

    public C2353Rm(int i10, int i11, String str, int i12) {
        this.f22907a = i10;
        this.f22908b = i11;
        this.f22909c = str;
        this.f22910d = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f22908b;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeString(parcel, 2, this.f22909c, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f22910d);
        SafeParcelWriter.writeInt(parcel, 1000, this.f22907a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
