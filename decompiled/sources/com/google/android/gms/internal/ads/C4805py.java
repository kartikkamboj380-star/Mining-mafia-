package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.py, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4805py implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32523a;

    private C4805py(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f32523a = interfaceC4864qQ0;
    }

    public static C4805py b(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4805py(c3170cy, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        return C2592Wb0.a(((C4049jy) this.f32523a).a()).e();
    }
}
