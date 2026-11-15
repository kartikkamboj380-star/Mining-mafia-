package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2924b0 implements InterfaceC2927b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3804i0 f26690b;

    C2924b0(C3804i0 c3804i0) {
        Objects.requireNonNull(c3804i0);
        this.f26690b = c3804i0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2927b1
    public final void a(C3152cp c3152cp) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2927b1
    public final void zza() {
        DS0 ds0X0 = this.f26690b.x0();
        if (ds0X0 != null) {
            ds0X0.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2927b1
    public final void zzb() {
        C3804i0 c3804i0 = this.f26690b;
        if (c3804i0.y1() != null) {
            c3804i0.x1();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2927b1
    public final void zzc() {
        C3804i0 c3804i0 = this.f26690b;
        if (c3804i0.y1() != null) {
            c3804i0.r1(0, 1);
        }
    }
}
