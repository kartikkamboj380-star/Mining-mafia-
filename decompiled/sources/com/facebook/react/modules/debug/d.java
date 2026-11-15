package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements NotThreadSafeBridgeIdleDebugListener, Q3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f14936a = new ArrayList(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f14937b = new ArrayList(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f14938c = new ArrayList(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f14939d = new ArrayList(20);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f14940e = true;

    private final boolean c(long j10, long j11) {
        long jE = e.e(this.f14936a, j10, j11);
        long jE2 = e.e(this.f14937b, j10, j11);
        if (jE == -1 && jE2 == -1) {
            return this.f14940e;
        }
        return jE > jE2;
    }

    @Override // Q3.a
    public synchronized void a() {
        this.f14939d.add(Long.valueOf(System.nanoTime()));
    }

    @Override // Q3.a
    public synchronized void b() {
        this.f14938c.add(Long.valueOf(System.nanoTime()));
    }

    public final synchronized boolean d(long j10, long j11) {
        boolean z9;
        try {
            boolean zF = e.f(this.f14939d, j10, j11);
            boolean zC = c(j10, j11);
            z9 = true;
            if (!zF && (!zC || e.f(this.f14938c, j10, j11))) {
                z9 = false;
            }
            e.d(this.f14936a, j11);
            e.d(this.f14937b, j11);
            e.d(this.f14938c, j11);
            e.d(this.f14939d, j11);
            this.f14940e = zC;
        } catch (Throwable th) {
            throw th;
        }
        return z9;
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onBridgeDestroyed() {
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeBusy() {
        this.f14937b.add(Long.valueOf(System.nanoTime()));
    }

    @Override // com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener
    public synchronized void onTransitionToBridgeIdle() {
        this.f14936a.add(Long.valueOf(System.nanoTime()));
    }
}
