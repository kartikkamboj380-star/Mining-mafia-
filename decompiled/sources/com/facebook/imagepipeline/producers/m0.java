package com.facebook.imagepipeline.producers;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends W1.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1260n f14200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g0 f14201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e0 f14202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14203e;

    public m0(InterfaceC1260n consumer, g0 producerListener, e0 producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(producerListener, "producerListener");
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        this.f14200b = consumer;
        this.f14201c = producerListener;
        this.f14202d = producerContext;
        this.f14203e = producerName;
        producerListener.d(producerContext, producerName);
    }

    @Override // W1.e
    protected void d() {
        g0 g0Var = this.f14201c;
        e0 e0Var = this.f14202d;
        String str = this.f14203e;
        g0Var.c(e0Var, str, g0Var.f(e0Var, str) ? g() : null);
        this.f14200b.a();
    }

    @Override // W1.e
    protected void e(Exception e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        g0 g0Var = this.f14201c;
        e0 e0Var = this.f14202d;
        String str = this.f14203e;
        g0Var.k(e0Var, str, e10, g0Var.f(e0Var, str) ? h(e10) : null);
        this.f14200b.onFailure(e10);
    }

    @Override // W1.e
    protected void f(Object obj) {
        g0 g0Var = this.f14201c;
        e0 e0Var = this.f14202d;
        String str = this.f14203e;
        g0Var.j(e0Var, str, g0Var.f(e0Var, str) ? i(obj) : null);
        this.f14200b.b(obj, 1);
    }

    protected Map g() {
        return null;
    }

    protected Map h(Exception exc) {
        return null;
    }

    protected Map i(Object obj) {
        return null;
    }
}
