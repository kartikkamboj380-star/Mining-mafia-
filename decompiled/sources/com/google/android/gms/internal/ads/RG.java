package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class RG implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f22780a;

    private RG(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f22780a = interfaceC4864qQ0;
    }

    public static RG b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new RG(interfaceC4864qQ0);
    }

    public static QG c(Set set) {
        return new QG(set);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final QG zzb() {
        return new QG(((C5241tQ0) this.f22780a).zzb());
    }
}
