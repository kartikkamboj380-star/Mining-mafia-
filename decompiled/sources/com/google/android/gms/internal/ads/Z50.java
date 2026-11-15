package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class Z50 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f26115a;

    private Z50(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f26115a = interfaceC4864qQ0;
    }

    public static Z50 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new Z50(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X50 zzb() {
        return new X50((C3376eb0) this.f26115a.zzb());
    }
}
