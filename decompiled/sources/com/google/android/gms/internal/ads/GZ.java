package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class GZ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19073c;

    private GZ(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f19071a = interfaceC4864qQ0;
        this.f19072b = interfaceC4864qQ1;
        this.f19073c = interfaceC4864qQ2;
    }

    public static GZ a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new GZ(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new FZ((Context) this.f19071a.zzb(), (VL) this.f19072b.zzb(), ((C1546By) this.f19073c).a());
    }
}
