package com.facebook.imagepipeline.producers;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1247a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f14110a;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.a$a, reason: collision with other inner class name */
    private static class C0326a extends AbstractC1265t {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(O2.j jVar, int i10) {
            if (jVar == null) {
                o().b(null, i10);
                return;
            }
            if (!O2.j.W(jVar)) {
                jVar.I0();
            }
            o().b(jVar, i10);
        }

        private C0326a(InterfaceC1260n interfaceC1260n) {
            super(interfaceC1260n);
        }
    }

    public C1247a(d0 d0Var) {
        this.f14110a = d0Var;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        this.f14110a.b(new C0326a(interfaceC1260n), e0Var);
    }
}
