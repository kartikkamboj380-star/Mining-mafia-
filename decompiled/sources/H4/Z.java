package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Z> CREATOR = new C0655z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1251b;

    public Z(String str, String str2) {
        this.f1250a = str;
        this.f1251b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1250a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.f1251b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
