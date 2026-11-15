package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5216tE implements InterfaceC2837aJ, OG {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Clock f33369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5468vE f33370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C6019zb0 f33371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f33372d;

    C5216tE(Clock clock, C5468vE c5468vE, C6019zb0 c6019zb0, String str) {
        this.f33369a = clock;
        this.f33370b = c5468vE;
        this.f33371c = c6019zb0;
        this.f33372d = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2837aJ
    public final void zza() {
        this.f33370b.d(this.f33372d, this.f33369a.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void zzg() {
        Clock clock = this.f33369a;
        this.f33370b.e(this.f33371c.f35798g, this.f33372d, clock.elapsedRealtime());
    }
}
