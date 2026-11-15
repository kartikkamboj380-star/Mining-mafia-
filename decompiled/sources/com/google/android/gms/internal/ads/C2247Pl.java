package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2247Pl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22161a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22162b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f22163c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f22164d = new AtomicBoolean(false);

    public final synchronized void a(boolean z9) {
        this.f22161a = z9;
        this.f22164d.set(true);
    }

    public final synchronized void b(boolean z9, float f10) {
        this.f22162b = z9;
        this.f22163c = f10;
    }

    public final synchronized boolean c(boolean z9) {
        if (!this.f22164d.get()) {
            return z9;
        }
        return this.f22161a;
    }

    public final synchronized boolean d() {
        return this.f22162b;
    }

    public final synchronized float e() {
        return this.f22163c;
    }
}
