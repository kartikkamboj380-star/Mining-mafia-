package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class D1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<D1> CREATOR = new E1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f1227c;

    public D1(int i10, int i11, String str) {
        this.f1225a = i10;
        this.f1226b = i11;
        this.f1227c = str;
    }

    public final int a() {
        return this.f1226b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f1225a);
        SafeParcelWriter.writeInt(parcel, 2, this.f1226b);
        SafeParcelWriter.writeString(parcel, 3, this.f1227c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zzb() {
        return this.f1227c;
    }
}
