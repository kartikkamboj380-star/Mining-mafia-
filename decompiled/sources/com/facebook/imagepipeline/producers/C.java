package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1260n f13982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f13983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f13984c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private I2.b f13986e;

    public C(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        this.f13982a = interfaceC1260n;
        this.f13983b = e0Var;
    }

    public InterfaceC1260n a() {
        return this.f13982a;
    }

    public e0 b() {
        return this.f13983b;
    }

    public long c() {
        return this.f13984c;
    }

    public g0 d() {
        return this.f13983b.x();
    }

    public int e() {
        return this.f13985d;
    }

    public I2.b f() {
        return this.f13986e;
    }

    public Uri g() {
        return this.f13983b.M().v();
    }

    public void h(long j10) {
        this.f13984c = j10;
    }

    public void i(int i10) {
        this.f13985d = i10;
    }

    public void j(I2.b bVar) {
        this.f13986e = bVar;
    }
}
