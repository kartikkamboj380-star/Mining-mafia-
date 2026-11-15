package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3107cS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f27115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f27116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27117c;

    public C3107cS0() {
        this.f27115a = -9223372036854775807L;
        this.f27116b = -3.4028235E38f;
        this.f27117c = -9223372036854775807L;
    }

    public final C3107cS0 a(long j10) {
        this.f27115a = j10;
        return this;
    }

    public final C3107cS0 b(float f10) {
        boolean z9 = true;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 != -3.4028235E38f) {
            z9 = false;
        }
        AbstractC2418Ss0.a(z9);
        this.f27116b = f10;
        return this;
    }

    public final C3107cS0 c(long j10) {
        boolean z9 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z9 = false;
            }
        }
        AbstractC2418Ss0.a(z9);
        this.f27117c = j10;
        return this;
    }

    public final C3233dS0 d() {
        return new C3233dS0(this, null);
    }

    final /* synthetic */ long e() {
        return this.f27115a;
    }

    final /* synthetic */ float f() {
        return this.f27116b;
    }

    final /* synthetic */ long g() {
        return this.f27117c;
    }

    /* synthetic */ C3107cS0(C3233dS0 c3233dS0, byte[] bArr) {
        this.f27115a = c3233dS0.f27418a;
        this.f27116b = c3233dS0.f27419b;
        this.f27117c = c3233dS0.f27420c;
    }
}
