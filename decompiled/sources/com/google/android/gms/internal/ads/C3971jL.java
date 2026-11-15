package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3971jL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UK f30403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f30404b;

    private C3971jL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f30403a = uk;
        this.f30404b = interfaceC4864qQ0;
    }

    public static C3971jL a(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3971jL(uk, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setE = this.f30403a.e((C3959jF) this.f30404b.zzb());
        AbstractC4738pQ0.b(setE);
        return setE;
    }
}
