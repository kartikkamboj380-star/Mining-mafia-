package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3688h40 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f28840a;

    private C3688h40(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f28840a = interfaceC4864qQ0;
    }

    public static C3688h40 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3688h40(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3562g40 zzb() {
        return new C3562g40((C90) this.f28840a.zzb());
    }
}
