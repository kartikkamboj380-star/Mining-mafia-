package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1255i implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H2.x f14152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H2.k f14153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f14154c;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.i$a */
    class a extends AbstractC1265t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ S1.d f14155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f14156d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1260n interfaceC1260n, S1.d dVar, boolean z9) {
            super(interfaceC1260n);
            this.f14155c = dVar;
            this.f14156d = z9;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(p023c2.a aVar, int i10) {
            p023c2.a aVar2;
            try {
                if (V2.b.d()) {
                    V2.b.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean zD = AbstractC1249c.d(i10);
                if (aVar == null) {
                    if (zD) {
                        o().b(null, i10);
                    }
                    if (V2.b.d()) {
                        V2.b.b();
                        return;
                    }
                    return;
                }
                if (!((O2.d) aVar.G()).i1() && !AbstractC1249c.m(i10, 8)) {
                    if (!zD && (aVar2 = C1255i.this.f14152a.get(this.f14155c)) != null) {
                        try {
                            O2.o oVarM0 = ((O2.d) aVar.G()).M0();
                            O2.o oVarM1 = ((O2.d) aVar2.G()).M0();
                            if (oVarM1.a() || oVarM1.c() >= oVarM0.c()) {
                                o().b(aVar2, i10);
                                p023c2.a.x(aVar2);
                                if (V2.b.d()) {
                                    V2.b.b();
                                    return;
                                }
                                return;
                            }
                            p023c2.a.x(aVar2);
                        } catch (Throwable th) {
                            p023c2.a.x(aVar2);
                            throw th;
                        }
                    }
                    p023c2.a aVarE = this.f14156d ? C1255i.this.f14152a.e(this.f14155c, aVar) : null;
                    if (zD) {
                        try {
                            o().c(1.0f);
                        } catch (Throwable th2) {
                            p023c2.a.x(aVarE);
                            throw th2;
                        }
                    }
                    InterfaceC1260n interfaceC1260nO = o();
                    if (aVarE != null) {
                        aVar = aVarE;
                    }
                    interfaceC1260nO.b(aVar, i10);
                    p023c2.a.x(aVarE);
                    if (V2.b.d()) {
                        V2.b.b();
                        return;
                    }
                    return;
                }
                o().b(aVar, i10);
                if (V2.b.d()) {
                    V2.b.b();
                }
            } catch (Throwable th3) {
                if (V2.b.d()) {
                    V2.b.b();
                }
                throw th3;
            }
        }
    }

    public C1255i(H2.x xVar, H2.k kVar, d0 d0Var) {
        this.f14152a = xVar;
        this.f14153b = kVar;
        this.f14154c = d0Var;
    }

    private static void f(O2.k kVar, e0 e0Var) {
        e0Var.N(kVar.getExtras());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        boolean zD;
        try {
            if (V2.b.d()) {
                V2.b.a("BitmapMemoryCacheProducer#produceResults");
            }
            g0 g0VarX = e0Var.x();
            g0VarX.d(e0Var, e());
            S1.d dVarD = this.f14153b.d(e0Var.M(), e0Var.a());
            p023c2.a aVar = e0Var.M().y(1) ? this.f14152a.get(dVarD) : null;
            if (aVar != null) {
                f((O2.k) aVar.G(), e0Var);
                boolean zA = ((O2.d) aVar.G()).M0().a();
                if (zA) {
                    g0VarX.j(e0Var, e(), g0VarX.f(e0Var, e()) ? Y1.g.of("cached_value_found", "true") : null);
                    g0VarX.b(e0Var, e(), true);
                    e0Var.j("memory_bitmap", d());
                    interfaceC1260n.c(1.0f);
                }
                interfaceC1260n.b(aVar, AbstractC1249c.k(zA));
                aVar.close();
                if (zA) {
                    if (zD) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (e0Var.S().d() >= U2.b.c.BITMAP_MEMORY_CACHE.d()) {
                g0VarX.j(e0Var, e(), g0VarX.f(e0Var, e()) ? Y1.g.of("cached_value_found", "false") : null);
                g0VarX.b(e0Var, e(), false);
                e0Var.j("memory_bitmap", d());
                interfaceC1260n.b(null, 1);
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            InterfaceC1260n interfaceC1260nG = g(interfaceC1260n, dVarD, e0Var.M().y(2));
            g0VarX.j(e0Var, e(), g0VarX.f(e0Var, e()) ? Y1.g.of("cached_value_found", "false") : null);
            if (V2.b.d()) {
                V2.b.a("mInputProducer.produceResult");
            }
            this.f14154c.b(interfaceC1260nG, e0Var);
            if (V2.b.d()) {
                V2.b.b();
            }
        } finally {
            if (V2.b.d()) {
                V2.b.b();
            }
        }
    }

    protected String d() {
        return "pipe_bg";
    }

    protected String e() {
        return "BitmapMemoryCacheProducer";
    }

    protected InterfaceC1260n g(InterfaceC1260n interfaceC1260n, S1.d dVar, boolean z9) {
        return new a(interfaceC1260n, dVar, z9);
    }
}
