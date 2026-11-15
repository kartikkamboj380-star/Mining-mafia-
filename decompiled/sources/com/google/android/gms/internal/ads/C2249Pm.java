package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2249Pm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2249Pm> CREATOR = new C2301Qm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f22186b;

    public C2249Pm(String str, Bundle bundle) {
        this.f22185a = str;
        this.f22186b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f22185a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.f22186b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
