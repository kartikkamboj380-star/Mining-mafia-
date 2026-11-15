package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class YQ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25604a;

    private YQ(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f25604a = interfaceC4864qQ1;
    }

    public static YQ a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new YQ(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0B = C3129cd0.b();
        Set setSingleton = ((Boolean) H4.B.c().d(AbstractC3892ii.f29799d6)).booleanValue() ? Collections.singleton(new C3593gK(((C5116sR) this.f25604a).zzb(), interfaceExecutorServiceC1805Gx0B)) : Collections.EMPTY_SET;
        AbstractC4738pQ0.b(setSingleton);
        return setSingleton;
    }
}
