package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14166a;

    private final class a extends AbstractC1265t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f14167c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j0 j0Var, InterfaceC1260n consumer) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            this.f14167c = j0Var;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(O2.j jVar, int i10) {
            p023c2.a aVarN = null;
            try {
                if (O2.j.a0(jVar) && jVar != null) {
                    aVarN = jVar.n();
                }
                o().b(aVarN, i10);
            } finally {
                p023c2.a.x(aVarN);
            }
        }
    }

    public j0(d0 inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        this.f14166a = inputProducer;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n consumer, e0 context) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14166a.b(new a(this, consumer), context);
    }
}
