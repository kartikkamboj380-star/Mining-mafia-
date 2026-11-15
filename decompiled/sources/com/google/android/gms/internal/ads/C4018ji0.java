package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ji0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4018ji0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C4018ji0> CREATOR = new C4144ki0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30545c;

    C4018ji0(int i10, String str, String str2) {
        this.f30543a = i10;
        this.f30544b = str;
        this.f30545c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f30543a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeString(parcel, 2, this.f30544b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f30545c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C4018ji0(String str, String str2) {
        this(1, str, str2);
    }
}
