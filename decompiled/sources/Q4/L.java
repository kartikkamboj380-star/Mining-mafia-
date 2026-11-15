package Q4;

import com.google.android.gms.internal.ads.C3129cd0;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;
import com.google.android.gms.internal.ads.SU;

/* JADX INFO: loaded from: classes2.dex */
public final class L implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4843a;

    private L(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f4843a = interfaceC4864qQ1;
    }

    public static L b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new L(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K zzb() {
        return new K(C3129cd0.b(), ((SU) this.f4843a).zzb());
    }
}
