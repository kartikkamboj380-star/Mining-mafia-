package p066g5;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // p066g5.f
    public final boolean l0(boolean z9) {
        Parcel parcelJ = J();
        int i10 = c.f44399a;
        parcelJ.writeInt(1);
        Parcel parcelH0 = h0(2, parcelJ);
        boolean zA = c.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    @Override // p066g5.f
    public final String zzc() {
        Parcel parcelH0 = h0(1, J());
        String string = parcelH0.readString();
        parcelH0.recycle();
        return string;
    }

    @Override // p066g5.f
    public final boolean zzd() {
        Parcel parcelH0 = h0(6, J());
        boolean zA = c.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }
}
