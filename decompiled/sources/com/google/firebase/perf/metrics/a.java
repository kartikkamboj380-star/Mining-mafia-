package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0373a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicLong f40455b;

    /* JADX INFO: renamed from: com.google.firebase.perf.metrics.a$a, reason: collision with other inner class name */
    class C0373a implements Parcelable.Creator {
        C0373a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0373a c0373a) {
        this(parcel);
    }

    long a() {
        return this.f40455b.get();
    }

    String b() {
        return this.f40454a;
    }

    public void c(long j10) {
        this.f40455b.addAndGet(j10);
    }

    void d(long j10) {
        this.f40455b.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f40454a);
        parcel.writeLong(this.f40455b.get());
    }

    public a(String str) {
        this.f40454a = str;
        this.f40455b = new AtomicLong(0L);
    }

    private a(Parcel parcel) {
        this.f40454a = parcel.readString();
        this.f40455b = new AtomicLong(parcel.readLong());
    }
}
