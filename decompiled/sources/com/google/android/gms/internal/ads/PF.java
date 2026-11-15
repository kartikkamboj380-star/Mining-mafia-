package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class PF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HF f22075a;

    private PF(HF hf) {
        this.f22075a = hf;
    }

    public static PF b(HF hf) {
        return new PF(hf);
    }

    public static C6019zb0 c(HF hf) {
        C6019zb0 c6019zb0B = hf.b();
        AbstractC4738pQ0.b(c6019zb0B);
        return c6019zb0B;
    }

    public final C6019zb0 a() {
        return c(this.f22075a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return c(this.f22075a);
    }
}
