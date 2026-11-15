package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC3885ie implements I {
    G(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // H4.I
    public final void G(int i10) {
        Parcel parcelJ = J();
        parcelJ.writeInt(i10);
        N0(2, parcelJ);
    }

    @Override // H4.I
    public final void b() {
        N0(4, J());
    }

    @Override // H4.I
    public final void c() {
        N0(6, J());
    }

    @Override // H4.I
    public final void d() {
        N0(7, J());
    }

    @Override // H4.I
    public final void j0(Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(8, parcelJ);
    }

    @Override // H4.I
    public final void zzb() {
        N0(1, J());
    }

    @Override // H4.I
    public final void zze() {
        N0(3, J());
    }

    @Override // H4.I
    public final void zzg() {
        N0(5, J());
    }

    @Override // H4.I
    public final void zzi() {
        N0(9, J());
    }
}
