package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4188l30 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31168a;

    private C4188l30(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f31168a = interfaceC4864qQ0;
    }

    public static C4188l30 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4188l30(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4062k30((Set) this.f31168a.zzb());
    }
}
