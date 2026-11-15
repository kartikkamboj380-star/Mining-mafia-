package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class NS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final VQ0 f21256a;

    public NS0(Context context, JS0 js0) {
        this.f21256a = new VQ0(context, js0);
    }

    public final NS0 a(final AbstractC4179l abstractC4179l) {
        VQ0 vq0 = this.f21256a;
        AbstractC2418Ss0.i(!vq0.f24283w);
        abstractC4179l.getClass();
        vq0.f24265e = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.SQ0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return abstractC4179l;
            }
        };
        return this;
    }

    public final NS0 b(final InterfaceC2982bS0 interfaceC2982bS0) {
        VQ0 vq0 = this.f21256a;
        AbstractC2418Ss0.i(!vq0.f24283w);
        interfaceC2982bS0.getClass();
        vq0.f24266f = new InterfaceC4166kt0() { // from class: com.google.android.gms.internal.ads.TQ0
            @Override // com.google.android.gms.internal.ads.InterfaceC4166kt0
            public final /* synthetic */ Object zza() {
                return interfaceC2982bS0;
            }
        };
        return this;
    }

    public final OS0 c() {
        VQ0 vq0 = this.f21256a;
        AbstractC2418Ss0.i(!vq0.f24283w);
        vq0.f24283w = true;
        return new OS0(vq0);
    }
}
