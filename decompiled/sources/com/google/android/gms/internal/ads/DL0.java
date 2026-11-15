package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class DL0 implements InterfaceC4732pN0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CL0 f18148a;

    private DL0(CL0 cl0) {
        AbstractC3346eM0.a(cl0, "output");
        this.f18148a = cl0;
        cl0.f17857a = this;
    }

    public static DL0 D(CL0 cl0) {
        Object obj = cl0.f17857a;
        return obj != null ? (DL0) obj : new DL0(cl0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void A(int i10, Object obj, PM0 pm0) {
        CL0 cl0 = this.f18148a;
        cl0.g(i10, 3);
        pm0.g((AbstractC3093cL0) obj, this);
        cl0.g(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void B(int i10, Object obj, PM0 pm0) {
        CL0 cl0 = this.f18148a;
        AbstractC3093cL0 abstractC3093cL0 = (AbstractC3093cL0) obj;
        cl0.g(i10, 2);
        cl0.v(abstractC3093cL0.l(pm0));
        pm0.g(abstractC3093cL0, this);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void C(int i10, C4730pM0 c4730pM0, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            cl0.v(C4856qM0.c(c4730pM0, entry.getKey(), entry.getValue()));
            C4856qM0.b(cl0, c4730pM0, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void a(int i10, int i11) {
        this.f18148a.h(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void b(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C4226lM0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    CL0 cl0 = this.f18148a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    cl0.k(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            CL0 cl1 = this.f18148a;
            cl1.g(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iC += CL0.c((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            cl1.v(iC);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                cl1.x((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C4226lM0 c4226lM0 = (C4226lM0) list;
        if (!z9) {
            while (i11 < c4226lM0.size()) {
                CL0 cl2 = this.f18148a;
                long jG = c4226lM0.G(i11);
                cl2.k(i10, (jG >> 63) ^ (jG + jG));
                i11++;
            }
            return;
        }
        CL0 cl3 = this.f18148a;
        cl3.g(i10, 2);
        int iC2 = 0;
        for (int i13 = 0; i13 < c4226lM0.size(); i13++) {
            long jG2 = c4226lM0.G(i13);
            iC2 += CL0.c((jG2 >> 63) ^ (jG2 + jG2));
        }
        cl3.v(iC2);
        while (i11 < c4226lM0.size()) {
            long jG3 = c4226lM0.G(i11);
            cl3.x((jG3 >> 63) ^ (jG3 + jG3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void c(int i10, long j10) {
        this.f18148a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void d(int i10, long j10) {
        this.f18148a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void e(int i10, int i11) {
        this.f18148a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void f(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C4226lM0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            cl0.v(i12);
            while (i11 < list.size()) {
                cl0.y(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4226lM0 c4226lM0 = (C4226lM0) list;
        if (!z9) {
            while (i11 < c4226lM0.size()) {
                this.f18148a.m(i10, c4226lM0.G(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c4226lM0.size(); i15++) {
            c4226lM0.G(i15);
            i14 += 8;
        }
        cl1.v(i14);
        while (i11 < c4226lM0.size()) {
            cl1.y(c4226lM0.G(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void g(int i10, int i11) {
        this.f18148a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void h(int i10, long j10) {
        this.f18148a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void i(int i10, long j10) {
        this.f18148a.k(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void j(int i10) {
        this.f18148a.g(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void k(int i10) {
        this.f18148a.g(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void l(int i10, String str) {
        this.f18148a.o(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void m(int i10, int i11) {
        this.f18148a.h(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void n(int i10, float f10) {
        this.f18148a.j(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void o(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C4226lM0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.k(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC += CL0.c(((Long) list.get(i12)).longValue());
            }
            cl0.v(iC);
            while (i11 < list.size()) {
                cl0.x(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4226lM0 c4226lM0 = (C4226lM0) list;
        if (!z9) {
            while (i11 < c4226lM0.size()) {
                this.f18148a.k(i10, c4226lM0.G(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int iC2 = 0;
        for (int i13 = 0; i13 < c4226lM0.size(); i13++) {
            iC2 += CL0.c(c4226lM0.G(i13));
        }
        cl1.v(iC2);
        while (i11 < c4226lM0.size()) {
            cl1.x(c4226lM0.G(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void p(int i10, long j10) {
        this.f18148a.k(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void q(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof VL0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.i(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iB += CL0.b(((Integer) list.get(i12)).intValue());
            }
            cl0.v(iB);
            while (i11 < list.size()) {
                cl0.v(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        VL0 vl0 = (VL0) list;
        if (!z9) {
            while (i11 < vl0.size()) {
                this.f18148a.i(i10, vl0.d(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < vl0.size(); i13++) {
            iB2 += CL0.b(vl0.d(i13));
        }
        cl1.v(iB2);
        while (i11 < vl0.size()) {
            cl1.v(vl0.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void r(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f18148a.j(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        CL0 cl0 = this.f18148a;
        cl0.g(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        cl0.v(i12);
        while (i11 < list.size()) {
            cl0.w(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void s(int i10, int i11) {
        this.f18148a.i(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void t(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f18148a.o(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void u(int i10, int i11) {
        this.f18148a.i(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void v(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof VL0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            cl0.v(i12);
            while (i11 < list.size()) {
                cl0.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        VL0 vl0 = (VL0) list;
        if (!z9) {
            while (i11 < vl0.size()) {
                this.f18148a.j(i10, vl0.d(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < vl0.size(); i15++) {
            vl0.d(i15);
            i14 += 4;
        }
        cl1.v(i14);
        while (i11 < vl0.size()) {
            cl1.w(vl0.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void w(int i10, boolean z9) {
        this.f18148a.n(i10, z9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void x(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof VL0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.h(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC += CL0.c(((Integer) list.get(i12)).intValue());
            }
            cl0.v(iC);
            while (i11 < list.size()) {
                cl0.u(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        VL0 vl0 = (VL0) list;
        if (!z9) {
            while (i11 < vl0.size()) {
                this.f18148a.h(i10, vl0.d(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int iC2 = 0;
        for (int i13 = 0; i13 < vl0.size(); i13++) {
            iC2 += CL0.c(vl0.d(i13));
        }
        cl1.v(iC2);
        while (i11 < vl0.size()) {
            cl1.u(vl0.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void y(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof VL0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.h(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC += CL0.c(((Integer) list.get(i12)).intValue());
            }
            cl0.v(iC);
            while (i11 < list.size()) {
                cl0.u(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        VL0 vl0 = (VL0) list;
        if (!z9) {
            while (i11 < vl0.size()) {
                this.f18148a.h(i10, vl0.d(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int iC2 = 0;
        for (int i13 = 0; i13 < vl0.size(); i13++) {
            iC2 += CL0.c(vl0.d(i13));
        }
        cl1.v(iC2);
        while (i11 < vl0.size()) {
            cl1.u(vl0.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void z(int i10, AbstractC5231tL0 abstractC5231tL0) {
        this.f18148a.p(i10, abstractC5231tL0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzA(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C4226lM0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            cl0.v(i12);
            while (i11 < list.size()) {
                cl0.y(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4226lM0 c4226lM0 = (C4226lM0) list;
        if (!z9) {
            while (i11 < c4226lM0.size()) {
                this.f18148a.m(i10, c4226lM0.G(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c4226lM0.size(); i15++) {
            c4226lM0.G(i15);
            i14 += 8;
        }
        cl1.v(i14);
        while (i11 < c4226lM0.size()) {
            cl1.y(c4226lM0.G(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzC(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f18148a.m(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        CL0 cl0 = this.f18148a;
        cl0.g(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        cl0.v(i12);
        while (i11 < list.size()) {
            cl0.y(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzE(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f18148a.n(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        CL0 cl0 = this.f18148a;
        cl0.g(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        cl0.v(i12);
        while (i11 < list.size()) {
            cl0.t(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzG(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f18148a.p(i10, (AbstractC5231tL0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzI(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof VL0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            cl0.v(i12);
            while (i11 < list.size()) {
                cl0.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        VL0 vl0 = (VL0) list;
        if (!z9) {
            while (i11 < vl0.size()) {
                this.f18148a.j(i10, vl0.d(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < vl0.size(); i15++) {
            vl0.d(i15);
            i14 += 4;
        }
        cl1.v(i14);
        while (i11 < vl0.size()) {
            cl1.w(vl0.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzK(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof VL0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    CL0 cl0 = this.f18148a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    cl0.i(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            CL0 cl1 = this.f18148a;
            cl1.g(i10, 2);
            int iB = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iB += CL0.b((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            cl1.v(iB);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                cl1.v((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        VL0 vl0 = (VL0) list;
        if (!z9) {
            while (i11 < vl0.size()) {
                CL0 cl2 = this.f18148a;
                int iD = vl0.d(i11);
                cl2.i(i10, (iD >> 31) ^ (iD + iD));
                i11++;
            }
            return;
        }
        CL0 cl3 = this.f18148a;
        cl3.g(i10, 2);
        int iB2 = 0;
        for (int i13 = 0; i13 < vl0.size(); i13++) {
            int iD2 = vl0.d(i13);
            iB2 += CL0.b((iD2 >> 31) ^ (iD2 + iD2));
        }
        cl3.v(iB2);
        while (i11 < vl0.size()) {
            int iD3 = vl0.d(i11);
            cl3.v((iD3 >> 31) ^ (iD3 + iD3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzf(int i10, double d10) {
        this.f18148a.m(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4732pN0
    public final void zzy(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C4226lM0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f18148a.k(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            CL0 cl0 = this.f18148a;
            cl0.g(i10, 2);
            int iC = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iC += CL0.c(((Long) list.get(i12)).longValue());
            }
            cl0.v(iC);
            while (i11 < list.size()) {
                cl0.x(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C4226lM0 c4226lM0 = (C4226lM0) list;
        if (!z9) {
            while (i11 < c4226lM0.size()) {
                this.f18148a.k(i10, c4226lM0.G(i11));
                i11++;
            }
            return;
        }
        CL0 cl1 = this.f18148a;
        cl1.g(i10, 2);
        int iC2 = 0;
        for (int i13 = 0; i13 < c4226lM0.size(); i13++) {
            iC2 += CL0.c(c4226lM0.G(i13));
        }
        cl1.v(iC2);
        while (i11 < c4226lM0.size()) {
            cl1.x(c4226lM0.G(i11));
            i11++;
        }
    }
}
