package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1114j implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1113i f9547a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9548a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f9548a = iArr;
            try {
                iArr[k0.b.f9567j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9548a[k0.b.f9566i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9548a[k0.b.f9564g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9548a[k0.b.f9555H.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9548a[k0.b.f9557J.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9548a[k0.b.f9572w.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9548a[k0.b.f9565h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9548a[k0.b.f9562e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9548a[k0.b.f9556I.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9548a[k0.b.f9558K.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9548a[k0.b.f9563f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9548a[k0.b.f9568k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C1114j(AbstractC1113i abstractC1113i) {
        AbstractC1113i abstractC1113i2 = (AbstractC1113i) AbstractC1124u.b(abstractC1113i, "output");
        this.f9547a = abstractC1113i2;
        abstractC1113i2.f9516a = this;
    }

    public static C1114j P(AbstractC1113i abstractC1113i) {
        C1114j c1114j = abstractC1113i.f9516a;
        return c1114j != null ? c1114j : new C1114j(abstractC1113i);
    }

    private void Q(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.a0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iD = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD += AbstractC1113i.d(((Boolean) list.get(i12)).booleanValue());
        }
        this.f9547a.O0(iD);
        while (i11 < list.size()) {
            this.f9547a.b0(((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    private void R(int i10, boolean z9, Object obj, C.a aVar) {
        this.f9547a.M0(i10, 2);
        this.f9547a.O0(C.b(aVar, Boolean.valueOf(z9), obj));
        C.e(this.f9547a, aVar, Boolean.valueOf(z9), obj);
    }

    private void S(int i10, C.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            Object obj = map.get(Integer.valueOf(i13));
            this.f9547a.M0(i10, 2);
            this.f9547a.O0(C.b(aVar, Integer.valueOf(i13), obj));
            C.e(this.f9547a, aVar, Integer.valueOf(i13), obj);
        }
    }

    private void T(int i10, C.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = ((Long) it.next()).longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            Object obj = map.get(Long.valueOf(j10));
            this.f9547a.M0(i10, 2);
            this.f9547a.O0(C.b(aVar, Long.valueOf(j10), obj));
            C.e(this.f9547a, aVar, Long.valueOf(j10), obj);
        }
    }

    private void U(int i10, C.a aVar, Map map) {
        switch (a.f9548a[aVar.f9392a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    R(i10, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    R(i10, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                S(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                T(i10, aVar, map);
                return;
            case 12:
                V(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f9392a);
        }
    }

    private void V(int i10, C.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = (String) it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            Object obj = map.get(str);
            this.f9547a.M0(i10, 2);
            this.f9547a.O0(C.b(aVar, str, obj));
            C.e(this.f9547a, aVar, str, obj);
        }
    }

    private void W(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.g0(i10, ((Double) list.get(i11)).doubleValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC1113i.i(((Double) list.get(i13)).doubleValue());
        }
        this.f9547a.O0(i12);
        while (i11 < list.size()) {
            this.f9547a.h0(((Double) list.get(i11)).doubleValue());
            i11++;
        }
    }

    private void X(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.i0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += AbstractC1113i.k(((Integer) list.get(i12)).intValue());
        }
        this.f9547a.O0(iK);
        while (i11 < list.size()) {
            this.f9547a.j0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void Y(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.k0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += AbstractC1113i.m(((Integer) list.get(i12)).intValue());
        }
        this.f9547a.O0(iM);
        while (i11 < list.size()) {
            this.f9547a.l0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void Z(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.m0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += AbstractC1113i.o(((Long) list.get(i12)).longValue());
        }
        this.f9547a.O0(iO);
        while (i11 < list.size()) {
            this.f9547a.n0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void a0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.o0(i10, ((Float) list.get(i11)).floatValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC1113i.q(((Float) list.get(i12)).floatValue());
        }
        this.f9547a.O0(iQ);
        while (i11 < list.size()) {
            this.f9547a.p0(((Float) list.get(i11)).floatValue());
            i11++;
        }
    }

    private void b0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.u0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += AbstractC1113i.v(((Integer) list.get(i12)).intValue());
        }
        this.f9547a.O0(iV);
        while (i11 < list.size()) {
            this.f9547a.v0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void c0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.w0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += AbstractC1113i.x(((Long) list.get(i12)).longValue());
        }
        this.f9547a.O0(iX);
        while (i11 < list.size()) {
            this.f9547a.x0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void d0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.C0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += AbstractC1113i.F(((Integer) list.get(i12)).intValue());
        }
        this.f9547a.O0(iF);
        while (i11 < list.size()) {
            this.f9547a.D0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    private void e0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.E0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iH = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iH += AbstractC1113i.H(((Long) list.get(i12)).longValue());
        }
        this.f9547a.O0(iH);
        while (i11 < list.size()) {
            this.f9547a.F0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void g0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.I0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += AbstractC1113i.L(((Long) list.get(i12)).longValue());
        }
        this.f9547a.O0(iL);
        while (i11 < list.size()) {
            this.f9547a.J0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    private void i0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.P0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iS = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS += AbstractC1113i.S(((Long) list.get(i12)).longValue());
        }
        this.f9547a.O0(iS);
        while (i11 < list.size()) {
            this.f9547a.Q0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void A(int i10, List list, boolean z9) {
        Q(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void B(int i10, float f10) {
        this.f9547a.o0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void C(int i10) {
        this.f9547a.M0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void D(int i10, List list, boolean z9) {
        f0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void E(int i10, int i11) {
        this.f9547a.i0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void F(int i10, List list, boolean z9) {
        c0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void G(int i10, List list, boolean z9) {
        W(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void H(int i10, int i11) {
        this.f9547a.G0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void I(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f9547a.e0(i10, (AbstractC1110f) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void J(int i10, List list, Y y9) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), y9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void K(int i10, AbstractC1110f abstractC1110f) {
        this.f9547a.e0(i10, abstractC1110f);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void L(int i10, Object obj, Y y9) {
        this.f9547a.y0(i10, (J) obj, y9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void M(int i10, C.a aVar, Map map) {
        if (this.f9547a.X()) {
            U(i10, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f9547a.M0(i10, 2);
            this.f9547a.O0(C.b(aVar, entry.getKey(), entry.getValue()));
            C.e(this.f9547a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void N(int i10, Object obj, Y y9) {
        this.f9547a.r0(i10, (J) obj, y9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void O(int i10, List list, Y y9) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), y9);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void a(int i10, List list, boolean z9) {
        a0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void b(int i10, Object obj) {
        if (obj instanceof AbstractC1110f) {
            this.f9547a.B0(i10, (AbstractC1110f) obj);
        } else {
            this.f9547a.A0(i10, (J) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void c(int i10, int i11) {
        this.f9547a.k0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void d(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f9547a.K0(i10, (String) list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void e(int i10, String str) {
        this.f9547a.K0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void f(int i10, long j10) {
        this.f9547a.P0(i10, j10);
    }

    public void f0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.G0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += AbstractC1113i.J(((Integer) list.get(i12)).intValue());
        }
        this.f9547a.O0(iJ);
        while (i11 < list.size()) {
            this.f9547a.H0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void g(int i10, List list, boolean z9) {
        b0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void h(int i10, int i11) {
        this.f9547a.u0(i10, i11);
    }

    public void h0(int i10, List list, boolean z9) {
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                this.f9547a.N0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f9547a.M0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += AbstractC1113i.Q(((Integer) list.get(i12)).intValue());
        }
        this.f9547a.O0(iQ);
        while (i11 < list.size()) {
            this.f9547a.O0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void i(int i10, long j10) {
        this.f9547a.E0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void j(int i10, List list, boolean z9) {
        Y(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void k(int i10, List list, boolean z9) {
        h0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void l(int i10, List list, boolean z9) {
        g0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void m(int i10, long j10) {
        this.f9547a.I0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void n(int i10, List list, boolean z9) {
        X(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void o(int i10, int i11) {
        this.f9547a.N0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void p(int i10, double d10) {
        this.f9547a.g0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void q(int i10, List list, boolean z9) {
        e0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void r(int i10, List list, boolean z9) {
        i0(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void s(int i10, long j10) {
        this.f9547a.m0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public l0.a t() {
        return l0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void u(int i10, long j10) {
        this.f9547a.w0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void v(int i10, boolean z9) {
        this.f9547a.a0(i10, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void w(int i10, int i11) {
        this.f9547a.C0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void x(int i10) {
        this.f9547a.M0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void y(int i10, List list, boolean z9) {
        Z(i10, list, z9);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void z(int i10, List list, boolean z9) {
        d0(i10, list, z9);
    }
}
