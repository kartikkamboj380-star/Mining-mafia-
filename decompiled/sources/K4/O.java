package K4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public final class O extends AbstractC3885ie implements Q {
    O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // K4.Q
    public final boolean zze(com.google.android.gms.dynamic.a aVar, String str, String str2) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        Parcel parcelH0 = h0(1, parcelJ);
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }

    @Override // K4.Q
    public final void zzf(com.google.android.gms.dynamic.a aVar) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        N0(2, parcelJ);
    }

    @Override // K4.Q
    public final boolean zzg(com.google.android.gms.dynamic.a aVar, I4.a aVar2) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, aVar);
        AbstractC4135ke.c(parcelJ, aVar2);
        Parcel parcelH0 = h0(3, parcelJ);
        boolean zA = AbstractC4135ke.a(parcelH0);
        parcelH0.recycle();
        return zA;
    }
}
