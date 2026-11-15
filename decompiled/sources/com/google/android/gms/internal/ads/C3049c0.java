package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3049c0 implements InterfaceC3052c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4502nY0 f26976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f26977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f26978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3804i0 f26979d;

    C3049c0(C3804i0 c3804i0, InterfaceC4502nY0 interfaceC4502nY0, int i10, long j10) {
        this.f26976a = interfaceC4502nY0;
        this.f26977b = i10;
        this.f26978c = j10;
        Objects.requireNonNull(c3804i0);
        this.f26979d = c3804i0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3052c1
    public final void a(long j10) {
        this.f26979d.t1(this.f26976a, this.f26977b, this.f26978c, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3052c1
    public final void zzb() {
        this.f26979d.q1(this.f26976a, this.f26977b, this.f26978c);
    }
}
