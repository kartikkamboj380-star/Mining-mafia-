package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3680h01 extends VY0 implements VZ0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1961Jx0 f28796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final PZ0 f28797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final KX0 f28798j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f28799k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28800l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f28801m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f28802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f28803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private GK0 f28804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C4819q4 f28805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C5816y f28806r;

    /* synthetic */ C3680h01(C4819q4 c4819q4, InterfaceC1961Jx0 interfaceC1961Jx0, PZ0 pz0, KX0 kx0, C5816y c5816y, int i10, boolean z9, int i11, JY0 jy0, InterfaceC4166kt0 interfaceC4166kt0, byte[] bArr) {
        this.f28805q = c4819q4;
        this.f28796h = interfaceC1961Jx0;
        this.f28797i = pz0;
        this.f28798j = kx0;
        this.f28806r = c5816y;
        this.f28799k = i10;
    }

    private final void z() {
        long j10 = this.f28801m;
        boolean z9 = this.f28802n;
        boolean z10 = this.f28803o;
        C4819q4 c4819q4F = F();
        AbstractC5270tf c5315u01 = new C5315u01(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z9, false, false, null, c4819q4F, z10 ? c4819q4F.f32558c : null);
        if (this.f28800l) {
            c5315u01 = new C3302e01(this, c5315u01);
        }
        r(c5315u01);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final synchronized C4819q4 F() {
        return this.f28805q;
    }

    @Override // com.google.android.gms.internal.ads.VZ0
    public final void d(long j10, InterfaceC4311m2 interfaceC4311m2, boolean z9) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f28801m;
        }
        boolean zZzb = interfaceC4311m2.zzb();
        if (!this.f28800l && this.f28801m == j10 && this.f28802n == zZzb && this.f28803o == z9) {
            return;
        }
        this.f28801m = j10;
        this.f28802n = zZzb;
        this.f28803o = z9;
        this.f28800l = false;
        z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final InterfaceC5385uZ0 f(C5637wZ0 c5637wZ0, InterfaceC4683p interfaceC4683p, long j10) {
        InterfaceC4176ky0 interfaceC4176ky0Zza = this.f28796h.zza();
        GK0 gk0 = this.f28804p;
        if (gk0 != null) {
            interfaceC4176ky0Zza.b(gk0);
        }
        C4563o2 c4563o2 = F().f32557b;
        c4563o2.getClass();
        return new C3177d01(c4563o2.f31932a, interfaceC4176ky0Zza, this.f28797i.a(y()), this.f28798j, u(c5637wZ0), this.f28806r, s(c5637wZ0), this, interfaceC4683p, null, this.f28799k, false, 0, null, AbstractC4634ob0.M(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void j(InterfaceC5385uZ0 interfaceC5385uZ0) {
        ((C3177d01) interfaceC5385uZ0).N();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final synchronized void k(C4819q4 c4819q4) {
        this.f28805q = c4819q4;
    }

    @Override // com.google.android.gms.internal.ads.VY0
    protected final void o(GK0 gk0) {
        this.f28804p = gk0;
        Looper.myLooper().getClass();
        y();
        z();
    }

    @Override // com.google.android.gms.internal.ads.VY0
    protected final void q() {
    }
}
