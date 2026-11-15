package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicLong f13396d = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    d f13397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IN f13398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    OUT f13399c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f13400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f13401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f13402g;

    public abstract Object a(b<OUT> bVar, IN in);

    protected void a(Object... objArr) {
    }

    public final long b() {
        return this.f13402g;
    }

    final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f13400e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f13401f, this);
    }

    final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f13400e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f13401f, this);
    }

    final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f13400e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f13401f, this);
    }

    public final OUT f() {
        return this.f13399c;
    }

    final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f13401f = new m(bVar);
        this.f13397a = dVar;
        this.f13398b = in;
        this.f13400e = aVar;
        if (dVar != null) {
            this.f13402g = dVar.f13402g;
        } else {
            long andIncrement = f13396d.getAndIncrement();
            this.f13402g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    final void b(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f13400e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f13401f, this, th);
    }

    final void c(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f13400e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f13401f, this, th);
    }

    protected final void d(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f13400e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f13401f, this, th);
    }
}
