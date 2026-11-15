package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4795pt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C4795pt> CREATOR = new C4921qt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H4.m2 f32495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H4.h2 f32496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f32498f;

    public C4795pt(String str, String str2, H4.m2 m2Var, H4.h2 h2Var, int i10, String str3) {
        this.f32493a = str;
        this.f32494b = str2;
        this.f32495c = m2Var;
        this.f32496d = h2Var;
        this.f32497e = i10;
        this.f32498f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f32493a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.f32494b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f32495c, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f32496d, i10, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f32497e);
        SafeParcelWriter.writeString(parcel, 6, this.f32498f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
