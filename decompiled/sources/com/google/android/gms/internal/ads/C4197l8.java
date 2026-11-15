package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4197l8 extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f31199g = K8.f20109b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f31200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue f31201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3945j8 f31202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f31203d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L8 f31204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C4827q8 f31205f;

    public C4197l8(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, InterfaceC3945j8 interfaceC3945j8, C4827q8 c4827q8) {
        this.f31200a = blockingQueue;
        this.f31201b = blockingQueue2;
        this.f31202c = interfaceC3945j8;
        this.f31205f = c4827q8;
        this.f31204e = new L8(this, blockingQueue2, c4827q8);
    }

    private void c() {
        AbstractC5960z8 abstractC5960z8 = (AbstractC5960z8) this.f31200a.take();
        abstractC5960z8.d("cache-queue-take");
        abstractC5960z8.f(1);
        try {
            abstractC5960z8.m();
            InterfaceC3945j8 interfaceC3945j8 = this.f31202c;
            C3821i8 c3821i8K = interfaceC3945j8.k(abstractC5960z8.j());
            if (c3821i8K == null) {
                abstractC5960z8.d("cache-miss");
                if (!this.f31204e.c(abstractC5960z8)) {
                    this.f31201b.put(abstractC5960z8);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c3821i8K.a(jCurrentTimeMillis)) {
                    abstractC5960z8.d("cache-hit-expired");
                    abstractC5960z8.k(c3821i8K);
                    if (!this.f31204e.c(abstractC5960z8)) {
                        this.f31201b.put(abstractC5960z8);
                    }
                } else {
                    abstractC5960z8.d("cache-hit");
                    E8 e8S = abstractC5960z8.s(new C5456v8(c3821i8K.f29280a, c3821i8K.f29286g));
                    abstractC5960z8.d("cache-hit-parsed");
                    if (!e8S.c()) {
                        abstractC5960z8.d("cache-parsing-failed");
                        interfaceC3945j8.a(abstractC5960z8.j(), true);
                        abstractC5960z8.k(null);
                        if (!this.f31204e.c(abstractC5960z8)) {
                            this.f31201b.put(abstractC5960z8);
                        }
                    } else if (c3821i8K.f29285f < jCurrentTimeMillis) {
                        abstractC5960z8.d("cache-hit-refresh-needed");
                        abstractC5960z8.k(c3821i8K);
                        e8S.f18424d = true;
                        if (this.f31204e.c(abstractC5960z8)) {
                            this.f31205f.a(abstractC5960z8, e8S, null);
                        } else {
                            this.f31205f.a(abstractC5960z8, e8S, new RunnableC4071k8(this, abstractC5960z8));
                        }
                    } else {
                        this.f31205f.a(abstractC5960z8, e8S, null);
                    }
                }
            }
        } finally {
            abstractC5960z8.f(2);
        }
    }

    public final void a() {
        this.f31203d = true;
        interrupt();
    }

    final /* synthetic */ BlockingQueue b() {
        return this.f31201b;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f31199g) {
            K8.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f31202c.zzc();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f31203d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                K8.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
