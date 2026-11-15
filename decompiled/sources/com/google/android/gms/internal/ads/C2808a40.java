package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2808a40 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26400a;

    private C2808a40(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f26400a = interfaceC4864qQ0;
    }

    public static C2808a40 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C2808a40(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X30 zzb() {
        return new X30(((PF) this.f26400a).a());
    }
}
