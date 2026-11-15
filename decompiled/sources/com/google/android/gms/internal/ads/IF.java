package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class IF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HF f19503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19504b;

    private IF(HF hf, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f19503a = hf;
        this.f19504b = interfaceC4864qQ0;
    }

    public static IF a(HF hf, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new IF(hf, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f19503a.g((String) this.f19504b.zzb());
    }
}
