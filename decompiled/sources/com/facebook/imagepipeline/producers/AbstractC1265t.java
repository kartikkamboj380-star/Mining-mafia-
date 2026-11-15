package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1265t extends AbstractC1249c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1260n f14261b;

    public AbstractC1265t(InterfaceC1260n consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f14261b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1249c
    protected void f() {
        this.f14261b.a();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1249c
    protected void g(Throwable t10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        this.f14261b.onFailure(t10);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC1249c
    protected void i(float f10) {
        this.f14261b.c(f10);
    }

    public final InterfaceC1260n o() {
        return this.f14261b;
    }
}
