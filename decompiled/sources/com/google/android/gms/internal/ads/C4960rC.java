package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4960rC implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32856a;

    private C4960rC(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f32856a = interfaceC4864qQ0;
    }

    public static C4960rC a(C4331mC c4331mC, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4960rC(c4331mC, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return AbstractC1903Iu0.l(new C3593gK((C3202dD) this.f32856a.zzb(), AbstractC2315Qt.f22479g));
    }
}
