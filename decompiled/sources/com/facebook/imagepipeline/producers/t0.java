package com.facebook.imagepipeline.producers;

/* JADX INFO: loaded from: classes.dex */
public class t0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u0[] f14262a;

    private class a extends AbstractC1265t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f14263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f14264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final I2.g f14265e;

        public a(InterfaceC1260n interfaceC1260n, e0 e0Var, int i10) {
            super(interfaceC1260n);
            this.f14263c = e0Var;
            this.f14264d = i10;
            this.f14265e = e0Var.M().r();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1265t, com.facebook.imagepipeline.producers.AbstractC1249c
        protected void g(Throwable th) {
            if (t0.this.e(this.f14264d + 1, o(), this.f14263c)) {
                return;
            }
            o().onFailure(th);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void h(O2.j jVar, int i10) {
            if (jVar != null && (AbstractC1249c.e(i10) || v0.c(jVar, this.f14265e))) {
                o().b(jVar, i10);
            } else if (AbstractC1249c.d(i10)) {
                O2.j.h(jVar);
                if (t0.this.e(this.f14264d + 1, o(), this.f14263c)) {
                    return;
                }
                o().b(null, 1);
            }
        }
    }

    public t0(u0... u0VarArr) {
        u0[] u0VarArr2 = (u0[]) Y1.k.g(u0VarArr);
        this.f14262a = u0VarArr2;
        Y1.k.e(0, u0VarArr2.length);
    }

    private int d(int i10, I2.g gVar) {
        while (true) {
            u0[] u0VarArr = this.f14262a;
            if (i10 >= u0VarArr.length) {
                return -1;
            }
            if (u0VarArr[i10].a(gVar)) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i10, InterfaceC1260n interfaceC1260n, e0 e0Var) {
        int iD = d(i10, e0Var.M().r());
        if (iD == -1) {
            return false;
        }
        this.f14262a[iD].b(new a(interfaceC1260n, e0Var, iD), e0Var);
        return true;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1260n interfaceC1260n, e0 e0Var) {
        if (e0Var.M().r() == null) {
            interfaceC1260n.b(null, 1);
        } else {
            if (e(0, interfaceC1260n, e0Var)) {
                return;
            }
            interfaceC1260n.b(null, 1);
        }
    }
}
