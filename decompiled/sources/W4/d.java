package W4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends AbstractSafeParcelable {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6570b;

    public d(String str, String str2) {
        this.f6569a = str;
        this.f6570b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f6569a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f6570b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
