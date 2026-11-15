package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1270y extends U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H2.k f14284f;

    public C1270y(H2.k kVar, boolean z9, d0 d0Var) {
        super(d0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt", z9);
        this.f14284f = kVar;
    }

    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public O2.j g(O2.j jVar) {
        return O2.j.c(jVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.producers.U
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Pair j(e0 e0Var) {
        return Pair.create(this.f14284f.c(e0Var.M(), e0Var.a()), e0Var.S());
    }
}
