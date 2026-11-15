package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5065s10 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33069a;

    private C5065s10(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33069a = interfaceC4864qQ0;
    }

    public static C5065s10 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5065s10(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4939r10 zzb() {
        return new C4939r10((AbstractC5860yL) this.f33069a.zzb());
    }
}
