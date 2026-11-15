package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4351mM implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31496a;

    private C4351mM(C3973jM c3973jM, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f31496a = interfaceC4864qQ0;
    }

    public static C4351mM b(C3973jM c3973jM, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4351mM(c3973jM, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final TM zzb() {
        SM sm = (SM) this.f31496a.zzb();
        AbstractC4738pQ0.b(sm);
        return sm;
    }
}
