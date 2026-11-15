package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class X30 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6019zb0 f25128a;

    X30(C6019zb0 c6019zb0) {
        this.f25128a = c6019zb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.a(new Y30(this.f25128a.f35808q));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 58;
    }
}
