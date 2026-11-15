package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0359a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f39046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f39047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f39048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f39049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f39051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f39052g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0359a implements Parcelable.Creator {
        C0359a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f39053f = t.a(m.d(1900, 0).f39161f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f39054g = t.a(m.d(2100, 11).f39161f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f39055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f39056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f39057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f39058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f39059e;

        b(a aVar) {
            this.f39055a = f39053f;
            this.f39056b = f39054g;
            this.f39059e = f.a(Long.MIN_VALUE);
            this.f39055a = aVar.f39046a.f39161f;
            this.f39056b = aVar.f39047b.f39161f;
            this.f39057c = Long.valueOf(aVar.f39049d.f39161f);
            this.f39058d = aVar.f39050e;
            this.f39059e = aVar.f39048c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f39059e);
            m mVarE = m.e(this.f39055a);
            m mVarE2 = m.e(this.f39056b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f39057c;
            return new a(mVarE, mVarE2, cVar, l10 == null ? null : m.e(l10.longValue()), this.f39058d, null);
        }

        public b b(long j10) {
            this.f39057c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean w(long j10);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i10, C0359a c0359a) {
        this(mVar, mVar2, cVar, mVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f39046a.equals(aVar.f39046a) && this.f39047b.equals(aVar.f39047b) && N.b.a(this.f39049d, aVar.f39049d) && this.f39050e == aVar.f39050e && this.f39048c.equals(aVar.f39048c);
    }

    public c f() {
        return this.f39048c;
    }

    m g() {
        return this.f39047b;
    }

    int h() {
        return this.f39050e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f39046a, this.f39047b, this.f39049d, Integer.valueOf(this.f39050e), this.f39048c});
    }

    int i() {
        return this.f39052g;
    }

    m j() {
        return this.f39049d;
    }

    m k() {
        return this.f39046a;
    }

    int l() {
        return this.f39051f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f39046a, 0);
        parcel.writeParcelable(this.f39047b, 0);
        parcel.writeParcelable(this.f39049d, 0);
        parcel.writeParcelable(this.f39048c, 0);
        parcel.writeInt(this.f39050e);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i10) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f39046a = mVar;
        this.f39047b = mVar2;
        this.f39049d = mVar3;
        this.f39050e = i10;
        this.f39048c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > t.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f39052g = mVar.m(mVar2) + 1;
        this.f39051f = (mVar2.f39158c - mVar.f39158c) + 1;
    }
}
