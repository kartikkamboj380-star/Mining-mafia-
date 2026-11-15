package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5953z40 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f35636c;

    private C5953z40(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f35634a = interfaceC4864qQ0;
        this.f35635b = interfaceC4864qQ1;
        this.f35636c = interfaceC4864qQ3;
    }

    public static C5953z40 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C5953z40(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4190l40(((S30) this.f35634a).zzb(), 2147483647L, (Clock) this.f35635b.zzb(), C3129cd0.b(), (QR) this.f35636c.zzb());
    }
}
