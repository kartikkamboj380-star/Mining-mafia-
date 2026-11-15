package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class B6 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<B6> CREATOR = new C6();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Boolean f37404G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final long f37405H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final List f37406I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final String f37407J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final String f37408K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f37409L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f37410M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final long f37411N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f37412O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final String f37413P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f37414Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final long f37415R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final String f37416S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final String f37417T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final long f37418U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f37419V;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f37425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f37426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f37427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f37428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f37429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f37430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f37431l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f37432m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f37433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f37434w;

    B6(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z9, boolean z10, String str6, long j13, int i10, boolean z11, boolean z12, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z13, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        Preconditions.checkNotEmpty(str);
        this.f37420a = str;
        this.f37421b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f37422c = str3;
        this.f37429j = j10;
        this.f37423d = str4;
        this.f37424e = j11;
        this.f37425f = j12;
        this.f37426g = str5;
        this.f37427h = z9;
        this.f37428i = z10;
        this.f37430k = str6;
        this.f37431l = j13;
        this.f37432m = i10;
        this.f37433v = z11;
        this.f37434w = z12;
        this.f37404G = bool;
        this.f37405H = j14;
        this.f37406I = list;
        this.f37407J = str7;
        this.f37408K = str8;
        this.f37409L = str9;
        this.f37410M = z13;
        this.f37411N = j15;
        this.f37412O = i11;
        this.f37413P = str10;
        this.f37414Q = i12;
        this.f37415R = j16;
        this.f37416S = str11;
        this.f37417T = str12;
        this.f37418U = j17;
        this.f37419V = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f37420a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.f37421b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f37422c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f37423d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f37424e);
        SafeParcelWriter.writeLong(parcel, 7, this.f37425f);
        SafeParcelWriter.writeString(parcel, 8, this.f37426g, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f37427h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f37428i);
        SafeParcelWriter.writeLong(parcel, 11, this.f37429j);
        SafeParcelWriter.writeString(parcel, 12, this.f37430k, false);
        SafeParcelWriter.writeLong(parcel, 14, this.f37431l);
        SafeParcelWriter.writeInt(parcel, 15, this.f37432m);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f37433v);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f37434w);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.f37404G, false);
        SafeParcelWriter.writeLong(parcel, 22, this.f37405H);
        SafeParcelWriter.writeStringList(parcel, 23, this.f37406I, false);
        SafeParcelWriter.writeString(parcel, 25, this.f37407J, false);
        SafeParcelWriter.writeString(parcel, 26, this.f37408K, false);
        SafeParcelWriter.writeString(parcel, 27, this.f37409L, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.f37410M);
        SafeParcelWriter.writeLong(parcel, 29, this.f37411N);
        SafeParcelWriter.writeInt(parcel, 30, this.f37412O);
        SafeParcelWriter.writeString(parcel, 31, this.f37413P, false);
        SafeParcelWriter.writeInt(parcel, 32, this.f37414Q);
        SafeParcelWriter.writeLong(parcel, 34, this.f37415R);
        SafeParcelWriter.writeString(parcel, 35, this.f37416S, false);
        SafeParcelWriter.writeString(parcel, 36, this.f37417T, false);
        SafeParcelWriter.writeLong(parcel, 37, this.f37418U);
        SafeParcelWriter.writeInt(parcel, 38, this.f37419V);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    B6(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z9, boolean z10, long j12, String str6, long j13, int i10, boolean z11, boolean z12, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z13, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f37420a = str;
        this.f37421b = str2;
        this.f37422c = str3;
        this.f37429j = j12;
        this.f37423d = str4;
        this.f37424e = j10;
        this.f37425f = j11;
        this.f37426g = str5;
        this.f37427h = z9;
        this.f37428i = z10;
        this.f37430k = str6;
        this.f37431l = j13;
        this.f37432m = i10;
        this.f37433v = z11;
        this.f37434w = z12;
        this.f37404G = bool;
        this.f37405H = j14;
        this.f37406I = list;
        this.f37407J = str7;
        this.f37408K = str8;
        this.f37409L = str9;
        this.f37410M = z13;
        this.f37411N = j15;
        this.f37412O = i11;
        this.f37413P = str10;
        this.f37414Q = i12;
        this.f37415R = j16;
        this.f37416S = str11;
        this.f37417T = str12;
        this.f37418U = j17;
        this.f37419V = i13;
    }
}
