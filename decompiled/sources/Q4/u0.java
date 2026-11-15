package Q4;

import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;
import com.google.android.gms.internal.ads.WR;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f5000a;

    private u0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f5000a = interfaceC4864qQ0;
    }

    public static u0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new u0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new r0((WR) this.f5000a.zzb());
    }
}
