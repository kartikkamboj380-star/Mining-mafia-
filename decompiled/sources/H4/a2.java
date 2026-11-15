package H4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class a2 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<a2> CREATOR = new b2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1260c;

    public a2(B4.x xVar) {
        this(xVar.c(), xVar.b(), xVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z9 = this.f1258a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z9);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f1259b);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f1260c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public a2(boolean z9, boolean z10, boolean z11) {
        this.f1258a = z9;
        this.f1259b = z10;
        this.f1260c = z11;
    }
}
