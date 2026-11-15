package K4;

import H4.Z0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.AbstractC3127cc0;
import com.google.android.gms.internal.ads.AbstractC4040jt0;

/* JADX INFO: loaded from: classes2.dex */
public final class C extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2592b;

    C(String str, int i10) {
        this.f2591a = str == null ? "" : str;
        this.f2592b = i10;
    }

    public static C a(Throwable th) {
        Z0 z0A = AbstractC3127cc0.a(th);
        return new C(AbstractC4040jt0.c(th.getMessage()) ? z0A.f1253b : th.getMessage(), z0A.f1252a);
    }

    public final A j() {
        return new A(this.f2591a, this.f2592b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f2591a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f2592b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
