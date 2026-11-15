package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5749xS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f34886a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Looper f34887b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandlerThread f34888c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f34889d = 0;

    public C5749xS0(Looper looper) {
    }

    public final Looper a() {
        Looper looper;
        synchronized (this.f34886a) {
            try {
                if (this.f34887b == null) {
                    boolean z9 = false;
                    if (this.f34889d == 0 && this.f34888c == null) {
                        z9 = true;
                    }
                    AbstractC2418Ss0.i(z9);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f34888c = handlerThread;
                    handlerThread.start();
                    this.f34887b = this.f34888c.getLooper();
                }
                this.f34889d++;
                looper = this.f34887b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void b() {
        HandlerThread handlerThread;
        synchronized (this.f34886a) {
            try {
                AbstractC2418Ss0.i(this.f34889d > 0);
                int i10 = this.f34889d - 1;
                this.f34889d = i10;
                if (i10 == 0 && (handlerThread = this.f34888c) != null) {
                    handlerThread.quit();
                    this.f34888c = null;
                    this.f34887b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
