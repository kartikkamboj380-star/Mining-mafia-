package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class CC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17821a;

    private CC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f17821a = interfaceC4864qQ0;
    }

    public static CC a(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new CC(c4331mC, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final DH dhA = ((C4081kD) this.f17821a).a();
        return new C3593gK(new BI() { // from class: com.google.android.gms.internal.ads.kC
            @Override // com.google.android.gms.internal.ads.BI
            public final /* synthetic */ void zza() {
                dhA.zzc();
            }
        }, AbstractC2315Qt.f22479g);
    }
}
