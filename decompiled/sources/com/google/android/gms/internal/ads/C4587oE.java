package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4587oE implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32011a;

    private C4587oE(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f32011a = interfaceC4864qQ0;
    }

    public static C4587oE a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4587oE(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    public static C3593gK b(C4455nB c4455nB, Executor executor) {
        return new C3593gK(c4455nB, executor);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return b((C4455nB) this.f32011a.zzb(), C3129cd0.b());
    }
}
