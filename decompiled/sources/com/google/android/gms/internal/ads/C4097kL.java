package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4097kL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30760a;

    private C4097kL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f30760a = interfaceC4864qQ0;
    }

    public static C4097kL a(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4097kL(uk, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C3593gK((C3959jF) this.f30760a.zzb(), AbstractC2315Qt.f22479g));
        AbstractC4738pQ0.b(setSingleton);
        return setSingleton;
    }
}
