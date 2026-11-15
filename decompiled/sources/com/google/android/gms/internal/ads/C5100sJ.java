package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5100sJ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3465fJ f33133a;

    private C5100sJ(C3465fJ c3465fJ) {
        this.f33133a = c3465fJ;
    }

    public static C5100sJ a(C3465fJ c3465fJ) {
        return new C5100sJ(c3465fJ);
    }

    public static Set b(C3465fJ c3465fJ) {
        return c3465fJ.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f33133a.m();
    }
}
