package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.br, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3031br extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3031br> CREATOR = new C3156cr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f26947b;

    public C3031br(boolean z9, List list) {
        this.f26946a = z9;
        this.f26947b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z9 = this.f26946a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z9);
        SafeParcelWriter.writeStringList(parcel, 3, this.f26947b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
