package H4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class q2 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<q2> CREATOR = new r2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z0 f1420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f1421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1425h;

    public q2(String str, long j10, Z0 z9, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f1418a = str;
        this.f1419b = j10;
        this.f1420c = z9;
        this.f1421d = bundle;
        this.f1422e = str2;
        this.f1423f = str3;
        this.f1424g = str4;
        this.f1425h = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1418a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f1419b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f1420c, i10, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.f1421d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f1422e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f1423f, false);
        SafeParcelWriter.writeString(parcel, 7, this.f1424g, false);
        SafeParcelWriter.writeString(parcel, 8, this.f1425h, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
