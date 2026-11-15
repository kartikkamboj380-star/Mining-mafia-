package Q4;

import com.google.android.gms.internal.ads.C3129cd0;
import com.google.android.gms.internal.ads.C4049jy;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;
import com.google.android.gms.internal.ads.WR;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4964b;

    private n0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f4963a = interfaceC4864qQ0;
        this.f4964b = interfaceC4864qQ1;
    }

    public static n0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new n0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new k0(((C4049jy) this.f4963a).a(), (WR) this.f4964b.zzb(), C3129cd0.b());
    }
}
