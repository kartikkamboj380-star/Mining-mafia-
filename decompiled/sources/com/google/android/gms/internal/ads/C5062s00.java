package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5062s00 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33064b;

    private C5062s00(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f33063a = interfaceC4864qQ0;
        this.f33064b = interfaceC4864qQ1;
    }

    public static C5062s00 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C5062s00(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4936r00 zzb() {
        return new C4936r00((Context) this.f33063a.zzb(), (RP) this.f33064b.zzb());
    }
}
