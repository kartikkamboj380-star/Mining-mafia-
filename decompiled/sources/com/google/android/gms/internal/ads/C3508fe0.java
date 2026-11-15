package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.fe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3508fe0 implements InterfaceC5307tx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ RunnableC3886ie0 f28452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2700Yd0 f28453b;

    C3508fe0(RunnableC3886ie0 runnableC3886ie0, InterfaceC2700Yd0 interfaceC2700Yd0) {
        this.f28452a = runnableC3886ie0;
        this.f28453b = interfaceC2700Yd0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void a(Throwable th) {
        InterfaceC2700Yd0 interfaceC2700Yd0 = this.f28453b;
        interfaceC2700Yd0.a(th);
        interfaceC2700Yd0.N(false);
        this.f28452a.a(interfaceC2700Yd0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5307tx0
    public final void zzb(Object obj) {
    }
}
