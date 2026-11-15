package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class HW implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19308a;

    private HW(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f19308a = interfaceC4864qQ0;
    }

    public static HW b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new HW(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GW zzb() {
        return new GW(((C1962Jy) this.f19308a).zzb());
    }
}
