package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class E extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f37474a;

    E(Bundle bundle) {
        this.f37474a = bundle;
    }

    final String J(String str) {
        return this.f37474a.getString(str);
    }

    public final Bundle N() {
        return new Bundle(this.f37474a);
    }

    final /* synthetic */ Bundle Q() {
        return this.f37474a;
    }

    final Object a(String str) {
        return this.f37474a.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new D(this);
    }

    final Long j(String str) {
        return Long.valueOf(this.f37474a.getLong(str));
    }

    public final String toString() {
        return this.f37474a.toString();
    }

    final Double v(String str) {
        return Double.valueOf(this.f37474a.getDouble("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, N(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zze() {
        return this.f37474a.size();
    }
}
