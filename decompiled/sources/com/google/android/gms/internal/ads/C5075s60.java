package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.s60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5075s60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f33109a;

    C5075s60(Bundle bundle) {
        this.f33109a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return AbstractC5685wx0.a(new C5201t60(this.f33109a));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 30;
    }
}
