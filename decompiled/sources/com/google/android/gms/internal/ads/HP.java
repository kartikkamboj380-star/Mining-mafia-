package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class HP implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19287a;

    private HP(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f19287a = interfaceC4864qQ0;
    }

    public static HP b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new HP(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GP zzb() {
        return new GP(((C3599gN) this.f19287a).a());
    }
}
