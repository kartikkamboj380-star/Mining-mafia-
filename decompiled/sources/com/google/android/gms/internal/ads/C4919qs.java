package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4919qs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C4919qs> CREATOR = new C5044rs();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32739b;

    public C4919qs(U4.e eVar) {
        this(eVar.b(), eVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32738a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.f32739b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C4919qs(String str, String str2) {
        this.f32738a = str;
        this.f32739b = str2;
    }
}
