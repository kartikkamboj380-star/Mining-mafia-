package com.google.android.gms.internal.ads;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
final class D0 extends C0 implements Choreographer.FrameCallback {
    /* synthetic */ D0(Choreographer choreographer, DisplayManager displayManager, byte[] bArr) {
        super(choreographer, displayManager, null);
    }

    private static long c(DisplayManager displayManager) {
        Display display = displayManager.getDisplay(0);
        if (display != null) {
            return (long) (1.0E9d / ((double) display.getRefreshRate()));
        }
        YU.c("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.C0
    final void a() {
        super.a();
        this.f17760a.postFrameCallback(this);
        this.f17763d = c(this.f17761b);
    }

    @Override // com.google.android.gms.internal.ads.C0
    final void b() {
        this.f17761b.unregisterDisplayListener(this);
        this.f17760a.removeFrameCallback(this);
        this.f17762c = -9223372036854775807L;
        this.f17763d = -9223372036854775807L;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f17762c = j10;
        this.f17760a.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            this.f17760a.postFrameCallback(this);
            this.f17763d = c(this.f17761b);
        }
    }
}
