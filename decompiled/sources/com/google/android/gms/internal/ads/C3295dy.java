package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3295dy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f27533a;

    private C3295dy(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f27533a = interfaceC4864qQ0;
    }

    public static C3295dy b(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3295dy(c3170cy, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0790q0 zzb() {
        return ((C1588Ct) this.f27533a.zzb()).r();
    }
}
