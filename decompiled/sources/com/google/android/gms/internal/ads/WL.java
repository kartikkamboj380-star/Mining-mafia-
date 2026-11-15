package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class WL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24752a;

    private WL(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f24752a = interfaceC4864qQ0;
    }

    public static WL a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new WL(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((TL) this.f24752a).a().d() != null ? Collections.singleton("banner") : Collections.EMPTY_SET;
        AbstractC4738pQ0.b(setSingleton);
        return setSingleton;
    }
}
