package W4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends AbstractSafeParcelable {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6572b;

    public f(String str, int i10) {
        this.f6571a = str;
        this.f6572b = i10;
    }

    public final int a() {
        return this.f6572b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6571a, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f6572b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zzb() {
        return this.f6571a;
    }
}
