package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6186d4 extends AbstractC6235j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6172c f36661c;

    public C6186d4(C6172c c6172c) {
        super("internal.eventLogger");
        this.f36661c = c6172c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        B2.a(this.f36718a, 3, list);
        String strZzc = c6157a2.a((InterfaceC6289p) list.get(0)).zzc();
        long jI = (long) B2.i(c6157a2.a((InterfaceC6289p) list.get(1)).zzd().doubleValue());
        InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(2));
        this.f36661c.e(strZzc, jI, interfaceC6289pA instanceof C6262m ? B2.k((C6262m) interfaceC6289pA) : new HashMap());
        return InterfaceC6289p.f36808x;
    }
}
