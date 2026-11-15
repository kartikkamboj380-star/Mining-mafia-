package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5157sl0 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f33228a;

    private C5157sl0(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f33228a = interfaceC4864qQ0;
    }

    public static C5157sl0 a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5157sl0(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C1521Bl0((ExecutorService) this.f33228a.zzb());
    }
}
