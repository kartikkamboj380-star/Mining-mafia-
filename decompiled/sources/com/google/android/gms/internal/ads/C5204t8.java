package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5204t8 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f33343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5078s8 f33344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3945j8 f33345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f33346d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4827q8 f33347e;

    public C5204t8(BlockingQueue blockingQueue, InterfaceC5078s8 interfaceC5078s8, InterfaceC3945j8 interfaceC3945j8, C4827q8 c4827q8) {
        this.f33343a = blockingQueue;
        this.f33344b = interfaceC5078s8;
        this.f33345c = interfaceC3945j8;
        this.f33347e = c4827q8;
    }

    private void b() {
        AbstractC5960z8 abstractC5960z8 = (AbstractC5960z8) this.f33343a.take();
        SystemClock.elapsedRealtime();
        abstractC5960z8.f(3);
        try {
            try {
                abstractC5960z8.d("network-queue-take");
                abstractC5960z8.m();
                TrafficStats.setThreadStatsTag(abstractC5960z8.c());
                C5456v8 c5456v8A = this.f33344b.a(abstractC5960z8);
                abstractC5960z8.d("network-http-complete");
                if (c5456v8A.f34002e && abstractC5960z8.r()) {
                    abstractC5960z8.e("not-modified");
                    abstractC5960z8.x();
                } else {
                    E8 e8S = abstractC5960z8.s(c5456v8A);
                    abstractC5960z8.d("network-parse-complete");
                    C3821i8 c3821i8 = e8S.f18422b;
                    if (c3821i8 != null) {
                        this.f33345c.b(abstractC5960z8.j(), c3821i8);
                        abstractC5960z8.d("network-cache-written");
                    }
                    abstractC5960z8.q();
                    this.f33347e.a(abstractC5960z8, e8S, null);
                    abstractC5960z8.w(e8S);
                }
            } catch (H8 e10) {
                SystemClock.elapsedRealtime();
                this.f33347e.b(abstractC5960z8, e10);
                abstractC5960z8.x();
            } catch (Exception e11) {
                K8.d(e11, "Unhandled exception %s", e11.toString());
                H8 h10 = new H8(e11);
                SystemClock.elapsedRealtime();
                this.f33347e.b(abstractC5960z8, h10);
                abstractC5960z8.x();
            }
        } finally {
            abstractC5960z8.f(4);
        }
    }

    public final void a() {
        this.f33346d = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f33346d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                K8.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
