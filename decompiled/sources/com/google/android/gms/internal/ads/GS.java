package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class GS implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19048a;

    private GS(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f19048a = interfaceC4864qQ0;
    }

    public static GS b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new GS(interfaceC4864qQ0);
    }

    public static FS c(InterfaceC4529nm interfaceC4529nm) {
        return new FS(interfaceC4529nm);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FS zzb() {
        return new FS((InterfaceC4529nm) this.f19048a.zzb());
    }
}
