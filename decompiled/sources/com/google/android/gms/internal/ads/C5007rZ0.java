package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5007rZ0 extends C01 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f32979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C2337Re f32980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C4891qe f32981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C4756pZ0 f32982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C4630oZ0 f32983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f32984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f32986s;

    public C5007rZ0(InterfaceC5889yZ0 interfaceC5889yZ0, boolean z9) {
        boolean z10;
        super(interfaceC5889yZ0);
        if (z9) {
            interfaceC5889yZ0.D();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32979l = z10;
        this.f32980m = new C2337Re();
        this.f32981n = new C4891qe();
        interfaceC5889yZ0.w();
        this.f32982o = C4756pZ0.p(interfaceC5889yZ0.F());
    }

    private final Object K(Object obj) {
        return (this.f32982o.s() == null || !obj.equals(C4756pZ0.f32425e)) ? obj : this.f32982o.s();
    }

    private final boolean L(long j10) {
        C4630oZ0 c4630oZ0 = this.f32983p;
        int iE = this.f32982o.e(c4630oZ0.f32108a.f34594a);
        if (iE == -1) {
            return false;
        }
        C4756pZ0 c4756pZ0 = this.f32982o;
        C4891qe c4891qe = this.f32981n;
        c4756pZ0.d(iE, c4891qe, false);
        long j11 = c4891qe.f32698d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        c4630oZ0.f(j10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.C01
    public final void G() {
        if (this.f32979l) {
            return;
        }
        this.f32984q = true;
        A(null, this.f17768k);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Override // com.google.android.gms.internal.ads.C01
    protected final void H(AbstractC5270tf abstractC5270tf) {
        long jB;
        C5637wZ0 c5637wZ0A = null;
        if (this.f32985r) {
            this.f32982o = this.f32982o.r(abstractC5270tf);
            C4630oZ0 c4630oZ0 = this.f32983p;
            if (c4630oZ0 != null) {
                L(c4630oZ0.j());
            }
        } else if (abstractC5270tf.g()) {
            this.f32982o = this.f32986s ? this.f32982o.r(abstractC5270tf) : C4756pZ0.q(abstractC5270tf, C2337Re.f22865o, C4756pZ0.f32425e);
        } else {
            C2337Re c2337Re = this.f32980m;
            abstractC5270tf.b(0, c2337Re, 0L);
            Object obj = c2337Re.f22867a;
            C4630oZ0 c4630oZ1 = this.f32983p;
            if (c4630oZ1 != null) {
                jB = c4630oZ1.b();
                this.f32982o.o(c4630oZ1.f32108a.f34594a, this.f32981n);
                this.f32982o.b(0, c2337Re, 0L);
                if (jB == 0) {
                    jB = 0;
                }
            } else {
                jB = 0;
            }
            Pair pairM = abstractC5270tf.m(c2337Re, this.f32981n, 0, jB);
            Object obj2 = pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            this.f32982o = this.f32986s ? this.f32982o.r(abstractC5270tf) : C4756pZ0.q(abstractC5270tf, obj, obj2);
            C4630oZ0 c4630oZ2 = this.f32983p;
            if (c4630oZ2 != null && L(jLongValue)) {
                C5637wZ0 c5637wZ0 = c4630oZ2.f32108a;
                c5637wZ0A = c5637wZ0.a(K(c5637wZ0.f34594a));
            }
        }
        this.f32986s = true;
        this.f32985r = true;
        r(this.f32982o);
        if (c5637wZ0A != null) {
            C4630oZ0 c4630oZ3 = this.f32983p;
            c4630oZ3.getClass();
            c4630oZ3.o(c5637wZ0A);
        }
    }

    @Override // com.google.android.gms.internal.ads.C01
    protected final C5637wZ0 I(C5637wZ0 c5637wZ0) {
        Object objS = this.f32982o.s();
        Object obj = c5637wZ0.f34594a;
        if (objS != null && this.f32982o.s().equals(obj)) {
            obj = C4756pZ0.f32425e;
        }
        return c5637wZ0.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final C4630oZ0 f(C5637wZ0 c5637wZ0, InterfaceC4683p interfaceC4683p, long j10) {
        C4630oZ0 c4630oZ0 = new C4630oZ0(c5637wZ0, interfaceC4683p, j10);
        c4630oZ0.n(this.f17768k);
        if (this.f32985r) {
            c4630oZ0.o(c5637wZ0.a(K(c5637wZ0.f34594a)));
            return c4630oZ0;
        }
        this.f32983p = c4630oZ0;
        if (!this.f32984q) {
            this.f32984q = true;
            A(null, this.f17768k);
        }
        return c4630oZ0;
    }

    public final AbstractC5270tf M() {
        return this.f32982o;
    }

    @Override // com.google.android.gms.internal.ads.C01, com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void j(InterfaceC5385uZ0 interfaceC5385uZ0) {
        ((C4630oZ0) interfaceC5385uZ0).p();
        if (interfaceC5385uZ0 == this.f32983p) {
            this.f32983p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5889yZ0
    public final void k(C4819q4 c4819q4) {
        if (this.f32986s) {
            this.f32982o = this.f32982o.r(new C5819y01(this.f32982o.f30485b, c4819q4));
        } else {
            this.f32982o = C4756pZ0.p(c4819q4);
        }
        this.f17768k.k(c4819q4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3247dZ0, com.google.android.gms.internal.ads.VY0
    public final void q() {
        this.f32985r = false;
        this.f32984q = false;
        super.q();
    }
}
