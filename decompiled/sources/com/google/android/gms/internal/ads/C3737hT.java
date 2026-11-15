package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.hT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3737hT implements OJ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bundle f29000a = new Bundle();

    public final synchronized Bundle a() {
        return new Bundle(this.f29000a);
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void d0(String str) {
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final synchronized void j(String str) {
        this.f29000a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final synchronized void k(String str) {
        this.f29000a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final synchronized void o(String str, String str2) {
        this.f29000a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.OJ
    public final void zze() {
    }
}
