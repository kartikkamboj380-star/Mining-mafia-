package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class VP implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24259a;

    private VP(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f24259a = interfaceC4864qQ0;
    }

    public static VP a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new VP(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((PF) this.f24259a).a().f35807p.f31543a == 3 ? "rewarded_interstitial" : "rewarded";
    }
}
