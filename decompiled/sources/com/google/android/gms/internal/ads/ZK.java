package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ZK implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UK f26154a;

    private ZK(UK uk) {
        this.f26154a = uk;
    }

    public static ZK b(UK uk) {
        return new ZK(uk);
    }

    public final View a() {
        return this.f26154a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f26154a.d();
    }
}
