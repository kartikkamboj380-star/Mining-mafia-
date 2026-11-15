package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class AS0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC6001zS0 f17325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC5875yS0 f17326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC5270tf f17327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f17329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Looper f17330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17332h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f17333i;

    public AS0(InterfaceC5875yS0 interfaceC5875yS0, InterfaceC6001zS0 interfaceC6001zS0, AbstractC5270tf abstractC5270tf, int i10, InterfaceC3471fM interfaceC3471fM, Looper looper) {
        this.f17326b = interfaceC5875yS0;
        this.f17325a = interfaceC6001zS0;
        this.f17327c = abstractC5270tf;
        this.f17330f = looper;
        this.f17331g = i10;
    }

    public final InterfaceC6001zS0 a() {
        return this.f17325a;
    }

    public final AS0 b(int i10) {
        AbstractC2418Ss0.i(!this.f17332h);
        this.f17328d = i10;
        return this;
    }

    public final int c() {
        return this.f17328d;
    }

    public final AS0 d(Object obj) {
        AbstractC2418Ss0.i(!this.f17332h);
        this.f17329e = obj;
        return this;
    }

    public final Object e() {
        return this.f17329e;
    }

    public final Looper f() {
        return this.f17330f;
    }

    public final AS0 g() {
        AbstractC2418Ss0.i(!this.f17332h);
        this.f17332h = true;
        this.f17326b.d(this);
        return this;
    }

    public final synchronized boolean h() {
        return false;
    }

    public final synchronized void i(boolean z9) {
        this.f17333i = z9 | this.f17333i;
        notifyAll();
    }
}
