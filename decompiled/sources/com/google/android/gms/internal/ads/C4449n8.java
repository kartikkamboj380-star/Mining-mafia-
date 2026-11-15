package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4449n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31714a = UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31715b;

    public final int a() {
        return this.f31714a;
    }

    public final int b() {
        return this.f31715b;
    }

    public final void c(H8 h10) throws H8 {
        int i10 = this.f31715b + 1;
        this.f31715b = i10;
        int i11 = this.f31714a;
        this.f31714a = i11 + i11;
        if (i10 > 1) {
            throw h10;
        }
    }
}
