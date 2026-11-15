package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2145Nm implements AdapterStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdapterStatus.State f21337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21339c;

    public C2145Nm(AdapterStatus.State state, String str, int i10) {
        this.f21337a = state;
        this.f21338b = str;
        this.f21339c = i10;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f21338b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f21337a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f21339c;
    }
}
