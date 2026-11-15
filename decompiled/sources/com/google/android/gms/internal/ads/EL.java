package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class EL {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4739pR f18458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4739pR f18459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3218dL f18460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f18461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f18462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18463f;

    public EL(Object obj, Looper looper, Looper looper2, InterfaceC3471fM interfaceC3471fM, InterfaceC3218dL interfaceC3218dL) {
        this.f18458a = interfaceC3471fM.a(looper, null);
        this.f18459b = interfaceC3471fM.a(looper2, null);
        this.f18461d = obj;
        this.f18462e = obj;
        this.f18460c = interfaceC3218dL;
    }

    private final void g(Runnable runnable) {
        InterfaceC4739pR interfaceC4739pR = this.f18459b;
        if (interfaceC4739pR.zza().getThread().isAlive()) {
            interfaceC4739pR.g(runnable);
        }
    }

    private final void h(Object obj) {
        Object obj2 = this.f18461d;
        this.f18461d = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.f18460c.a(obj2, obj);
    }

    public final void a(InterfaceC1899Is0 interfaceC1899Is0, final InterfaceC1899Is0 interfaceC1899Is1) {
        AbstractC2418Ss0.i(Looper.myLooper() == this.f18459b.zza());
        this.f18463f++;
        c(new Runnable() { // from class: com.google.android.gms.internal.ads.CK
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17852a.d(interfaceC1899Is1);
            }
        });
        h(interfaceC1899Is0.apply(this.f18461d));
    }

    public final void b(final Object obj) {
        this.f18462e = obj;
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.AJ
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f17283a.e(obj);
            }
        });
    }

    public final void c(Runnable runnable) {
        InterfaceC4739pR interfaceC4739pR = this.f18458a;
        if (interfaceC4739pR.zza().getThread().isAlive()) {
            interfaceC4739pR.g(runnable);
        }
    }

    final /* synthetic */ void d(InterfaceC1899Is0 interfaceC1899Is0) {
        final Object objApply = interfaceC1899Is0.apply(this.f18462e);
        this.f18462e = objApply;
        g(new Runnable() { // from class: com.google.android.gms.internal.ads.bK
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f26790a.f(objApply);
            }
        });
    }

    final /* synthetic */ void e(Object obj) {
        if (this.f18463f == 0) {
            h(obj);
        }
    }

    final /* synthetic */ void f(Object obj) {
        int i10 = this.f18463f - 1;
        this.f18463f = i10;
        if (i10 == 0) {
            h(obj);
        }
    }
}
