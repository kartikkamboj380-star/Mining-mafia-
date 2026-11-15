package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2748Zb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Deque f26243a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Callable f26244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f26245c;

    public C2748Zb0(Callable callable, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f26244b = callable;
        this.f26245c = interfaceExecutorServiceC1805Gx0;
    }

    public final synchronized void a(int i10) {
        Deque deque = this.f26243a;
        int size = i10 - deque.size();
        for (int i11 = 0; i11 < size; i11++) {
            deque.add(this.f26245c.e0(this.f26244b));
        }
    }

    public final synchronized com.google.common.util.concurrent.p b() {
        a(1);
        return (com.google.common.util.concurrent.p) this.f26243a.poll();
    }

    public final synchronized void c(com.google.common.util.concurrent.p pVar) {
        this.f26243a.addFirst(pVar);
    }
}
