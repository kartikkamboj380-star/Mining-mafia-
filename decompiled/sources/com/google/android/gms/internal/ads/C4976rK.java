package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4976rK implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32877a;

    private C4976rK(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f32877a = interfaceC4864qQ0;
    }

    public static C4976rK a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4976rK(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4851qK(((C5241tQ0) this.f32877a).zzb());
    }
}
