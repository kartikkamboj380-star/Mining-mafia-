package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class IV0 implements Comparator, Parcelable {
    public static final Parcelable.Creator<IV0> CREATOR = new TS0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VT0[] f19563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19566d;

    IV0(Parcel parcel) {
        this.f19565c = parcel.readString();
        VT0[] vt0Arr = (VT0[]) parcel.createTypedArray(VT0.CREATOR);
        String str = AbstractC4634ob0.f32117a;
        this.f19563a = vt0Arr;
        this.f19566d = vt0Arr.length;
    }

    public final VT0 a(int i10) {
        return this.f19563a[i10];
    }

    public final IV0 b(String str) {
        return Objects.equals(this.f19565c, str) ? this : new IV0(str, false, this.f19563a);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        VT0 vt0 = (VT0) obj2;
        UUID uuid = AbstractC2504Uj0.f24077a;
        UUID uuid2 = ((VT0) obj).f24293b;
        if (uuid.equals(uuid2)) {
            return !uuid.equals(vt0.f24293b) ? 1 : 0;
        }
        return uuid2.compareTo(vt0.f24293b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IV0.class == obj.getClass()) {
            IV0 iv0 = (IV0) obj;
            if (Objects.equals(this.f19565c, iv0.f19565c) && Arrays.equals(this.f19563a, iv0.f19563a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f19564b;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f19565c;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f19563a);
        this.f19564b = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19565c);
        parcel.writeTypedArray(this.f19563a, 0);
    }

    private IV0(String str, boolean z9, VT0... vt0Arr) {
        this.f19565c = str;
        vt0Arr = z9 ? (VT0[]) vt0Arr.clone() : vt0Arr;
        this.f19563a = vt0Arr;
        this.f19566d = vt0Arr.length;
        Arrays.sort(vt0Arr, this);
    }

    public IV0(String str, VT0... vt0Arr) {
        this(null, true, vt0Arr);
    }

    public IV0(List list) {
        this(null, false, (VT0[]) list.toArray(new VT0[0]));
    }
}
