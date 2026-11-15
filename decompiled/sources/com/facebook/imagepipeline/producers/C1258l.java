package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1258l implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d0 f14197b;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.l$a */
    private class a extends AbstractC1265t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e0 f14198c;

        @Override // com.facebook.imagepipeline.producers.AbstractC1265t, com.facebook.imagepipeline.producers.AbstractC1249c
        protected void g(Throwable th) {
            C1258l.this.f14197b.b(o(), this.f14198c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(O2.j jVar, int i10) {
            U2.b bVarM = this.f14198c.M();
            boolean zD = AbstractC1249c.d(i10);
            boolean zC = v0.c(jVar, bVarM.r());
            if (jVar != null && (zC || bVarM.j())) {
                if (zD && zC) {
                    o().b(jVar, i10);
                } else {
                    o().b(jVar, AbstractC1249c.n(i10, 1));
                }
            }
            if (!zD || zC || bVarM.i()) {
                return;
            }
            O2.j.h(jVar);
            C1258l.this.f14197b.b(o(), this.f14198c);
        }

        private a(InterfaceC1260n interfaceC1260n, e0 e0Var) {
            super(interfaceC1260n);
            this.f14198c = e0Var;
        }
    }

    public C1258l(d0 d0Var, d0 d0Var2) {
        this.f14196a = d0Var;
        this.f14197b = d0Var2;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        this.f14196a.b(new a(interfaceC1260n, e0Var), e0Var);
    }
}
