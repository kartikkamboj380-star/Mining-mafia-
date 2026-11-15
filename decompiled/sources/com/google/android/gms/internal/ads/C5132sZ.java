package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5132sZ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33184b;

    private C5132sZ(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f33183a = interfaceC4864qQ0;
        this.f33184b = interfaceC4864qQ1;
    }

    public static C5132sZ b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5132sZ(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5006rZ zzb() {
        return new C5006rZ((Context) this.f33183a.zzb(), (AbstractC5860yL) this.f33184b.zzb());
    }
}
