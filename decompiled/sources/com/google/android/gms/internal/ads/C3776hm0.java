package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3776hm0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f29112e;

    private C3776hm0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f29108a = interfaceC4864qQ0;
        this.f29109b = interfaceC4864qQ1;
        this.f29110c = interfaceC4864qQ2;
        this.f29111d = interfaceC4864qQ3;
        this.f29112e = interfaceC4864qQ4;
    }

    public static C3776hm0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C3776hm0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        C1571Ck0 c1571Ck0 = (C1571Ck0) this.f29108a.zzb();
        InterfaceC4864qQ0 interfaceC4864qQ0 = this.f29110c;
        return new C3650gm0(c1571Ck0, (C3147cm0) this.f29109b.zzb(), (InterfaceC2560Vl0) interfaceC4864qQ0.zzb(), (ExecutorService) this.f29111d.zzb(), (C5043rr0) this.f29112e.zzb());
    }
}
