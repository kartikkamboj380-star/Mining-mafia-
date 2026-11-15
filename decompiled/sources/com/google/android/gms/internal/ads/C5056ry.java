package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5056ry implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33054a;

    private C5056ry(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f33054a = interfaceC4864qQ0;
    }

    public static C5056ry a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5056ry(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((Boolean) H4.B.c().d(AbstractC3892ii.f29861j2)).booleanValue() ? Collections.singleton(new C3593gK((C3737hT) this.f33054a.zzb(), C3129cd0.b())) : Collections.EMPTY_SET;
        AbstractC4738pQ0.b(setSingleton);
        return setSingleton;
    }
}
