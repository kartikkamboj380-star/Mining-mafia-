package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class UP implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24000a;

    private UP(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f24000a = interfaceC4864qQ0;
    }

    public static UP a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new UP(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        EnumC3385eg enumC3385eg = ((PF) this.f24000a).a().f35807p.f31543a == 3 ? EnumC3385eg.REWARDED_INTERSTITIAL : EnumC3385eg.REWARD_BASED_VIDEO_AD;
        AbstractC4738pQ0.b(enumC3385eg);
        return enumC3385eg;
    }
}
