package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class KF implements InterfaceC3732hQ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HF f20160a;

    private KF(HF hf) {
        this.f20160a = hf;
    }

    public static KF b(HF hf) {
        return new KF(hf);
    }

    public final Bundle a() {
        return this.f20160a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5493vQ0
    public final /* synthetic */ Object zzb() {
        return this.f20160a.d();
    }
}
