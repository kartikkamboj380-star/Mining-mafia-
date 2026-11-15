package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class JF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HF f19816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f19817b;

    private JF(HF hf, InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f19816a = hf;
        this.f19817b = interfaceC4864qQ0;
    }

    public static JF a(HF hf, InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new JF(hf, interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextF = this.f19816a.f(((C4049jy) this.f19817b).a());
        AbstractC4738pQ0.b(contextF);
        return contextF;
    }
}
