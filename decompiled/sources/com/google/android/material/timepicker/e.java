package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f39772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f39773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f39774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f39775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f39776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f39777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f39778g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f39775d = i10;
        this.f39776e = i11;
        this.f39777f = i12;
        this.f39774c = i13;
        this.f39778g = c(i10);
        this.f39772a = new b(59);
        this.f39773b = new b(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f39775d == eVar.f39775d && this.f39776e == eVar.f39776e && this.f39774c == eVar.f39774c && this.f39777f == eVar.f39777f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f39774c), Integer.valueOf(this.f39775d), Integer.valueOf(this.f39776e), Integer.valueOf(this.f39777f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f39775d);
        parcel.writeInt(this.f39776e);
        parcel.writeInt(this.f39777f);
        parcel.writeInt(this.f39774c);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
