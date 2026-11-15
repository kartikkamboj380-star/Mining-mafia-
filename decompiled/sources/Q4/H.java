package Q4;

import com.google.android.gms.internal.ads.C3129cd0;
import com.google.android.gms.internal.ads.C3593gK;
import com.google.android.gms.internal.ads.InterfaceC3732hQ0;
import com.google.android.gms.internal.ads.InterfaceC4864qQ0;
import com.google.android.gms.internal.ads.InterfaceExecutorServiceC1805Gx0;

/* JADX INFO: loaded from: classes2.dex */
public final class H implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f4830c;

    private H(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f4828a = interfaceC4864qQ0;
        this.f4829b = interfaceC4864qQ1;
        this.f4830c = interfaceC4864qQ3;
    }

    public static H a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new H(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj = (s0) this.f4828a.zzb();
        O o10 = (O) this.f4829b.zzb();
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0B = C3129cd0.b();
        if (((Integer) this.f4830c.zzb()).intValue() == 2) {
            obj = o10;
        }
        return new C3593gK(obj, interfaceExecutorServiceC1805Gx0B);
    }
}
