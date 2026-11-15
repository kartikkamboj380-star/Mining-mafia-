package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class YW implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f25628b;

    private YW(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f25627a = interfaceC4864qQ0;
        this.f25628b = interfaceC4864qQ1;
    }

    public static YW b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new YW(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final XW zzb() {
        return new XW(((QW) this.f25627a).zzb(), ((C3295dy) this.f25628b).zzb());
    }
}
