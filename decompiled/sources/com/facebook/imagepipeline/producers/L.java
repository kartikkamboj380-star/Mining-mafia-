package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class L implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f14035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p013b2.i f14036b;

    class a extends m0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ U2.b f14037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g0 f14038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e0 f14039h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1260n interfaceC1260n, g0 g0Var, e0 e0Var, String str, U2.b bVar, g0 g0Var2, e0 e0Var2) {
            super(interfaceC1260n, g0Var, e0Var, str);
            this.f14037f = bVar;
            this.f14038g = g0Var2;
            this.f14039h = e0Var2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // W1.e
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(O2.j jVar) {
            O2.j.h(jVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // W1.e
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public O2.j c() {
            O2.j jVarD = L.this.d(this.f14037f);
            if (jVarD == null) {
                this.f14038g.b(this.f14039h, L.this.f(), false);
                this.f14039h.j("local", "fetch");
                return null;
            }
            jVarD.I0();
            this.f14038g.b(this.f14039h, L.this.f(), true);
            this.f14039h.j("local", "fetch");
            this.f14039h.v("image_color_space", jVarD.w());
            return jVarD;
        }
    }

    class b extends AbstractC1252f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f14041a;

        b(m0 m0Var) {
            this.f14041a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void b() {
            this.f14041a.a();
        }
    }

    protected L(Executor executor, p013b2.i iVar) {
        this.f14035a = executor;
        this.f14036b = iVar;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        g0 g0VarX = e0Var.x();
        U2.b bVarM = e0Var.M();
        e0Var.j("local", "fetch");
        a aVar = new a(interfaceC1260n, g0VarX, e0Var, f(), bVarM, g0VarX, e0Var);
        e0Var.c(new b(aVar));
        this.f14035a.execute(aVar);
    }

    protected O2.j c(InputStream inputStream, int i10) {
        p023c2.a aVarW = null;
        try {
            aVarW = i10 <= 0 ? p023c2.a.W(this.f14036b.a(inputStream)) : p023c2.a.W(this.f14036b.b(inputStream, i10));
            O2.j jVar = new O2.j(aVarW);
            Y1.b.b(inputStream);
            p023c2.a.x(aVarW);
            return jVar;
        } catch (Throwable th) {
            Y1.b.b(inputStream);
            p023c2.a.x(aVarW);
            throw th;
        }
    }

    protected abstract O2.j d(U2.b bVar);

    protected O2.j e(InputStream inputStream, int i10) {
        return c(inputStream, i10);
    }

    protected abstract String f();
}
