package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class Q4 implements InterfaceC6287o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P4 f36472a;

    private Q4(P4 p10) {
        byte[] bArr = AbstractC6268m5.f36752b;
        this.f36472a = p10;
        p10.f36458a = this;
    }

    public static Q4 D(P4 p10) {
        Q4 q10 = p10.f36458a;
        return q10 != null ? q10 : new Q4(p10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void A(int i10, Object obj, Q5 q10) {
        this.f36472a.t(i10, (F5) obj, q10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void B(int i10, Object obj, Q5 q10) {
        P4 p10 = this.f36472a;
        p10.i(i10, 3);
        q10.h((F5) obj, p10.f36458a);
        p10.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void C(int i10, K4 k10) {
        this.f36472a.q(i10, k10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void a(int i10, int i11) {
        this.f36472a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void b(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6330t5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    P4 p10 = this.f36472a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    p10.m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            P4 p11 = this.f36472a;
            p11.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += P4.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            p11.x(iA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                p11.z((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        if (!z9) {
            while (i11 < c6330t5.size()) {
                P4 p12 = this.f36472a;
                long jG = c6330t5.G(i11);
                p12.m(i10, (jG >> 63) ^ (jG + jG));
                i11++;
            }
            return;
        }
        P4 p13 = this.f36472a;
        p13.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c6330t5.size(); i13++) {
            long jG2 = c6330t5.G(i13);
            iA2 += P4.a((jG2 >> 63) ^ (jG2 + jG2));
        }
        p13.x(iA2);
        while (i11 < c6330t5.size()) {
            long jG3 = c6330t5.G(i11);
            p13.z((jG3 >> 63) ^ (jG3 + jG3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void c(int i10, long j10) {
        this.f36472a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void d(int i10, long j10) {
        this.f36472a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void e(int i10, int i11) {
        this.f36472a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void f(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6330t5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            p10.x(i12);
            while (i11 < list.size()) {
                p10.A(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        if (!z9) {
            while (i11 < c6330t5.size()) {
                this.f36472a.n(i10, c6330t5.G(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c6330t5.size(); i15++) {
            c6330t5.G(i15);
            i14 += 8;
        }
        p11.x(i14);
        while (i11 < c6330t5.size()) {
            p11.A(c6330t5.G(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void g(int i10, int i11) {
        this.f36472a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void h(int i10, long j10) {
        this.f36472a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void i(int i10, long j10) {
        this.f36472a.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void j(int i10) {
        this.f36472a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void k(int i10) {
        this.f36472a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void l(int i10, String str) {
        this.f36472a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void m(int i10, int i11) {
        this.f36472a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void n(int i10, float f10) {
        this.f36472a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void o(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6330t5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += P4.a(((Long) list.get(i12)).longValue());
            }
            p10.x(iA);
            while (i11 < list.size()) {
                p10.z(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        if (!z9) {
            while (i11 < c6330t5.size()) {
                this.f36472a.m(i10, c6330t5.G(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c6330t5.size(); i13++) {
            iA2 += P4.a(c6330t5.G(i13));
        }
        p11.x(iA2);
        while (i11 < c6330t5.size()) {
            p11.z(c6330t5.G(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void p(int i10, long j10) {
        this.f36472a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void q(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6214g5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += P4.E(((Integer) list.get(i12)).intValue());
            }
            p10.x(iE);
            while (i11 < list.size()) {
                p10.x(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        if (!z9) {
            while (i11 < c6214g5.size()) {
                this.f36472a.k(i10, c6214g5.d(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c6214g5.size(); i13++) {
            iE2 += P4.E(c6214g5.d(i13));
        }
        p11.x(iE2);
        while (i11 < c6214g5.size()) {
            p11.x(c6214g5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void r(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f36472a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        P4 p10 = this.f36472a;
        p10.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        p10.x(i12);
        while (i11 < list.size()) {
            p10.y(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void s(int i10, int i11) {
        this.f36472a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void t(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f36472a.p(i10, (String) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void u(int i10, int i11) {
        this.f36472a.k(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void v(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6214g5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            p10.x(i12);
            while (i11 < list.size()) {
                p10.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        if (!z9) {
            while (i11 < c6214g5.size()) {
                this.f36472a.l(i10, c6214g5.d(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c6214g5.size(); i15++) {
            c6214g5.d(i15);
            i14 += 4;
        }
        p11.x(i14);
        while (i11 < c6214g5.size()) {
            p11.y(c6214g5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void w(int i10, boolean z9) {
        this.f36472a.o(i10, z9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void x(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6214g5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += P4.a(((Integer) list.get(i12)).intValue());
            }
            p10.x(iA);
            while (i11 < list.size()) {
                p10.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        if (!z9) {
            while (i11 < c6214g5.size()) {
                this.f36472a.j(i10, c6214g5.d(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c6214g5.size(); i13++) {
            iA2 += P4.a(c6214g5.d(i13));
        }
        p11.x(iA2);
        while (i11 < c6214g5.size()) {
            p11.w(c6214g5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void y(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6214g5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += P4.a(((Integer) list.get(i12)).intValue());
            }
            p10.x(iA);
            while (i11 < list.size()) {
                p10.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        if (!z9) {
            while (i11 < c6214g5.size()) {
                this.f36472a.j(i10, c6214g5.d(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c6214g5.size(); i13++) {
            iA2 += P4.a(c6214g5.d(i13));
        }
        p11.x(iA2);
        while (i11 < c6214g5.size()) {
            p11.w(c6214g5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void z(int i10, C6366x5 c6366x5, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            p10.x(C6374y5.c(c6366x5, entry.getKey(), entry.getValue()));
            C6374y5.b(p10, c6366x5, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzA(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6330t5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            p10.x(i12);
            while (i11 < list.size()) {
                p10.A(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        if (!z9) {
            while (i11 < c6330t5.size()) {
                this.f36472a.n(i10, c6330t5.G(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c6330t5.size(); i15++) {
            c6330t5.G(i15);
            i14 += 8;
        }
        p11.x(i14);
        while (i11 < c6330t5.size()) {
            p11.A(c6330t5.G(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzC(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f36472a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        P4 p10 = this.f36472a;
        p10.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        p10.x(i12);
        while (i11 < list.size()) {
            p10.A(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
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
    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzE(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f36472a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        P4 p10 = this.f36472a;
        p10.i(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        p10.x(i12);
        while (i11 < list.size()) {
            p10.v(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzG(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f36472a.q(i10, (K4) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzI(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6214g5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            p10.x(i12);
            while (i11 < list.size()) {
                p10.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        if (!z9) {
            while (i11 < c6214g5.size()) {
                this.f36472a.l(i10, c6214g5.d(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c6214g5.size(); i15++) {
            c6214g5.d(i15);
            i14 += 4;
        }
        p11.x(i14);
        while (i11 < c6214g5.size()) {
            p11.y(c6214g5.d(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzK(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6214g5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    P4 p10 = this.f36472a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    p10.k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            P4 p11 = this.f36472a;
            p11.i(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iE += P4.E((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            p11.x(iE);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                p11.x((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C6214g5 c6214g5 = (C6214g5) list;
        if (!z9) {
            while (i11 < c6214g5.size()) {
                P4 p12 = this.f36472a;
                int iD = c6214g5.d(i11);
                p12.k(i10, (iD >> 31) ^ (iD + iD));
                i11++;
            }
            return;
        }
        P4 p13 = this.f36472a;
        p13.i(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c6214g5.size(); i13++) {
            int iD2 = c6214g5.d(i13);
            iE2 += P4.E((iD2 >> 31) ^ (iD2 + iD2));
        }
        p13.x(iE2);
        while (i11 < c6214g5.size()) {
            int iD3 = c6214g5.d(i11);
            p13.x((iD3 >> 31) ^ (iD3 + iD3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzf(int i10, double d10) {
        this.f36472a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC6287o6
    public final void zzy(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!(list instanceof C6330t5)) {
            if (!z9) {
                while (i11 < list.size()) {
                    this.f36472a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            P4 p10 = this.f36472a;
            p10.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += P4.a(((Long) list.get(i12)).longValue());
            }
            p10.x(iA);
            while (i11 < list.size()) {
                p10.z(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C6330t5 c6330t5 = (C6330t5) list;
        if (!z9) {
            while (i11 < c6330t5.size()) {
                this.f36472a.m(i10, c6330t5.G(i11));
                i11++;
            }
            return;
        }
        P4 p11 = this.f36472a;
        p11.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c6330t5.size(); i13++) {
            iA2 += P4.a(c6330t5.G(i13));
        }
        p11.x(iA2);
        while (i11 < c6330t5.size()) {
            p11.z(c6330t5.G(i11));
            i11++;
        }
    }
}
