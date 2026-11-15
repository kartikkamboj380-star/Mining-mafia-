package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g0 f9503f = new g0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f9505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f9506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9508e;

    private g0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f9505b;
        if (i10 > iArr.length) {
            int i11 = this.f9504a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f9505b = Arrays.copyOf(iArr, i10);
            this.f9506c = Arrays.copyOf(this.f9506c, i10);
        }
    }

    public static g0 c() {
        return f9503f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static g0 j(g0 g0Var, g0 g0Var2) {
        int i10 = g0Var.f9504a + g0Var2.f9504a;
        int[] iArrCopyOf = Arrays.copyOf(g0Var.f9505b, i10);
        System.arraycopy(g0Var2.f9505b, 0, iArrCopyOf, g0Var.f9504a, g0Var2.f9504a);
        Object[] objArrCopyOf = Arrays.copyOf(g0Var.f9506c, i10);
        System.arraycopy(g0Var2.f9506c, 0, objArrCopyOf, g0Var.f9504a, g0Var2.f9504a);
        return new g0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static g0 k() {
        return new g0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, l0 l0Var) {
        int iA = k0.a(i10);
        int iB = k0.b(i10);
        if (iB == 0) {
            l0Var.u(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            l0Var.s(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            l0Var.K(iA, (AbstractC1110f) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(C1125v.e());
            }
            l0Var.c(iA, ((Integer) obj).intValue());
        } else if (l0Var.t() == l0.a.ASCENDING) {
            l0Var.x(iA);
            ((g0) obj).r(l0Var);
            l0Var.C(iA);
        } else {
            l0Var.C(iA);
            ((g0) obj).r(l0Var);
            l0Var.x(iA);
        }
    }

    void a() {
        if (!this.f9508e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iR;
        int i10 = this.f9507d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f9504a; i12++) {
            int i13 = this.f9505b[i12];
            int iA = k0.a(i13);
            int iB = k0.b(i13);
            if (iB == 0) {
                iR = AbstractC1113i.R(iA, ((Long) this.f9506c[i12]).longValue());
            } else if (iB == 1) {
                iR = AbstractC1113i.n(iA, ((Long) this.f9506c[i12]).longValue());
            } else if (iB == 2) {
                iR = AbstractC1113i.f(iA, (AbstractC1110f) this.f9506c[i12]);
            } else if (iB == 3) {
                iR = (AbstractC1113i.O(iA) * 2) + ((g0) this.f9506c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(C1125v.e());
                }
                iR = AbstractC1113i.l(iA, ((Integer) this.f9506c[i12]).intValue());
            }
            i11 += iR;
        }
        this.f9507d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f9507d;
        if (i10 != -1) {
            return i10;
        }
        int iD = 0;
        for (int i11 = 0; i11 < this.f9504a; i11++) {
            iD += AbstractC1113i.D(k0.a(this.f9505b[i11]), (AbstractC1110f) this.f9506c[i11]);
        }
        this.f9507d = iD;
        return iD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        int i10 = this.f9504a;
        return i10 == g0Var.f9504a && o(this.f9505b, g0Var.f9505b, i10) && l(this.f9506c, g0Var.f9506c, this.f9504a);
    }

    public void h() {
        if (this.f9508e) {
            this.f9508e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f9504a;
        return ((((527 + i10) * 31) + f(this.f9505b, i10)) * 31) + g(this.f9506c, this.f9504a);
    }

    g0 i(g0 g0Var) {
        if (g0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f9504a + g0Var.f9504a;
        b(i10);
        System.arraycopy(g0Var.f9505b, 0, this.f9505b, this.f9504a, g0Var.f9504a);
        System.arraycopy(g0Var.f9506c, 0, this.f9506c, this.f9504a, g0Var.f9504a);
        this.f9504a = i10;
        return this;
    }

    final void m(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f9504a; i11++) {
            L.d(sb, i10, String.valueOf(k0.a(this.f9505b[i11])), this.f9506c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f9504a + 1);
        int[] iArr = this.f9505b;
        int i11 = this.f9504a;
        iArr[i11] = i10;
        this.f9506c[i11] = obj;
        this.f9504a = i11 + 1;
    }

    void p(l0 l0Var) {
        if (l0Var.t() == l0.a.DESCENDING) {
            for (int i10 = this.f9504a - 1; i10 >= 0; i10--) {
                l0Var.b(k0.a(this.f9505b[i10]), this.f9506c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f9504a; i11++) {
            l0Var.b(k0.a(this.f9505b[i11]), this.f9506c[i11]);
        }
    }

    public void r(l0 l0Var) {
        if (this.f9504a == 0) {
            return;
        }
        if (l0Var.t() == l0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f9504a; i10++) {
                q(this.f9505b[i10], this.f9506c[i10], l0Var);
            }
            return;
        }
        for (int i11 = this.f9504a - 1; i11 >= 0; i11--) {
            q(this.f9505b[i11], this.f9506c[i11], l0Var);
        }
    }

    private g0(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f9507d = -1;
        this.f9504a = i10;
        this.f9505b = iArr;
        this.f9506c = objArr;
        this.f9508e = z9;
    }
}
