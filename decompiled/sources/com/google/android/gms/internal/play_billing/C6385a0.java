package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C6385a0 implements P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f37193a;

    private C6385a0(Z z9) {
        byte[] bArr = AbstractC6480y0.f37349d;
        this.f37193a = z9;
        z9.f37170a = this;
    }

    public static C6385a0 w(Z z9) {
        C6385a0 c6385a0 = z9.f37170a;
        return c6385a0 != null ? c6385a0 : new C6385a0(z9);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void a(int i10, int i11) {
        this.f37193a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void b(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f37193a.r(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += Z.x(((Long) list.get(i12)).longValue());
        }
        this.f37193a.q(iX);
        while (i11 < list.size()) {
            this.f37193a.s(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void c(int i10, String str) {
        this.f37193a.n(i10, str);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void d(int i10, Object obj, InterfaceC6410g1 interfaceC6410g1) {
        Z z9 = this.f37193a;
        z9.o(i10, 3);
        interfaceC6410g1.e((V0) obj, z9.f37170a);
        z9.o(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void e(int i10, int i11) {
        this.f37193a.g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void f(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6449q0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f37193a.p(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f37193a.o(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iW += Z.w(((Integer) list.get(i12)).intValue());
            }
            this.f37193a.q(iW);
            while (i11 < list.size()) {
                this.f37193a.q(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6449q0 c6449q0 = (C6449q0) list;
        if (!z9) {
            while (i11 < c6449q0.size()) {
                this.f37193a.p(i10, c6449q0.b(i11));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < c6449q0.size(); i13++) {
            iW2 += Z.w(c6449q0.b(i13));
        }
        this.f37193a.q(iW2);
        while (i11 < c6449q0.size()) {
            this.f37193a.q(c6449q0.b(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void g(int i10, Q q10) {
        this.f37193a.f(i10, q10);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void h(int i10, long j10) {
        this.f37193a.r(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void i(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6449q0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f37193a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f37193a.o(i10, 2);
            int iX = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iX += Z.x(((Integer) list.get(i12)).intValue());
            }
            this.f37193a.q(iX);
            while (i11 < list.size()) {
                this.f37193a.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6449q0 c6449q0 = (C6449q0) list;
        if (!z9) {
            while (i11 < c6449q0.size()) {
                this.f37193a.k(i10, c6449q0.b(i11));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int iX2 = 0;
        for (int i13 = 0; i13 < c6449q0.size(); i13++) {
            iX2 += Z.x(c6449q0.b(i13));
        }
        this.f37193a.q(iX2);
        while (i11 < c6449q0.size()) {
            this.f37193a.l(c6449q0.b(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void j(int i10, int i11) {
        this.f37193a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void k(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f37193a.i(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f37193a.q(i12);
        while (i11 < list.size()) {
            this.f37193a.j(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void l(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f37193a.g(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f37193a.q(i12);
        while (i11 < list.size()) {
            this.f37193a.h(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void m(int i10) {
        this.f37193a.o(i10, 3);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void n(int i10, int i11) {
        this.f37193a.p(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void o(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6449q0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f37193a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f37193a.o(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f37193a.q(i12);
            while (i11 < list.size()) {
                this.f37193a.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6449q0 c6449q0 = (C6449q0) list;
        if (!z9) {
            while (i11 < c6449q0.size()) {
                this.f37193a.g(i10, c6449q0.b(i11));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c6449q0.size(); i15++) {
            c6449q0.b(i15);
            i14 += 4;
        }
        this.f37193a.q(i14);
        while (i11 < c6449q0.size()) {
            this.f37193a.h(c6449q0.b(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void p(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6449q0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f37193a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f37193a.o(i10, 2);
            int iX = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iX += Z.x(((Integer) list.get(i12)).intValue());
            }
            this.f37193a.q(iX);
            while (i11 < list.size()) {
                this.f37193a.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6449q0 c6449q0 = (C6449q0) list;
        if (!z9) {
            while (i11 < c6449q0.size()) {
                this.f37193a.k(i10, c6449q0.b(i11));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int iX2 = 0;
        for (int i13 = 0; i13 < c6449q0.size(); i13++) {
            iX2 += Z.x(c6449q0.b(i13));
        }
        this.f37193a.q(iX2);
        while (i11 < c6449q0.size()) {
            this.f37193a.l(c6449q0.b(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void q(int i10, float f10) {
        this.f37193a.g(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void r(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f37193a.r(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += Z.x(((Long) list.get(i12)).longValue());
        }
        this.f37193a.q(iX);
        while (i11 < list.size()) {
            this.f37193a.s(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void s(int i10, Object obj, InterfaceC6410g1 interfaceC6410g1) {
        V0 v10 = (V0) obj;
        W w10 = (W) this.f37193a;
        w10.q((i10 << 3) | 2);
        w10.q(((AbstractC6483z) v10).a(interfaceC6410g1));
        interfaceC6410g1.e(v10, w10.f37170a);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void t(int i10, long j10) {
        this.f37193a.i(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void u(int i10, List list) {
        int i11 = 0;
        if (!(list instanceof E0)) {
            while (i11 < list.size()) {
                this.f37193a.n(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        E0 e10 = (E0) list;
        while (i11 < list.size()) {
            Object objN = e10.n(i11);
            if (objN instanceof String) {
                this.f37193a.n(i10, (String) objN);
            } else {
                this.f37193a.f(i10, (Q) objN);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void v(int i10, long j10) {
        this.f37193a.r(i10, j10);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void x(int i10) {
        this.f37193a.o(i10, 4);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzA(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f37193a.i(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f37193a.q(i12);
        while (i11 < list.size()) {
            this.f37193a.j(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzB(int i10, int i11) {
        this.f37193a.p(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzC(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6449q0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    Z z10 = this.f37193a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    z10.p(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f37193a.o(i10, 2);
            int iW = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iW += Z.w((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f37193a.q(iW);
            while (i11 < list.size()) {
                Z z11 = this.f37193a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                z11.q((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C6449q0 c6449q0 = (C6449q0) list;
        if (!z9) {
            while (i11 < c6449q0.size()) {
                Z z12 = this.f37193a;
                int iB = c6449q0.b(i11);
                z12.p(i10, (iB >> 31) ^ (iB + iB));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int iW2 = 0;
        for (int i13 = 0; i13 < c6449q0.size(); i13++) {
            int iB2 = c6449q0.b(i13);
            iW2 += Z.w((iB2 >> 31) ^ (iB2 + iB2));
        }
        this.f37193a.q(iW2);
        while (i11 < c6449q0.size()) {
            Z z13 = this.f37193a;
            int iB3 = c6449q0.b(i11);
            z13.q((iB3 >> 31) ^ (iB3 + iB3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzD(int i10, long j10) {
        this.f37193a.r(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzE(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                Z z10 = this.f37193a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                z10.r(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iX += Z.x((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f37193a.q(iX);
        while (i11 < list.size()) {
            Z z11 = this.f37193a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            z11.s((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzb(int i10, boolean z9) {
        this.f37193a.e(i10, z9);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzc(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f37193a.e(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        this.f37193a.q(i12);
        while (i11 < list.size()) {
            this.f37193a.d(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f37193a.f(i10, (Q) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzf(int i10, double d10) {
        this.f37193a.i(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzg(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f37193a.i(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f37193a.q(i12);
        while (i11 < list.size()) {
            this.f37193a.j(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzw(int i10, Object obj) {
        if (obj instanceof Q) {
            W w10 = (W) this.f37193a;
            w10.q(11);
            w10.p(2, i10);
            w10.f(3, (Q) obj);
            w10.q(12);
            return;
        }
        Z z9 = this.f37193a;
        V0 v10 = (V0) obj;
        W w11 = (W) z9;
        w11.q(11);
        w11.p(2, i10);
        w11.q(26);
        w11.q(v10.b());
        v10.d(z9);
        w11.q(12);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzx(int i10, int i11) {
        this.f37193a.g(i10, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzy(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6449q0)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f37193a.g(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f37193a.o(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f37193a.q(i12);
            while (i11 < list.size()) {
                this.f37193a.h(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6449q0 c6449q0 = (C6449q0) list;
        if (!z9) {
            while (i11 < c6449q0.size()) {
                this.f37193a.g(i10, c6449q0.b(i11));
                i11++;
            }
            return;
        }
        this.f37193a.o(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c6449q0.size(); i15++) {
            c6449q0.b(i15);
            i14 += 4;
        }
        this.f37193a.q(i14);
        while (i11 < c6449q0.size()) {
            this.f37193a.h(c6449q0.b(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.P1
    public final void zzz(int i10, long j10) {
        this.f37193a.i(i10, j10);
    }
}
