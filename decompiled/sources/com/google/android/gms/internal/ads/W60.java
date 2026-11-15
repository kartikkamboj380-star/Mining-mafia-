package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class W60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f24711a;

    W60(Z90 z90) {
        this.f24711a = z90 != null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.a(new V60(this.f24711a, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 36;
    }
}
