package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class HandlerThreadC3928j0 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RunnableC4231lP f30263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f30264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Error f30265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RuntimeException f30266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C4054k0 f30267e;

    public HandlerThreadC3928j0() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final C4054k0 a(int i10) {
        boolean z9;
        start();
        this.f30264b = new Handler(getLooper(), this);
        this.f30263a = new RunnableC4231lP(this.f30264b, null);
        synchronized (this) {
            z9 = false;
            this.f30264b.obtainMessage(1, i10, 0).sendToTarget();
            while (this.f30267e == null && this.f30266d == null && this.f30265c == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f30266d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f30265c;
        if (error != null) {
            throw error;
        }
        C4054k0 c4054k0 = this.f30267e;
        c4054k0.getClass();
        return c4054k0;
    }

    public final void b() {
        Handler handler = this.f30264b;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    int i11 = message.arg1;
                    RunnableC4231lP runnableC4231lP = this.f30263a;
                    if (runnableC4231lP == null) {
                        throw null;
                    }
                    runnableC4231lP.a(i11);
                    this.f30267e = new C4054k0(this, this.f30263a.c(), i11 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (MP e10) {
                    YU.f("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f30266d = new IllegalStateException(e10);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e11) {
                    YU.f("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f30265c = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    YU.f("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f30266d = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    RunnableC4231lP runnableC4231lP2 = this.f30263a;
                    if (runnableC4231lP2 == null) {
                        throw null;
                    }
                    runnableC4231lP2.b();
                    return true;
                } catch (Throwable th) {
                    try {
                        YU.f("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
