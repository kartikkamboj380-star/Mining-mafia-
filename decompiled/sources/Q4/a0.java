package Q4;

import com.google.android.gms.internal.ads.C4049jy;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4895a;

    private a0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f4895a = interfaceC4864qQ0;
    }

    public static a0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new a0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new Z(((C4049jy) this.f4895a).a());
    }
}
