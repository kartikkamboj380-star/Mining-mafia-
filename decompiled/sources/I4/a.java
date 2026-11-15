package I4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractSafeParcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1650c;

    public a(String str, String str2, String str3) {
        this.f1648a = str;
        this.f1649b = str2;
        this.f1650c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1648a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.f1649b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f1650c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
