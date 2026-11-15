package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes2.dex */
final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f39156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f39157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f39158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f39159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f39160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f39161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f39162g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.d(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = t.c(calendar);
        this.f39156a = calendarC;
        this.f39157b = calendarC.get(2);
        this.f39158c = calendarC.get(1);
        this.f39159d = calendarC.getMaximum(7);
        this.f39160e = calendarC.getActualMaximum(5);
        this.f39161f = calendarC.getTimeInMillis();
    }

    static m d(int i10, int i11) {
        Calendar calendarI = t.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new m(calendarI);
    }

    static m e(long j10) {
        Calendar calendarI = t.i();
        calendarI.setTimeInMillis(j10);
        return new m(calendarI);
    }

    static m f() {
        return new m(t.g());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f39156a.compareTo(mVar.f39156a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f39157b == mVar.f39157b && this.f39158c == mVar.f39158c;
    }

    int g(int i10) {
        int i11 = this.f39156a.get(7);
        if (i10 <= 0) {
            i10 = this.f39156a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f39159d : i12;
    }

    long h(int i10) {
        Calendar calendarC = t.c(this.f39156a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f39157b), Integer.valueOf(this.f39158c)});
    }

    int i(long j10) {
        Calendar calendarC = t.c(this.f39156a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String j() {
        if (this.f39162g == null) {
            this.f39162g = e.f(this.f39156a.getTimeInMillis());
        }
        return this.f39162g;
    }

    long k() {
        return this.f39156a.getTimeInMillis();
    }

    m l(int i10) {
        Calendar calendarC = t.c(this.f39156a);
        calendarC.add(2, i10);
        return new m(calendarC);
    }

    int m(m mVar) {
        if (this.f39156a instanceof GregorianCalendar) {
            return ((mVar.f39158c - this.f39158c) * 12) + (mVar.f39157b - this.f39157b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f39158c);
        parcel.writeInt(this.f39157b);
    }
}
