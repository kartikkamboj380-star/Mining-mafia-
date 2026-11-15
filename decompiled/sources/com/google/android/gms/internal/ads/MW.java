package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class MW implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20854a;

    private MW(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f20854a = interfaceC4864qQ0;
    }

    public static MW b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new MW(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LW zzb() {
        return new LW(((C4049jy) this.f20854a).a());
    }
}
