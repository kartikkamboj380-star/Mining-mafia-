package com.google.android.gms.internal.ads;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class PW0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f22123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioTrack$StreamEventCallback f22124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SW0 f22125c;

    /* synthetic */ PW0(SW0 sw0, byte[] bArr) {
        Objects.requireNonNull(sw0);
        this.f22125c = sw0;
        final Handler handlerY = AbstractC4634ob0.y(null);
        this.f22123a = handlerY;
        LW0 lw0 = new LW0(this);
        this.f22124b = lw0;
        Objects.requireNonNull(handlerY);
        sw0.i().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.MW0
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handlerY.post(runnable);
            }
        }, lw0);
    }

    final /* synthetic */ void a() {
        this.f22125c.i().unregisterStreamEventCallback(this.f22124b);
        this.f22123a.removeCallbacksAndMessages(null);
    }
}
