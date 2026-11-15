package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2995bZ implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26859e;

    private C2995bZ(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        this.f26855a = interfaceC4864qQ0;
        this.f26856b = interfaceC4864qQ1;
        this.f26857c = interfaceC4864qQ2;
        this.f26858d = interfaceC4864qQ3;
        this.f26859e = interfaceC4864qQ4;
    }

    public static C2995bZ a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3, InterfaceC4864qQ0 interfaceC4864qQ4) {
        return new C2995bZ(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3, interfaceC4864qQ4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2869aZ((Context) this.f26855a.zzb(), (Executor) this.f26856b.zzb(), (AbstractC5860yL) this.f26857c.zzb(), (C3376eb0) this.f26858d.zzb(), (QR) this.f26859e.zzb());
    }
}
