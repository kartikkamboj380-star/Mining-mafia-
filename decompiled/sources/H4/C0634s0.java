package H4;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.AbstractC3885ie;
import com.google.android.gms.internal.ads.AbstractC4135ke;

/* JADX INFO: renamed from: H4.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0634s0 extends AbstractC3885ie implements InterfaceC0640u0 {
    C0634s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // H4.InterfaceC0640u0
    public final void b() {
        N0(5, J());
    }

    @Override // H4.InterfaceC0640u0
    public final void w6(Z0 z9) {
        Parcel parcelJ = J();
        AbstractC4135ke.c(parcelJ, z9);
        N0(1, parcelJ);
    }

    @Override // H4.InterfaceC0640u0
    public final void zzc() {
        N0(2, J());
    }

    @Override // H4.InterfaceC0640u0
    public final void zzd() {
        N0(3, J());
    }

    @Override // H4.InterfaceC0640u0
    public final void zze() {
        N0(4, J());
    }
}
