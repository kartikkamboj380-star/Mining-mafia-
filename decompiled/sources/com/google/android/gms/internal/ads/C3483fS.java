package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3483fS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28282a;

    private C3483fS(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f28282a = interfaceC4864qQ0;
    }

    public static C3483fS a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3483fS(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3357eS((Clock) this.f28282a.zzb());
    }
}
