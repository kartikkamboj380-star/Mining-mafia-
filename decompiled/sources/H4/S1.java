package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class S1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<S1> CREATOR = new T1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2 f1244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1245d;

    public S1(String str, int i10, h2 h2Var, int i11) {
        this.f1242a = str;
        this.f1243b = i10;
        this.f1244c = h2Var;
        this.f1245d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S1) {
            S1 s10 = (S1) obj;
            if (this.f1242a.equals(s10.f1242a) && this.f1243b == s10.f1243b && this.f1244c.a(s10.f1244c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1242a, Integer.valueOf(this.f1243b), this.f1244c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f1242a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f1243b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f1244c, i10, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f1245d);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
