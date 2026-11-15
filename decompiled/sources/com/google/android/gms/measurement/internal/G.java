package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractSafeParcelable {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f37528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f37529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f37530d;

    G(G g10, long j10) {
        Preconditions.checkNotNull(g10);
        this.f37527a = g10.f37527a;
        this.f37528b = g10.f37528b;
        this.f37529c = g10.f37529c;
        this.f37530d = j10;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f37528b);
        String str = this.f37529c;
        int length = String.valueOf(str).length();
        String str2 = this.f37527a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        H.a(this, parcel, i10);
    }

    public G(String str, E e10, String str2, long j10) {
        this.f37527a = str;
        this.f37528b = e10;
        this.f37529c = str2;
        this.f37530d = j10;
    }
}
