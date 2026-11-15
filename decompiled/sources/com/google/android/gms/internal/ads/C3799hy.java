package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3799hy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3170cy f29156a;

    private C3799hy(C3170cy c3170cy) {
        this.f29156a = c3170cy;
    }

    public static C3799hy b(C3170cy c3170cy) {
        return new C3799hy(c3170cy);
    }

    public static Context c(C3170cy c3170cy) {
        Context contextB = c3170cy.b();
        AbstractC4738pQ0.b(contextB);
        return contextB;
    }

    public final Context a() {
        return c(this.f29156a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f29156a);
    }
}
