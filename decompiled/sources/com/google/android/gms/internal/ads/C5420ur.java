package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5420ur extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C5420ur> CREATOR = new C5546vr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f33908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L4.a f33909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f33910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f33911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f33912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PackageInfo f33913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f33914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f33915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5769xc0 f33916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f33918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f33919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f33920m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f33921v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f33922w;

    public C5420ur(Bundle bundle, L4.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, C5769xc0 c5769xc0, String str4, boolean z9, boolean z10, Bundle bundle2, Bundle bundle3, int i10) {
        this.f33908a = bundle;
        this.f33909b = aVar;
        this.f33911d = str;
        this.f33910c = applicationInfo;
        this.f33912e = list;
        this.f33913f = packageInfo;
        this.f33914g = str2;
        this.f33915h = str3;
        this.f33916i = c5769xc0;
        this.f33917j = str4;
        this.f33918k = z9;
        this.f33919l = z10;
        this.f33920m = bundle2;
        this.f33921v = bundle3;
        this.f33922w = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f33908a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f33909b, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f33910c, i10, false);
        SafeParcelWriter.writeString(parcel, 4, this.f33911d, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.f33912e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f33913f, i10, false);
        SafeParcelWriter.writeString(parcel, 7, this.f33914g, false);
        SafeParcelWriter.writeString(parcel, 9, this.f33915h, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f33916i, i10, false);
        SafeParcelWriter.writeString(parcel, 11, this.f33917j, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f33918k);
        SafeParcelWriter.writeBoolean(parcel, 13, this.f33919l);
        SafeParcelWriter.writeBundle(parcel, 14, this.f33920m, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.f33921v, false);
        SafeParcelWriter.writeInt(parcel, 16, this.f33922w);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
