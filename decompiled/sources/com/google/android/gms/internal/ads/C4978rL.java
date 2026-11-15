package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4978rL implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UK f32878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32879b;

    private C4978rL(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f32878a = uk;
        this.f32879b = interfaceC4864qQ0;
    }

    public static C4978rL a(UK uk, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C4978rL(uk, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.f32878a.g((Executor) this.f32879b.zzb());
    }
}
