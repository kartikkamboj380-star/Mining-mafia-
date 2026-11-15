package p016b5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f11593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f11595c;

    a(int i10, int i11, Bundle bundle) {
        this.f11593a = i10;
        this.f11594b = i11;
        this.f11595c = bundle;
    }

    public int a() {
        return this.f11594b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f11593a);
        SafeParcelWriter.writeInt(parcel, 2, a());
        SafeParcelWriter.writeBundle(parcel, 3, this.f11595c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
