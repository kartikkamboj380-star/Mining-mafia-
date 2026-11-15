package com.google.android.gms.internal.measurement;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class S7 extends AbstractC6235j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W7 f36491c;

    public S7(W7 w10) {
        super("internal.registerCallback");
        this.f36491c = w10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        B2.a(this.f36718a, 3, list);
        String strZzc = c6157a2.a((InterfaceC6289p) list.get(0)).zzc();
        InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(1));
        if (!(interfaceC6289pA instanceof C6280o)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(2));
        if (!(interfaceC6289pA2 instanceof C6262m)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C6262m c6262m = (C6262m) interfaceC6289pA2;
        if (!c6262m.G0(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f36491c.a(strZzc, c6262m.G0(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY) ? B2.g(c6262m.Q(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).zzd().doubleValue()) : 1000, (C6280o) interfaceC6289pA, c6262m.Q(HandleInvocationsFromAdViewer.KEY_AD_TYPE).zzc());
        return InterfaceC6289p.f36808x;
    }
}
