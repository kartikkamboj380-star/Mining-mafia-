package G4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends AbstractSafeParcelable {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f974i;

    l(boolean z9, boolean z10, String str, boolean z11, float f10, int i10, boolean z12, boolean z13, boolean z14) {
        this.f966a = z9;
        this.f967b = z10;
        this.f968c = str;
        this.f969d = z11;
        this.f970e = f10;
        this.f971f = i10;
        this.f972g = z12;
        this.f973h = z13;
        this.f974i = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z9 = this.f966a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z9);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f967b);
        SafeParcelWriter.writeString(parcel, 4, this.f968c, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f969d);
        SafeParcelWriter.writeFloat(parcel, 6, this.f970e);
        SafeParcelWriter.writeInt(parcel, 7, this.f971f);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f972g);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f973h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f974i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public l(boolean z9, boolean z10, boolean z11, float f10, int i10, boolean z12, boolean z13, boolean z14) {
        this(z9, z10, null, z11, f10, -1, z12, z13, z14);
    }
}
