package E4;

import H4.AbstractBinderC0617m0;
import H4.InterfaceC0620n0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<f> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0620n0 f583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f584c;

    f(boolean z9, IBinder iBinder, IBinder iBinder2) {
        this.f582a = z9;
        this.f583b = iBinder != null ? AbstractBinderC0617m0.y6(iBinder) : null;
        this.f584c = iBinder2;
    }

    public final InterfaceC0620n0 a() {
        return this.f583b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f582a);
        InterfaceC0620n0 interfaceC0620n0 = this.f583b;
        SafeParcelWriter.writeIBinder(parcel, 2, interfaceC0620n0 == null ? null : interfaceC0620n0.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.f584c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.f582a;
    }
}
