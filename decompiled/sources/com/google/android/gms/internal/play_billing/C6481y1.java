package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6481y1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C6481y1 f37352f = new C6481y1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f37354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f37355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37356d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37357e;

    private C6481y1(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f37353a = i10;
        this.f37354b = iArr;
        this.f37355c = objArr;
        this.f37357e = z9;
    }

    public static C6481y1 c() {
        return f37352f;
    }

    static C6481y1 e(C6481y1 c6481y1, C6481y1 c6481y2) {
        int i10 = c6481y1.f37353a + c6481y2.f37353a;
        int[] iArrCopyOf = Arrays.copyOf(c6481y1.f37354b, i10);
        System.arraycopy(c6481y2.f37354b, 0, iArrCopyOf, c6481y1.f37353a, c6481y2.f37353a);
        Object[] objArrCopyOf = Arrays.copyOf(c6481y1.f37355c, i10);
        System.arraycopy(c6481y2.f37355c, 0, objArrCopyOf, c6481y1.f37353a, c6481y2.f37353a);
        return new C6481y1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static C6481y1 f() {
        return new C6481y1(0, new int[8], new Object[8], true);
    }

    private final void m(int i10) {
        int[] iArr = this.f37354b;
        if (i10 > iArr.length) {
            int i11 = this.f37353a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f37354b = Arrays.copyOf(iArr, i10);
            this.f37355c = Arrays.copyOf(this.f37355c, i10);
        }
    }

    public final int a() {
        int iW;
        int iX;
        int iW2;
        int i10 = this.f37356d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37353a; i12++) {
            int i13 = this.f37354b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f37355c[i12]).getClass();
                    iW2 = Z.w(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    Q q10 = (Q) this.f37355c[i12];
                    int iW3 = Z.w(i16);
                    int iD = q10.d();
                    iW2 = iW3 + Z.w(iD) + iD;
                } else if (i15 == 3) {
                    int iW4 = Z.w(i14 << 3);
                    iW = iW4 + iW4;
                    iX = ((C6481y1) this.f37355c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(A0.a());
                    }
                    ((Integer) this.f37355c[i12]).getClass();
                    iW2 = Z.w(i14 << 3) + 4;
                }
                i11 += iW2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f37355c[i12]).longValue();
                iW = Z.w(i17);
                iX = Z.x(jLongValue);
            }
            iW2 = iW + iX;
            i11 += iW2;
        }
        this.f37356d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f37356d;
        if (i10 != -1) {
            return i10;
        }
        int iW = 0;
        for (int i11 = 0; i11 < this.f37353a; i11++) {
            int i12 = this.f37354b[i11] >>> 3;
            Q q10 = (Q) this.f37355c[i11];
            int iW2 = Z.w(8);
            int iW3 = Z.w(16) + Z.w(i12);
            int iW4 = Z.w(24);
            int iD = q10.d();
            iW += iW2 + iW2 + iW3 + iW4 + Z.w(iD) + iD;
        }
        this.f37356d = iW;
        return iW;
    }

    final C6481y1 d(C6481y1 c6481y1) {
        if (c6481y1.equals(f37352f)) {
            return this;
        }
        g();
        int i10 = this.f37353a + c6481y1.f37353a;
        m(i10);
        System.arraycopy(c6481y1.f37354b, 0, this.f37354b, this.f37353a, c6481y1.f37353a);
        System.arraycopy(c6481y1.f37355c, 0, this.f37355c, this.f37353a, c6481y1.f37353a);
        this.f37353a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6481y1)) {
            return false;
        }
        C6481y1 c6481y1 = (C6481y1) obj;
        int i10 = this.f37353a;
        if (i10 == c6481y1.f37353a) {
            int[] iArr = this.f37354b;
            int[] iArr2 = c6481y1.f37354b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f37355c;
            Object[] objArr2 = c6481y1.f37355c;
            int i12 = this.f37353a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    final void g() {
        if (!this.f37357e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f37357e) {
            this.f37357e = false;
        }
    }

    public final int hashCode() {
        int i10 = this.f37353a;
        int i11 = i10 + 527;
        int[] iArr = this.f37354b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f37355c;
        int i15 = this.f37353a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f37353a; i11++) {
            X0.b(sb, i10, String.valueOf(this.f37354b[i11] >>> 3), this.f37355c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f37353a + 1);
        int[] iArr = this.f37354b;
        int i11 = this.f37353a;
        iArr[i11] = i10;
        this.f37355c[i11] = obj;
        this.f37353a = i11 + 1;
    }

    final void k(P1 p10) {
        for (int i10 = 0; i10 < this.f37353a; i10++) {
            p10.zzw(this.f37354b[i10] >>> 3, this.f37355c[i10]);
        }
    }

    public final void l(P1 p10) {
        if (this.f37353a != 0) {
            for (int i10 = 0; i10 < this.f37353a; i10++) {
                int i11 = this.f37354b[i10];
                Object obj = this.f37355c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    p10.h(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    p10.t(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    p10.g(i13, (Q) obj);
                } else if (i12 == 3) {
                    p10.m(i13);
                    ((C6481y1) obj).l(p10);
                    p10.x(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(A0.a());
                    }
                    p10.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
