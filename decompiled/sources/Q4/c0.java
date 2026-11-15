package Q4;

import com.google.android.gms.internal.ads.C1546By;
import com.google.android.gms.internal.ads.C2639Wz;
import com.google.android.gms.internal.ads.C4049jy;
import com.google.android.gms.internal.ads.F40;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4907b;

    private c0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f4906a = interfaceC4864qQ0;
        this.f4907b = interfaceC4864qQ3;
    }

    public static c0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new c0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new b0(((C4049jy) this.f4906a).a(), C2639Wz.a(), F40.b(), ((C1546By) this.f4907b).a());
    }
}
