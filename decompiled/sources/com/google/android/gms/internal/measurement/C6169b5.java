package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6169b5 extends AbstractC6235j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ T5 f36636c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6169b5(C6321s5 c6321s5, String str, T5 t10) {
        super("getValue");
        this.f36636c = t10;
        Objects.requireNonNull(c6321s5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6235j
    public final InterfaceC6289p c(C6157a2 c6157a2, List list) {
        B2.a("getValue", 2, list);
        InterfaceC6289p interfaceC6289pA = c6157a2.a((InterfaceC6289p) list.get(0));
        InterfaceC6289p interfaceC6289pA2 = c6157a2.a((InterfaceC6289p) list.get(1));
        String strK = this.f36636c.k(interfaceC6289pA.zzc());
        return strK != null ? new C6324t(strK) : interfaceC6289pA2;
    }
}
