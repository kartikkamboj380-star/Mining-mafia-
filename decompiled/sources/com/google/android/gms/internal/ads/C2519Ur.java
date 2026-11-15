package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2519Ur extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C2519Ur> CREATOR = new C2571Vr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24110b;

    public C2519Ur(String str, int i10) {
        this.f24109a = str;
        this.f24110b = i10;
    }

    public static C2519Ur a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new C2519Ur(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2519Ur)) {
            return false;
        }
        C2519Ur c2519Ur = (C2519Ur) obj;
        return Objects.equal(this.f24109a, c2519Ur.f24109a) && Objects.equal(Integer.valueOf(this.f24110b), Integer.valueOf(c2519Ur.f24110b));
    }

    public final int hashCode() {
        return Objects.hashCode(this.f24109a, Integer.valueOf(this.f24110b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f24109a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f24110b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
