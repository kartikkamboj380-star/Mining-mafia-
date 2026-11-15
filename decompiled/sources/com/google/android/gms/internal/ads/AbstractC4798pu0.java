package com.google.android.gms.internal.ads;

import java.util.Queue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4798pu0 extends AbstractC4420mu0 implements Queue {
    protected AbstractC4798pu0() {
    }

    @Override // java.util.Queue
    public final Object element() {
        return j().element();
    }

    protected abstract Queue j();

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return j().offer(obj);
    }

    @Override // java.util.Queue
    public final Object peek() {
        return j().peek();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return j().poll();
    }

    @Override // java.util.Queue
    public final Object remove() {
        return j().remove();
    }
}
