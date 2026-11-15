package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class N50 implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21058b;

    private N50(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        this.f21057a = interfaceC4864qQ0;
        this.f21058b = interfaceC4864qQ1;
    }

    public static N50 b(InterfaceC4864qQ0 interfaceC4864qQ0, InterfaceC4864qQ0 interfaceC4864qQ1) {
        return new N50(interfaceC4864qQ0, interfaceC4864qQ1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L50 zzb() {
        return new L50(((C4049jy) this.f21057a).a(), (Intent) this.f21058b.zzb());
    }
}
