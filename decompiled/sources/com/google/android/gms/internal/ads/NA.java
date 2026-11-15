package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class NA implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4864qQ0 f21143a;

    private NA(InterfaceC4864qQ0 interfaceC4864qQ0) {
        this.f21143a = interfaceC4864qQ0;
    }

    public static NA a(InterfaceC4864qQ0 interfaceC4864qQ0) {
        return new NA(interfaceC4864qQ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new MA((Context) this.f21143a.zzb());
    }
}
