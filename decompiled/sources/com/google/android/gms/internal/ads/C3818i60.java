package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.i60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3818i60 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29264a;

    private C3818i60(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f29264a = interfaceC4864qQ1;
    }

    public static C3818i60 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C3818i60(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3566g60 zzb() {
        return new C3566g60(C3129cd0.b(), ((C4049jy) this.f29264a).a());
    }
}
