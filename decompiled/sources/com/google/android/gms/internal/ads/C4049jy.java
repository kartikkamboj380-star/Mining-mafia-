package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4049jy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3170cy f30648a;

    private C4049jy(C3170cy c3170cy) {
        this.f30648a = c3170cy;
    }

    public static C4049jy b(C3170cy c3170cy) {
        return new C4049jy(c3170cy);
    }

    public static Context c(C3170cy c3170cy) {
        Context contextA = c3170cy.a();
        AbstractC4738pQ0.b(contextA);
        return contextA;
    }

    public final Context a() {
        return c(this.f30648a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f30648a);
    }
}
