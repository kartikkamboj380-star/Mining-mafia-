package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class U1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<U1> CREATOR = new V1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1247b;

    public U1(int i10, int i11) {
        this.f1246a = i10;
        this.f1247b = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1246a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.f1247b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public U1(B4.t tVar) {
        this.f1246a = tVar.c();
        this.f1247b = tVar.d();
    }
}
