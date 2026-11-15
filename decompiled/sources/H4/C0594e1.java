package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0594e1 extends AbstractC3885ie implements InterfaceC0600g1 {
    C0594e1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // H4.InterfaceC0600g1
    public final void K2(boolean z9) {
        Parcel parcelJ = J();
        int i10 = AbstractC4135ke.f30848b;
        parcelJ.writeInt(z9 ? 1 : 0);
        N0(5, parcelJ);
    }

    @Override // H4.InterfaceC0600g1
    public final void b() {
        N0(2, J());
    }

    @Override // H4.InterfaceC0600g1
    public final void c() {
        N0(4, J());
    }

    @Override // H4.InterfaceC0600g1
    public final void zze() {
        N0(1, J());
    }

    @Override // H4.InterfaceC0600g1
    public final void zzg() {
        N0(3, J());
    }
}
