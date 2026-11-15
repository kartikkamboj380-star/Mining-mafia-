package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5968zC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35678a;

    private C5968zC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f35678a = interfaceC4864qQ0;
    }

    public static C5968zC a(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5968zC(c4331mC, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new C3593gK((C3202dD) this.f35678a.zzb(), AbstractC2315Qt.f22479g));
        AbstractC4738pQ0.b(setSingleton);
        return setSingleton;
    }
}
