package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class JP implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19880b;

    private JP(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f19879a = interfaceC4864qQ0;
        this.f19880b = interfaceC4864qQ1;
    }

    public static JP a(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new JP(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new IP((HG) this.f19879a.zzb(), ((GD) this.f19880b).a());
    }
}
