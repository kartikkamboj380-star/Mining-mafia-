package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class MF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f20795a;

    private MF(HF hf, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f20795a = interfaceC4864qQ0;
    }

    public static MF b(HF hf, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new MF(hf, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String strH = ((C3581gE) this.f20795a.zzb()).h();
        AbstractC4738pQ0.b(strH);
        return strH;
    }
}
