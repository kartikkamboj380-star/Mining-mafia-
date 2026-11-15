package H4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;
import com.google.android.gms.internal.ads.C2191Oj;
import com.google.android.gms.internal.ads.InterfaceC1570Ck;
import com.google.android.gms.internal.ads.InterfaceC1726Fk;
import com.google.android.gms.internal.ads.InterfaceC2141Nk;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends AbstractC3885ie implements S {
    P(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // H4.S
    public final void E2(C2191Oj c2191Oj) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, c2191Oj);
        N0(6, parcelJ);
    }

    @Override // H4.S
    public final void M4(I i10) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, i10);
        N0(2, parcelJ);
    }

    @Override // H4.S
    public final void Z3(InterfaceC2141Nk interfaceC2141Nk) {
        Parcel parcelJ = J();
        AbstractC4135ke.e(parcelJ, interfaceC2141Nk);
        N0(10, parcelJ);
    }

    @Override // H4.S
    public final void w5(String str, InterfaceC1726Fk interfaceC1726Fk, InterfaceC1570Ck interfaceC1570Ck) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        AbstractC4135ke.e(parcelJ, interfaceC1726Fk);
        AbstractC4135ke.e(parcelJ, interfaceC1570Ck);
        N0(5, parcelJ);
    }

    @Override // H4.S
    public final O zze() {
        O m10;
        Parcel parcelH0 = h0(1, J());
        IBinder strongBinder = parcelH0.readStrongBinder();
        if (strongBinder == null) {
            m10 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            m10 = iInterfaceQueryLocalInterface instanceof O ? (O) iInterfaceQueryLocalInterface : new M(strongBinder);
        }
        parcelH0.recycle();
        return m10;
    }
}
