package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4743pT implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32397a;

    private C4743pT(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f32397a = interfaceC4864qQ0;
    }

    public static C4743pT a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4743pT(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    public static C3593gK b(C4617oT c4617oT, Executor executor) {
        return new C3593gK(c4617oT, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return b((C4617oT) this.f32397a.zzb(), C3129cd0.b());
    }
}
