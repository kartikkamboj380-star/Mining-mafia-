package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class CT implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f17885a;

    private CT(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f17885a = interfaceC4864qQ0;
    }

    public static CT a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new CT(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C4365mT(((C4049jy) this.f17885a).a());
    }
}
