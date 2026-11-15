package H4;

import B4.C0564a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Z0> CREATOR = new A1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z0 f1255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IBinder f1256e;

    public Z0(int i10, String str, String str2, Z0 z9, IBinder iBinder) {
        this.f1252a = i10;
        this.f1253b = str;
        this.f1254c = str2;
        this.f1255d = z9;
        this.f1256e = iBinder;
    }

    public final C0564a a() {
        C0564a c0564a;
        Z0 z9 = this.f1255d;
        if (z9 == null) {
            c0564a = null;
        } else {
            String str = z9.f1254c;
            c0564a = new C0564a(z9.f1252a, z9.f1253b, str);
        }
        return new C0564a(this.f1252a, this.f1253b, this.f1254c, c0564a);
    }

    public final B4.k j() {
        C0564a c0564a;
        Z0 z9 = this.f1255d;
        InterfaceC0582a1 x10 = null;
        if (z9 == null) {
            c0564a = null;
        } else {
            c0564a = new C0564a(z9.f1252a, z9.f1253b, z9.f1254c);
        }
        int i10 = this.f1252a;
        String str = this.f1253b;
        String str2 = this.f1254c;
        IBinder iBinder = this.f1256e;
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            x10 = iInterfaceQueryLocalInterface instanceof InterfaceC0582a1 ? (InterfaceC0582a1) iInterfaceQueryLocalInterface : new X0(iBinder);
        }
        return new B4.k(i10, str, str2, c0564a, B4.u.e(x10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f1252a;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeString(parcel, 2, this.f1253b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f1254c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f1255d, i10, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.f1256e, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
