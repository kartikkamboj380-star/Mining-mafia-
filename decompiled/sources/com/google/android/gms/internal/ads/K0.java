package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;

/* JADX INFO: loaded from: classes2.dex */
final class K0 extends C0 implements Choreographer$VsyncCallback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f20038e;

    /* synthetic */ K0(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
        this.f20038e = AbstractC4634ob0.y(null);
    }

    @Override // com.google.android.gms.internal.ads.C0
    final void a() {
        super.a();
        this.f17760a.postVsyncCallback(this);
    }

    @Override // com.google.android.gms.internal.ads.C0
    final void b() {
        this.f17761b.unregisterDisplayListener(this);
        this.f20038e.removeCallbacksAndMessages(null);
        this.f17760a.removeVsyncCallback(this);
        this.f17762c = -9223372036854775807L;
        this.f17763d = -9223372036854775807L;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            this.f17760a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f17762c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            this.f17763d = expectedPresentationTimeNanos != 0 ? expectedPresentationTimeNanos : -9223372036854775807L;
        } else {
            this.f17763d = -9223372036854775807L;
        }
        this.f20038e.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.F0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                K0 k10 = this.f18617a;
                k10.f17760a.postVsyncCallback(k10);
            }
        }, 500L);
    }
}
