package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class G20 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f18900a;

    private G20(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f18900a = interfaceC4864qQ0;
    }

    public static G20 b(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new G20(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final E20 zzb() {
        return new E20(((C4049jy) this.f18900a).a());
    }
}
