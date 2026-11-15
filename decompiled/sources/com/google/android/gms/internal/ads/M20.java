package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class M20 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f20727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f20728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20729c;

    M20(Clock clock, C6019zb0 c6019zb0, long j10) {
        this.f20727a = clock;
        this.f20728b = c6019zb0;
        this.f20729c = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.a(new N20(this.f20728b, this.f20727a.currentTimeMillis(), this.f20729c));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 4;
    }
}
