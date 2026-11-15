package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.eZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3372eZ0 implements InterfaceC5063s01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5063s01 f27806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5931yu0 f27807b;

    public C3372eZ0(InterfaceC5063s01 interfaceC5063s01, List list) {
        this.f27806a = interfaceC5063s01;
        this.f27807b = AbstractC5931yu0.u(list);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final void a(long j10) {
        this.f27806a.a(j10);
    }

    public final AbstractC5931yu0 b() {
        return this.f27807b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean d(C3233dS0 c3233dS0) {
        return this.f27806a.d(c3233dS0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzi() {
        return this.f27806a.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final long zzl() {
        return this.f27806a.zzl();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5063s01
    public final boolean zzn() {
        return this.f27806a.zzn();
    }
}
