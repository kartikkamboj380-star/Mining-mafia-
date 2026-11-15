package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<o2> CREATOR = new p2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1412d;

    public o2(int i10, int i11, String str, long j10) {
        this.f1409a = i10;
        this.f1410b = i11;
        this.f1411c = str;
        this.f1412d = j10;
    }

    public static o2 a(JSONObject jSONObject) {
        return new o2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1409a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.f1410b);
        SafeParcelWriter.writeString(parcel, 3, this.f1411c, false);
        SafeParcelWriter.writeLong(parcel, 4, this.f1412d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
