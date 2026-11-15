package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5560vy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f34200a;

    private C5560vy(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f34200a = interfaceC4864qQ0;
    }

    public static C5560vy a(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new C5560vy(c3170cy, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C5440v00((DQ) this.f34200a.zzb());
    }
}
