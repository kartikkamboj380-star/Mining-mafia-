package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3756hc0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29032a;

    private C3756hc0(C3630gc0 c3630gc0, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f29032a = interfaceC4864qQ0;
    }

    public static C3756hc0 a(C3630gc0 c3630gc0, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C3756hc0(c3630gc0, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((C3882ic0) this.f29032a.zzb(), AbstractC2315Qt.f22479g);
    }
}
