package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4583oC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4331mC f31997a;

    private C4583oC(C4331mC c4331mC) {
        this.f31997a = c4331mC;
    }

    public static C4583oC b(C4331mC c4331mC) {
        return new C4583oC(c4331mC);
    }

    public static View c(C4331mC c4331mC) {
        View viewB = c4331mC.b();
        AbstractC4738pQ0.b(viewB);
        return viewB;
    }

    public final View a() {
        return c(this.f31997a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f31997a);
    }
}
