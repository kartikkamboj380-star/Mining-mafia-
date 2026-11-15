package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class IE implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19502b;

    private IE(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f19501a = interfaceC4864qQ0;
        this.f19502b = interfaceC4864qQ1;
    }

    public static IE a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new IE(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C3593gK((C5350uI) this.f19501a.zzb(), (Executor) this.f19502b.zzb());
    }
}
