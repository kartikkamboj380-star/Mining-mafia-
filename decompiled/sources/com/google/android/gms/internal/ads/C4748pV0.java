package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4748pV0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C4748pV0 f32406c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4496nV0 f32408b;

    static {
        new C4748pV0("");
        f32406c = new C4748pV0("preload");
    }

    public C4748pV0(String str) {
        this.f32407a = str;
        this.f32408b = Build.VERSION.SDK_INT >= 31 ? new C4496nV0() : null;
    }

    public final synchronized LogSessionId a() {
        C4496nV0 c4496nV0;
        c4496nV0 = this.f32408b;
        if (c4496nV0 == null) {
            throw null;
        }
        return c4496nV0.f31823a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        C4496nV0 c4496nV0 = this.f32408b;
        if (c4496nV0 == null) {
            throw null;
        }
        AbstractC2418Ss0.i(c4496nV0.f31823a.equals(LogSessionId.LOG_SESSION_ID_NONE));
        c4496nV0.f31823a = logSessionId;
    }
}
