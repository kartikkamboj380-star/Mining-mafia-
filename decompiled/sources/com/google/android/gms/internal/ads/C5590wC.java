package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.wC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5590wC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4331mC f34495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34496b;

    private C5590wC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f34495a = c4331mC;
        this.f34496b = interfaceC4864qQ0;
    }

    public static C5590wC a(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5590wC(c4331mC, interfaceC4864qQ0);
    }

    public static Set b(C4331mC c4331mC, C3202dD c3202dD) {
        Set setSingleton = Collections.singleton(new C3593gK(c3202dD, AbstractC2315Qt.f22479g));
        AbstractC4738pQ0.b(setSingleton);
        return setSingleton;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return b(this.f34495a, (C3202dD) this.f34496b.zzb());
    }
}
