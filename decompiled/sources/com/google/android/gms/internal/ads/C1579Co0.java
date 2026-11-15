package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Co0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1579Co0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17941c;

    private C1579Co0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f17939a = interfaceC4864qQ0;
        this.f17940b = interfaceC4864qQ1;
        this.f17941c = interfaceC4864qQ2;
    }

    public static C1579Co0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C1579Co0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f17939a.zzb();
        InterfaceC4864qQ0 interfaceC4864qQ0 = this.f17941c;
        return new C1891Io0(context, context.getSharedPreferences("pcvmspf2", 0), C3606gQ0.b(this.f17940b), (C5043rr0) interfaceC4864qQ0.zzb());
    }
}
