package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC3657gq extends AbstractBinderC2089Mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAd.c f28749a;

    public BinderC3657gq(NativeAd.c cVar) {
        this.f28749a = cVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2141Nk
    public final void H4(InterfaceC2401Sk interfaceC2401Sk) {
        this.f28749a.a(new C3531fq(interfaceC2401Sk));
    }
}
