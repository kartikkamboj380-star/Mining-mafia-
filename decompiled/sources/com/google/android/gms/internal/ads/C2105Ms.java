package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ms, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2105Ms implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20941c;

    private C2105Ms(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f20939a = interfaceC4864qQ0;
        this.f20940b = interfaceC4864qQ1;
        this.f20941c = interfaceC4864qQ2;
    }

    public static C2105Ms a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C2105Ms(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2053Ls((Clock) this.f20939a.zzb(), (InterfaceC0790q0) this.f20940b.zzb(), (C2521Us) this.f20941c.zzb());
    }
}
