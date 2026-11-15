package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4322m70 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f31449a;

    private C4322m70(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f31449a = interfaceC4864qQ0;
    }

    public static C4322m70 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4322m70(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4070k70 zzb() {
        return new C4070k70(((C4049jy) this.f31449a).a(), C3129cd0.b());
    }
}
