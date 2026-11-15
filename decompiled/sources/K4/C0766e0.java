package K4;

import com.google.android.gms.internal.ads.C4049jy;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;

/* JADX INFO: renamed from: K4.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0766e0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f2660a;

    private C0766e0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f2660a = interfaceC4864qQ0;
    }

    public static C0766e0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C0766e0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C0762c0(((C4049jy) this.f2660a).a());
    }
}
