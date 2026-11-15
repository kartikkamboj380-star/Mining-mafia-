package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4175ky implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3170cy f30906a;

    private C4175ky(C3170cy c3170cy) {
        this.f30906a = c3170cy;
    }

    public static C4175ky b(C3170cy c3170cy) {
        return new C4175ky(c3170cy);
    }

    public static WeakReference c(C3170cy c3170cy) {
        WeakReference weakReferenceC = c3170cy.c();
        AbstractC4738pQ0.b(weakReferenceC);
        return weakReferenceC;
    }

    public final WeakReference a() {
        return c(this.f30906a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f30906a);
    }
}
