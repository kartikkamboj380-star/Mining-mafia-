package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ud0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2492Ud0 implements SJ, InterfaceC4717pG, WJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RunnableC3886ie0 f24061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC2700Yd0 f24062b;

    C2492Ud0(Context context, RunnableC3886ie0 runnableC3886ie0) {
        this.f24061a = runnableC3886ie0;
        this.f24062b = InterfaceC2700Yd0.f(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.SJ
    public final void c() {
        if (((Boolean) AbstractC3140cj.f27185d.e()).booleanValue()) {
            this.f24062b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4717pG
    public final void e(H4.Z0 z9) {
        if (((Boolean) AbstractC3140cj.f27185d.e()).booleanValue()) {
            RunnableC3886ie0 runnableC3886ie0 = this.f24061a;
            InterfaceC2700Yd0 interfaceC2700Yd0 = this.f24062b;
            interfaceC2700Yd0.Q(z9.a().toString());
            interfaceC2700Yd0.N(false);
            runnableC3886ie0.a(interfaceC2700Yd0);
        }
    }

    @Override // com.google.android.gms.internal.ads.WJ
    public final void zza() {
        if (((Boolean) AbstractC3140cj.f27185d.e()).booleanValue()) {
            RunnableC3886ie0 runnableC3886ie0 = this.f24061a;
            InterfaceC2700Yd0 interfaceC2700Yd0 = this.f24062b;
            interfaceC2700Yd0.N(true);
            runnableC3886ie0.a(interfaceC2700Yd0);
        }
    }

    @Override // com.google.android.gms.internal.ads.WJ
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.SJ
    public final void zzg() {
    }
}
