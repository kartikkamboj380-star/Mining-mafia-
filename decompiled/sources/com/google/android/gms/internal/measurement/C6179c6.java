package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6179c6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C6179c6 f36646f = new C6179c6(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f36648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f36649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36650d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36651e;

    private C6179c6(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f36647a = i10;
        this.f36648b = iArr;
        this.f36649c = objArr;
        this.f36651e = z9;
    }

    public static C6179c6 a() {
        return f36646f;
    }

    static C6179c6 b() {
        return new C6179c6(0, new int[8], new Object[8], true);
    }

    static C6179c6 c(C6179c6 c6179c6, C6179c6 c6179c7) {
        int i10 = c6179c6.f36647a + c6179c7.f36647a;
        int[] iArrCopyOf = Arrays.copyOf(c6179c6.f36648b, i10);
        System.arraycopy(c6179c7.f36648b, 0, iArrCopyOf, c6179c6.f36647a, c6179c7.f36647a);
        Object[] objArrCopyOf = Arrays.copyOf(c6179c6.f36649c, i10);
        System.arraycopy(c6179c7.f36649c, 0, objArrCopyOf, c6179c6.f36647a, c6179c7.f36647a);
        return new C6179c6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void l(int i10) {
        int[] iArr = this.f36648b;
        if (i10 > iArr.length) {
            int i11 = this.f36647a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f36648b = Arrays.copyOf(iArr, i10);
            this.f36649c = Arrays.copyOf(this.f36649c, i10);
        }
    }

    public final void d() {
        if (this.f36651e) {
            this.f36651e = false;
        }
    }

    final void e() {
        if (!this.f36651e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6179c6)) {
            return false;
        }
        C6179c6 c6179c6 = (C6179c6) obj;
        int i10 = this.f36647a;
        if (i10 == c6179c6.f36647a) {
            int[] iArr = this.f36648b;
            int[] iArr2 = c6179c6.f36648b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f36649c;
            Object[] objArr2 = c6179c6.f36649c;
            int i12 = this.f36647a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(InterfaceC6287o6 interfaceC6287o6) {
        if (this.f36647a != 0) {
            for (int i10 = 0; i10 < this.f36647a; i10++) {
                int i11 = this.f36648b[i10];
                Object obj = this.f36649c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC6287o6.h(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC6287o6.d(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC6287o6.C(i13, (K4) obj);
                } else if (i12 == 3) {
                    interfaceC6287o6.j(i13);
                    ((C6179c6) obj).f(interfaceC6287o6);
                    interfaceC6287o6.k(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C6277n5("Protocol message tag had invalid wire type."));
                    }
                    interfaceC6287o6.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int g() {
        int i10 = this.f36650d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f36647a; i11++) {
            int i12 = this.f36648b[i11] >>> 3;
            K4 k10 = (K4) this.f36649c[i11];
            int iE2 = P4.E(8);
            int iE3 = P4.E(16) + P4.E(i12);
            int iE4 = P4.E(24);
            int iD = k10.d();
            iE += iE2 + iE2 + iE3 + iE4 + P4.E(iD) + iD;
        }
        this.f36650d = iE;
        return iE;
    }

    public final int h() {
        int iE;
        int iA;
        int iE2;
        int i10 = this.f36650d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f36647a; i12++) {
            int i13 = this.f36648b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f36649c[i12]).getClass();
                    iE2 = P4.E(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    K4 k10 = (K4) this.f36649c[i12];
                    int iE3 = P4.E(i16);
                    int iD = k10.d();
                    iE2 = iE3 + P4.E(iD) + iD;
                } else if (i15 == 3) {
                    int iE4 = P4.E(i14 << 3);
                    iE = iE4 + iE4;
                    iA = ((C6179c6) this.f36649c[i12]).h();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C6277n5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f36649c[i12]).getClass();
                    iE2 = P4.E(i14 << 3) + 4;
                }
                i11 += iE2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f36649c[i12]).longValue();
                iE = P4.E(i17);
                iA = P4.a(jLongValue);
            }
            iE2 = iE + iA;
            i11 += iE2;
        }
        this.f36650d = i11;
        return i11;
    }

    public final int hashCode() {
        int i10 = this.f36647a;
        int i11 = i10 + 527;
        int[] iArr = this.f36648b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f36649c;
        int i15 = this.f36647a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f36647a; i11++) {
            H5.b(sb, i10, String.valueOf(this.f36648b[i11] >>> 3), this.f36649c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        e();
        l(this.f36647a + 1);
        int[] iArr = this.f36648b;
        int i11 = this.f36647a;
        iArr[i11] = i10;
        this.f36649c[i11] = obj;
        this.f36647a = i11 + 1;
    }

    final C6179c6 k(C6179c6 c6179c6) {
        if (c6179c6.equals(f36646f)) {
            return this;
        }
        e();
        int i10 = this.f36647a + c6179c6.f36647a;
        l(i10);
        System.arraycopy(c6179c6.f36648b, 0, this.f36648b, this.f36647a, c6179c6.f36647a);
        System.arraycopy(c6179c6.f36649c, 0, this.f36649c, this.f36647a, c6179c6.f36647a);
        this.f36647a = i10;
        return this;
    }
}
