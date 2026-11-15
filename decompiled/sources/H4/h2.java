package H4;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<h2> CREATOR = new j2();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f1278G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f1279H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f1280I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Z f1281J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f1282K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final String f1283L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final List f1284M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f1285N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f1286O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int f1287P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final long f1288Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final long f1289R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final Bundle f1290S = new Bundle();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f1293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final W1 f1300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Location f1301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f1302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f1303m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Bundle f1304v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f1305w;

    public h2(int i10, long j10, Bundle bundle, int i11, List list, boolean z9, int i12, boolean z10, String str, W1 w10, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z11, Z z12, int i13, String str5, List list3, int i14, String str6, int i15, long j11, long j12) {
        this.f1291a = i10;
        this.f1292b = j10;
        this.f1293c = bundle == null ? new Bundle() : bundle;
        this.f1294d = i11;
        this.f1295e = list;
        this.f1296f = z9;
        this.f1297g = i12;
        this.f1298h = z10;
        this.f1299i = str;
        this.f1300j = w10;
        this.f1301k = location;
        this.f1302l = str2;
        this.f1303m = bundle2 == null ? new Bundle() : bundle2;
        this.f1304v = bundle3;
        this.f1305w = list2;
        this.f1278G = str3;
        this.f1279H = str4;
        this.f1280I = z11;
        this.f1281J = z12;
        this.f1282K = i13;
        this.f1283L = str5;
        this.f1284M = list3 == null ? new ArrayList() : list3;
        this.f1285N = i14;
        this.f1286O = str6;
        this.f1287P = i15;
        this.f1288Q = j11;
        this.f1289R = j12;
    }

    public final boolean a(Object obj) {
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f1291a == h2Var.f1291a && this.f1292b == h2Var.f1292b && L4.q.a(this.f1293c, h2Var.f1293c) && this.f1294d == h2Var.f1294d && Objects.equal(this.f1295e, h2Var.f1295e) && this.f1296f == h2Var.f1296f && this.f1297g == h2Var.f1297g && this.f1298h == h2Var.f1298h && Objects.equal(this.f1299i, h2Var.f1299i) && Objects.equal(this.f1300j, h2Var.f1300j) && Objects.equal(this.f1301k, h2Var.f1301k) && Objects.equal(this.f1302l, h2Var.f1302l) && L4.q.a(this.f1303m, h2Var.f1303m) && L4.q.a(this.f1304v, h2Var.f1304v) && Objects.equal(this.f1305w, h2Var.f1305w) && Objects.equal(this.f1278G, h2Var.f1278G) && Objects.equal(this.f1279H, h2Var.f1279H) && this.f1280I == h2Var.f1280I && this.f1282K == h2Var.f1282K && Objects.equal(this.f1283L, h2Var.f1283L) && Objects.equal(this.f1284M, h2Var.f1284M) && this.f1285N == h2Var.f1285N && Objects.equal(this.f1286O, h2Var.f1286O) && this.f1287P == h2Var.f1287P;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h2) {
            return a(obj) && this.f1288Q == ((h2) obj).f1288Q;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f1291a), Long.valueOf(this.f1292b), this.f1293c, Integer.valueOf(this.f1294d), this.f1295e, Boolean.valueOf(this.f1296f), Integer.valueOf(this.f1297g), Boolean.valueOf(this.f1298h), this.f1299i, this.f1300j, this.f1301k, this.f1302l, this.f1303m, this.f1304v, this.f1305w, this.f1278G, this.f1279H, Boolean.valueOf(this.f1280I), Integer.valueOf(this.f1282K), this.f1283L, this.f1284M, Integer.valueOf(this.f1285N), this.f1286O, Integer.valueOf(this.f1287P), Long.valueOf(this.f1288Q), Long.valueOf(this.f1289R));
    }

    public final boolean j() {
        return zzc() || v();
    }

    public final boolean v() {
        return this.f1293c.getBoolean("zenith_v2", false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1291a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeLong(parcel, 2, this.f1292b);
        SafeParcelWriter.writeBundle(parcel, 3, this.f1293c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f1294d);
        SafeParcelWriter.writeStringList(parcel, 5, this.f1295e, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f1296f);
        SafeParcelWriter.writeInt(parcel, 7, this.f1297g);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f1298h);
        SafeParcelWriter.writeString(parcel, 9, this.f1299i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f1300j, i10, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f1301k, i10, false);
        SafeParcelWriter.writeString(parcel, 12, this.f1302l, false);
        SafeParcelWriter.writeBundle(parcel, 13, this.f1303m, false);
        SafeParcelWriter.writeBundle(parcel, 14, this.f1304v, false);
        SafeParcelWriter.writeStringList(parcel, 15, this.f1305w, false);
        SafeParcelWriter.writeString(parcel, 16, this.f1278G, false);
        SafeParcelWriter.writeString(parcel, 17, this.f1279H, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f1280I);
        SafeParcelWriter.writeParcelable(parcel, 19, this.f1281J, i10, false);
        SafeParcelWriter.writeInt(parcel, 20, this.f1282K);
        SafeParcelWriter.writeString(parcel, 21, this.f1283L, false);
        SafeParcelWriter.writeStringList(parcel, 22, this.f1284M, false);
        SafeParcelWriter.writeInt(parcel, 23, this.f1285N);
        SafeParcelWriter.writeString(parcel, 24, this.f1286O, false);
        SafeParcelWriter.writeInt(parcel, 25, this.f1287P);
        SafeParcelWriter.writeLong(parcel, 26, this.f1288Q);
        SafeParcelWriter.writeLong(parcel, 27, this.f1289R);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zzc() {
        return this.f1293c.getBoolean("is_sdk_preload", false);
    }
}
