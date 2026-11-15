package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class NF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HF f21153a;

    private NF(HF hf) {
        this.f21153a = hf;
    }

    public static NF a(HF hf) {
        return new NF(hf);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return Integer.valueOf(this.f21153a.h());
    }
}
