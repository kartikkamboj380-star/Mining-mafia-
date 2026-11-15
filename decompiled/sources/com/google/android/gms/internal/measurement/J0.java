package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<J0> CREATOR = new K0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f36308c;

    public J0(int i10, String str, Intent intent) {
        this.f36306a = i10;
        this.f36307b = str;
        this.f36308c = intent;
    }

    public static J0 a(Activity activity) {
        return new J0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j10 = (J0) obj;
        return this.f36306a == j10.f36306a && Objects.equals(this.f36307b, j10.f36307b) && Objects.equals(this.f36308c, j10.f36308c);
    }

    public final int hashCode() {
        return this.f36306a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f36306a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeString(parcel, 2, this.f36307b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f36308c, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
