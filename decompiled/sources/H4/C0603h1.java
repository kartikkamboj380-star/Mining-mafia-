package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: renamed from: H4.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0603h1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C0603h1> CREATOR = new C0606i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1277a;

    public C0603h1(int i10) {
        this.f1277a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1277a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i11);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
