package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5023rh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f33000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f33001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f33002c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractAsyncTaskC4898qh0 f33003d = null;

    public C5023rh0() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f33000a = linkedBlockingQueue;
        this.f33001b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private final void c() {
        AbstractAsyncTaskC4898qh0 abstractAsyncTaskC4898qh0 = (AbstractAsyncTaskC4898qh0) this.f33002c.poll();
        this.f33003d = abstractAsyncTaskC4898qh0;
        if (abstractAsyncTaskC4898qh0 != null) {
            abstractAsyncTaskC4898qh0.executeOnExecutor(this.f33001b, new Object[0]);
        }
    }

    public final void a(AbstractAsyncTaskC4898qh0 abstractAsyncTaskC4898qh0) {
        abstractAsyncTaskC4898qh0.b(this);
        this.f33002c.add(abstractAsyncTaskC4898qh0);
        if (this.f33003d == null) {
            c();
        }
    }

    public final void b(AbstractAsyncTaskC4898qh0 abstractAsyncTaskC4898qh0) {
        this.f33003d = null;
        c();
    }
}
