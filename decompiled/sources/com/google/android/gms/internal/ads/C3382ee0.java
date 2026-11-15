package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ee0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3382ee0 implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC3886ie0 f28025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2700Yd0 f28026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f28027c;

    C3382ee0(RunnableC3886ie0 runnableC3886ie0, InterfaceC2700Yd0 interfaceC2700Yd0, boolean z9) {
        this.f28025a = runnableC3886ie0;
        this.f28026b = interfaceC2700Yd0;
        this.f28027c = z9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        InterfaceC2700Yd0 interfaceC2700Yd0 = this.f28026b;
        if (interfaceC2700Yd0.zzb()) {
            RunnableC3886ie0 runnableC3886ie0 = this.f28025a;
            interfaceC2700Yd0.a(th);
            interfaceC2700Yd0.N(false);
            runnableC3886ie0.a(interfaceC2700Yd0);
            if (this.f28027c) {
                runnableC3886ie0.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void zzb(Object obj) {
        InterfaceC2700Yd0 interfaceC2700Yd0 = this.f28026b;
        interfaceC2700Yd0.N(true);
        RunnableC3886ie0 runnableC3886ie0 = this.f28025a;
        runnableC3886ie0.a(interfaceC2700Yd0);
        if (this.f28027c) {
            runnableC3886ie0.h();
        }
    }
}
