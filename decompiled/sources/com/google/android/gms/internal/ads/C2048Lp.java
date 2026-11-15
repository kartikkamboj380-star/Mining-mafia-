package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Lp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2048Lp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2048Lp> CREATOR = new C2099Mp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20672c;

    C2048Lp(int i10, int i11, int i12) {
        this.f20670a = i10;
        this.f20671b = i11;
        this.f20672c = i12;
    }

    public static C2048Lp a(B4.v vVar) {
        return new C2048Lp(vVar.a(), vVar.c(), vVar.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2048Lp)) {
            C2048Lp c2048Lp = (C2048Lp) obj;
            if (c2048Lp.f20672c == this.f20672c && c2048Lp.f20671b == this.f20671b && c2048Lp.f20670a == this.f20670a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f20670a, this.f20671b, this.f20672c});
    }

    public final String toString() {
        int i10 = this.f20670a;
        int length = String.valueOf(i10).length();
        int i11 = this.f20671b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f20672c;
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 1 + String.valueOf(i12).length());
        sb.append(i10);
        sb.append(".");
        sb.append(i11);
        sb.append(".");
        sb.append(i12);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f20670a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.f20671b);
        SafeParcelWriter.writeInt(parcel, 3, this.f20672c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
