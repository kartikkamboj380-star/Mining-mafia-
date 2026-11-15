package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class NJ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21170a;

    private NJ(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f21170a = interfaceC4864qQ0;
    }

    public static NJ b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new NJ(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MJ zzb() {
        return new MJ(((C5241tQ0) this.f21170a).zzb());
    }
}
