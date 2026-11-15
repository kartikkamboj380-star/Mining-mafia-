package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1946Jq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C1946Jq> CREATOR = new C1998Kq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f20004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20005b;

    public C1946Jq(IBinder iBinder, IBinder iBinder2) {
        this.f20004a = (View) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder));
        this.f20005b = (Map) com.google.android.gms.dynamic.b.h0(com.google.android.gms.dynamic.a.AbstractBinderC0355a.J(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        View view = this.f20004a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, com.google.android.gms.dynamic.b.N0(view).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, com.google.android.gms.dynamic.b.N0(this.f20005b).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
