package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2414Sq0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4864qQ0 f23330d;

    private C2414Sq0(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        this.f23327a = interfaceC4864qQ0;
        this.f23328b = interfaceC4864qQ1;
        this.f23329c = interfaceC4864qQ2;
        this.f23330d = interfaceC4864qQ3;
    }

    public static C2414Sq0 a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1, InterfaceC4864qQ0 interfaceC4864qQ2, InterfaceC4864qQ0 interfaceC4864qQ3) {
        return new C2414Sq0(interfaceC4864qQ0, interfaceC4864qQ1, interfaceC4864qQ2, interfaceC4864qQ3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C2362Rq0((Context) this.f23327a.zzb(), (C5043rr0) this.f23328b.zzb(), (C1571Ck0) this.f23329c.zzb(), (InterfaceExecutorServiceC1805Gx0) this.f23330d.zzb());
    }
}
