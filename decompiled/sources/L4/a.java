package L4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3101e;

    public a(int i10, int i11, boolean z9) {
        this(i10, i11, z9, false, false);
    }

    public static a a() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f3097a, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f3098b);
        SafeParcelWriter.writeInt(parcel, 4, this.f3099c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f3100d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f3101e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public a(int i10, int i11, boolean z9, boolean z10) {
        this(i10, i11, z9, false, z10);
    }

    public a(int i10, int i11, boolean z9, boolean z10, boolean z11) {
        String str;
        if (z9) {
            str = "0";
        } else {
            str = z10 ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 13 + String.valueOf(i11).length() + 2);
        sb.append("afma-sdk-a-v");
        sb.append(i10);
        sb.append(".");
        sb.append(i11);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), i10, i11, z9, z11);
    }

    a(String str, int i10, int i11, boolean z9, boolean z10) {
        this.f3097a = str;
        this.f3098b = i10;
        this.f3099c = i11;
        this.f3100d = z9;
        this.f3101e = z10;
    }
}
