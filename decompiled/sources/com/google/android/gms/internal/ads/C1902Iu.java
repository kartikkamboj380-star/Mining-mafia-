package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1902Iu {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f19685b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f19684a = TimeUnit.MILLISECONDS.toNanos(((Long) H4.B.c().d(AbstractC3892ii.f29903n0)).longValue());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19686c = true;

    C1902Iu() {
    }

    public final void a() {
        this.f19686c = true;
    }

    public final void b(SurfaceTexture surfaceTexture, final InterfaceC5300tu interfaceC5300tu) {
        if (interfaceC5300tu == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f19686c) {
            long j10 = timestamp - this.f19685b;
            if (Math.abs(j10) < this.f19684a) {
                return;
            }
        }
        this.f19686c = false;
        this.f19685b = timestamp;
        K4.F0.f2598l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Hu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                interfaceC5300tu.zzi();
            }
        });
    }
}
