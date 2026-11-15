package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Os, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2209Os implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21698b;

    private C2209Os(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f21697a = interfaceC4864qQ0;
        this.f21698b = interfaceC4864qQ1;
    }

    public static C2209Os b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C2209Os(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2157Ns zzb() {
        return new C2157Ns((Clock) this.f21697a.zzb(), (C2053Ls) this.f21698b.zzb());
    }
}
