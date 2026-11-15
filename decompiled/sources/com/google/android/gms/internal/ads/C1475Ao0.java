package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ao0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1475Ao0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17410c;

    private C1475Ao0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        this.f17408a = interfaceC4864qQ0;
        this.f17409b = interfaceC4864qQ1;
        this.f17410c = interfaceC4864qQ2;
    }

    public static C1475Ao0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2) {
        return new C1475Ao0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5793xo0((Context) this.f17408a.zzb(), (ExecutorService) this.f17409b.zzb(), (InterfaceC1781Gl0) this.f17410c.zzb());
    }
}
