package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class n0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14204a;

    class a extends AbstractC1265t {
        a(InterfaceC1260n interfaceC1260n) {
            super(interfaceC1260n);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        protected void h(Object obj, int i10) {
            if (AbstractC1249c.d(i10)) {
                o().b(null, i10);
            }
        }
    }

    public n0(d0 d0Var) {
        this.f14204a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        this.f14204a.b(new a(interfaceC1260n), e0Var);
    }
}
