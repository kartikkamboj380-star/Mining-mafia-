package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4306m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f31405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C5817y0 f31406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1472An f31407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31408d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f31411g = 15000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C5943z0 f31412h = new C5943z0(1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InterfaceC3471fM f31409e = InterfaceC3471fM.f28270a;

    public C4306m0(Context context, C5817y0 c5817y0) {
        this.f31405a = context.getApplicationContext();
        this.f31406b = c5817y0;
    }

    public final C4306m0 a(boolean z9) {
        this.f31408d = true;
        return this;
    }

    public final C4306m0 b(InterfaceC3471fM interfaceC3471fM) {
        this.f31409e = interfaceC3471fM;
        return this;
    }

    public final C4306m0 c(long j10) {
        this.f31411g = j10;
        return this;
    }

    public final C5313u0 d() {
        AbstractC2418Ss0.i(!this.f31410f);
        if (this.f31407c == null) {
            this.f31407c = new C5061s0(false);
        }
        C5313u0 c5313u0 = new C5313u0(this, null);
        this.f31410f = true;
        return c5313u0;
    }

    final /* synthetic */ Context e() {
        return this.f31405a;
    }

    final /* synthetic */ C5817y0 f() {
        return this.f31406b;
    }

    final /* synthetic */ InterfaceC1472An g() {
        return this.f31407c;
    }

    final /* synthetic */ boolean h() {
        return this.f31408d;
    }

    final /* synthetic */ InterfaceC3471fM i() {
        return this.f31409e;
    }

    final /* synthetic */ long j() {
        return this.f31411g;
    }

    final /* synthetic */ C5943z0 k() {
        return this.f31412h;
    }
}
