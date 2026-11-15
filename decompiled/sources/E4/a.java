package E4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f567a;

    a(boolean z9) {
        this.f567a = z9;
    }

    public boolean a() {
        return this.f567a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, a());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
