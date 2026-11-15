package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class F extends E implements Q2.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Q2.e f14003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q2.d f14004d;

    public F(Q2.e eVar, Q2.d dVar) {
        super(eVar, dVar);
        this.f14003c = eVar;
        this.f14004d = dVar;
    }

    @Override // Q2.d
    public void a(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Q2.e eVar = this.f14003c;
        if (eVar != null) {
            eVar.b(producerContext.M(), producerContext.a(), producerContext.getId(), producerContext.Q());
        }
        Q2.d dVar = this.f14004d;
        if (dVar != null) {
            dVar.a(producerContext);
        }
    }

    @Override // Q2.d
    public void e(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Q2.e eVar = this.f14003c;
        if (eVar != null) {
            eVar.f(producerContext.M(), producerContext.getId(), producerContext.Q());
        }
        Q2.d dVar = this.f14004d;
        if (dVar != null) {
            dVar.e(producerContext);
        }
    }

    @Override // Q2.d
    public void g(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Q2.e eVar = this.f14003c;
        if (eVar != null) {
            eVar.k(producerContext.getId());
        }
        Q2.d dVar = this.f14004d;
        if (dVar != null) {
            dVar.g(producerContext);
        }
    }

    @Override // Q2.d
    public void i(e0 producerContext, Throwable th) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Q2.e eVar = this.f14003c;
        if (eVar != null) {
            eVar.i(producerContext.M(), producerContext.getId(), th, producerContext.Q());
        }
        Q2.d dVar = this.f14004d;
        if (dVar != null) {
            dVar.i(producerContext, th);
        }
    }
}
