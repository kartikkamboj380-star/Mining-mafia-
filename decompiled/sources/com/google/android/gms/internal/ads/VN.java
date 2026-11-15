package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class VN implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f24257a;

    private VN(UN un, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f24257a = interfaceC4864qQ0;
    }

    public static VN a(UN un, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new VN(un, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        SN sn = (SN) this.f24257a.zzb();
        AbstractC4738pQ0.b(sn);
        return sn;
    }
}
