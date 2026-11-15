package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2841aL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26491a;

    private C2841aL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f26491a = interfaceC4864qQ0;
    }

    public static C2841aL a(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2841aL(uk, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C3593gK((C3959jF) this.f26491a.zzb(), AbstractC2315Qt.f22479g));
        AbstractC4738pQ0.b(setSingleton);
        return setSingleton;
    }
}
