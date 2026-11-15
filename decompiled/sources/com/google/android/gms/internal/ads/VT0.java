package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class VT0 implements Parcelable {
    public static final Parcelable.Creator<VT0> CREATOR = new C5373uT0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f24292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f24293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f24296e;

    VT0(Parcel parcel) {
        this.f24293b = new UUID(parcel.readLong(), parcel.readLong());
        this.f24294c = parcel.readString();
        String string = parcel.readString();
        String str = AbstractC4634ob0.f32117a;
        this.f24295d = string;
        this.f24296e = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VT0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VT0 vt0 = (VT0) obj;
        return Objects.equals(this.f24294c, vt0.f24294c) && Objects.equals(this.f24295d, vt0.f24295d) && Objects.equals(this.f24293b, vt0.f24293b) && Arrays.equals(this.f24296e, vt0.f24296e);
    }

    public final int hashCode() {
        int i10 = this.f24292a;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f24293b.hashCode() * 31;
        String str = this.f24294c;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f24295d.hashCode()) * 31) + Arrays.hashCode(this.f24296e);
        this.f24292a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f24293b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f24294c);
        parcel.writeString(this.f24295d);
        parcel.writeByteArray(this.f24296e);
    }

    public VT0(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f24293b = uuid;
        this.f24294c = null;
        this.f24295d = A8.h(str2);
        this.f24296e = bArr;
    }
}
