package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class IN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19539a;

    public IN(InterfaceC3471fM interfaceC3471fM) {
    }

    public final synchronized boolean a() {
        if (this.f19539a) {
            return false;
        }
        this.f19539a = true;
        notifyAll();
        return true;
    }

    public final synchronized boolean b() {
        boolean z9;
        z9 = this.f19539a;
        this.f19539a = false;
        return z9;
    }

    public final synchronized void c() {
        while (!this.f19539a) {
            wait();
        }
    }

    public final synchronized void d() {
        boolean z9 = false;
        while (!this.f19539a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z9 = true;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean e(long j10) {
        if (j10 > 0) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = j10 + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    d();
                } else {
                    boolean z9 = false;
                    while (!this.f19539a && jElapsedRealtime < j11) {
                        try {
                            wait(j11 - jElapsedRealtime);
                        } catch (InterruptedException unused) {
                            z9 = true;
                        }
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    if (z9) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f19539a;
    }

    public final synchronized boolean f() {
        return this.f19539a;
    }
}
