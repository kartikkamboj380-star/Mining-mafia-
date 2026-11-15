package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4679oy implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f32223b;

    private C4679oy(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f32222a = interfaceC4864qQ0;
        this.f32223b = interfaceC4864qQ1;
    }

    public static C4679oy a(C3170cy c3170cy, InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new C4679oy(c3170cy, interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((Boolean) H4.B.c().d(AbstractC3892ii.f29533D3)).booleanValue() ? new C5138sc((InterfaceC4509nc) this.f32223b.zzb()) : new C5138sc((InterfaceC4509nc) this.f32222a.zzb());
    }
}
