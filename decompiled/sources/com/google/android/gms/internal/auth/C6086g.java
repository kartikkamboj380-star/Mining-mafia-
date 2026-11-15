package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6086g extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C6086g> CREATOR = new C6089h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f36023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f36024b;

    public C6086g() {
        this.f36023a = 1;
    }

    public final C6086g a(String str) {
        this.f36024b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f36023a);
        SafeParcelWriter.writeString(parcel, 2, this.f36024b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    C6086g(int i10, String str) {
        this.f36023a = i10;
        this.f36024b = str;
    }
}
