package p136n5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: n5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7065a extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7065a> CREATOR = new C7066b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f46884a;

    public C7065a(Bundle bundle) {
        this.f46884a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.f46884a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
