package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6551i extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C6551i> CREATOR = new C6559j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v6 f38116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f38118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38119f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G f38120g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f38121h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public G f38122i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f38123j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G f38124k;

    C6551i(C6551i c6551i) {
        Preconditions.checkNotNull(c6551i);
        this.f38114a = c6551i.f38114a;
        this.f38115b = c6551i.f38115b;
        this.f38116c = c6551i.f38116c;
        this.f38117d = c6551i.f38117d;
        this.f38118e = c6551i.f38118e;
        this.f38119f = c6551i.f38119f;
        this.f38120g = c6551i.f38120g;
        this.f38121h = c6551i.f38121h;
        this.f38122i = c6551i.f38122i;
        this.f38123j = c6551i.f38123j;
        this.f38124k = c6551i.f38124k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f38114a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f38115b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f38116c, i10, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f38117d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f38118e);
        SafeParcelWriter.writeString(parcel, 7, this.f38119f, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f38120g, i10, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f38121h);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f38122i, i10, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f38123j);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f38124k, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    C6551i(String str, String str2, v6 v6Var, long j10, boolean z9, String str3, G g10, long j11, G g11, long j12, G g12) {
        this.f38114a = str;
        this.f38115b = str2;
        this.f38116c = v6Var;
        this.f38117d = j10;
        this.f38118e = z9;
        this.f38119f = str3;
        this.f38120g = g10;
        this.f38121h = j11;
        this.f38122i = g11;
        this.f38123j = j12;
        this.f38124k = g12;
    }
}
