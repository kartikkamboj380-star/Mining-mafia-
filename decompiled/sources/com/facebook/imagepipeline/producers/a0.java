package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H2.x f14111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H2.k f14112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f14113c;

    public static class a extends AbstractC1265t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final S1.d f14114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f14115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final H2.x f14116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f14117f;

        public a(InterfaceC1260n interfaceC1260n, S1.d dVar, boolean z9, H2.x xVar, boolean z10) {
            super(interfaceC1260n);
            this.f14114c = dVar;
            this.f14115d = z9;
            this.f14116e = xVar;
            this.f14117f = z10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(p023c2.a aVar, int i10) {
            if (aVar == null) {
                if (AbstractC1249c.d(i10)) {
                    o().b(null, i10);
                }
            } else if (!AbstractC1249c.e(i10) || this.f14115d) {
                p023c2.a aVarE = this.f14117f ? this.f14116e.e(this.f14114c, aVar) : null;
                try {
                    o().c(1.0f);
                    InterfaceC1260n interfaceC1260nO = o();
                    if (aVarE != null) {
                        aVar = aVarE;
                    }
                    interfaceC1260nO.b(aVar, i10);
                } finally {
                    p023c2.a.x(aVarE);
                }
            }
        }
    }

    public a0(H2.x xVar, H2.k kVar, d0 d0Var) {
        this.f14111a = xVar;
        this.f14112b = kVar;
        this.f14113c = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        g0 g0VarX = e0Var.x();
        U2.b bVarM = e0Var.M();
        Object objA = e0Var.a();
        U2.d dVarL = bVarM.l();
        if (dVarL == null || dVarL.a() == null) {
            this.f14113c.b(interfaceC1260n, e0Var);
            return;
        }
        g0VarX.d(e0Var, c());
        S1.d dVarA = this.f14112b.a(bVarM, objA);
        p023c2.a aVar = e0Var.M().y(1) ? this.f14111a.get(dVarA) : null;
        if (aVar == null) {
            a aVar2 = new a(interfaceC1260n, dVarA, false, this.f14111a, e0Var.M().y(2));
            g0VarX.j(e0Var, c(), g0VarX.f(e0Var, c()) ? Y1.g.of("cached_value_found", "false") : null);
            this.f14113c.b(aVar2, e0Var);
        } else {
            g0VarX.j(e0Var, c(), g0VarX.f(e0Var, c()) ? Y1.g.of("cached_value_found", "true") : null);
            g0VarX.b(e0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            e0Var.j("memory_bitmap", "postprocessed");
            interfaceC1260n.c(1.0f);
            interfaceC1260n.b(aVar, 1);
            aVar.close();
        }
    }

    protected String c() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
