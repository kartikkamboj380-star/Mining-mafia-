package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class X implements InterfaceC3303e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5817y0 f25035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5943z0 f25036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N0 f25037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f25038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Surface f25039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JY0 f25040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f25041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC2927b1 f25042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Executor f25043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private InterfaceC5439v0 f25044j;

    public X(C5817y0 c5817y0, C5943z0 c5943z0, InterfaceC3471fM interfaceC3471fM) {
        this.f25035a = c5817y0;
        this.f25036b = c5943z0;
        c5817y0.g(interfaceC3471fM);
        this.f25037c = new N0(new W(this, null), c5817y0, c5943z0);
        this.f25038d = new ArrayDeque();
        this.f25040f = new C5507vX0().m();
        this.f25041g = -9223372036854775807L;
        this.f25042h = InterfaceC2927b1.f26693a;
        this.f25043i = S.f23098a;
        this.f25044j = P.f21992a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void Q(boolean z9) {
        this.f25035a.j(z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final boolean U(boolean z9) {
        return this.f25035a.i(z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void Z(boolean z9) {
        if (z9) {
            this.f25035a.l();
        }
        this.f25036b.d();
        this.f25037c.a();
        this.f25038d.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void a() {
        this.f25039e = null;
        this.f25035a.d(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final boolean c(JY0 jy0) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final boolean d() {
        return this.f25037c.g();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void e(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final boolean f(long j10, InterfaceC3052c1 interfaceC3052c1) {
        this.f25038d.add(interfaceC3052c1);
        this.f25037c.e(j10);
        this.f25043i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Q
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f22265a.t();
            }
        });
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void g() {
        this.f25035a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void h(InterfaceC2927b1 interfaceC2927b1, Executor executor) {
        this.f25042h = interfaceC2927b1;
        this.f25043i = executor;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void i(long j10, long j11) throws C3178d1 {
        try {
            this.f25037c.b(j10, j11);
        } catch (LQ0 e10) {
            throw new C3178d1(e10, this.f25040f);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void j(Surface surface, C4816q20 c4816q20) {
        this.f25039e = surface;
        this.f25035a.d(surface);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void k(int i10, JY0 jy0, long j10, int i11, List list) {
        AbstractC2418Ss0.i(list.isEmpty());
        int i12 = jy0.f19936v;
        JY0 jy1 = this.f25040f;
        if (i12 != jy1.f19936v || jy0.f19937w != jy1.f19937w) {
            this.f25037c.c(i12, jy0.f19937w);
        }
        float f10 = jy0.f19940z;
        if (f10 != this.f25040f.f19940z) {
            this.f25035a.e(f10);
        }
        this.f25040f = jy0;
        if (j10 != this.f25041g) {
            this.f25037c.d(i11, j10);
            this.f25041g = j10;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void l(float f10) {
        this.f25035a.n(f10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void m(InterfaceC5439v0 interfaceC5439v0) {
        this.f25044j = interfaceC5439v0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void n(int i10) {
        this.f25035a.m(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    final /* synthetic */ Surface p() {
        return this.f25039e;
    }

    final /* synthetic */ InterfaceC2927b1 q() {
        return this.f25042h;
    }

    final /* synthetic */ Executor r() {
        return this.f25043i;
    }

    final /* synthetic */ InterfaceC5439v0 s() {
        return this.f25044j;
    }

    final /* synthetic */ void t() {
        this.f25042h.zza();
    }

    final /* synthetic */ Queue u() {
        return this.f25038d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void zza() {
        this.f25036b.d();
        this.f25035a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void zzb() {
        this.f25036b.d();
        this.f25035a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final void zzi() {
        this.f25037c.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3303e1
    public final Surface zzk() {
        Surface surface = this.f25039e;
        surface.getClass();
        return surface;
    }
}
