package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2972bN0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2972bN0 f26806f = new C2972bN0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f26808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f26809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26811e;

    private C2972bN0(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f26810d = -1;
        this.f26807a = i10;
        this.f26808b = iArr;
        this.f26809c = objArr;
        this.f26811e = z9;
    }

    public static C2972bN0 a() {
        return f26806f;
    }

    static C2972bN0 b() {
        return new C2972bN0();
    }

    static C2972bN0 c(C2972bN0 c2972bN0, C2972bN0 c2972bN1) {
        int i10 = c2972bN0.f26807a + c2972bN1.f26807a;
        int[] iArrCopyOf = Arrays.copyOf(c2972bN0.f26808b, i10);
        System.arraycopy(c2972bN1.f26808b, 0, iArrCopyOf, c2972bN0.f26807a, c2972bN1.f26807a);
        Object[] objArrCopyOf = Arrays.copyOf(c2972bN0.f26809c, i10);
        System.arraycopy(c2972bN1.f26809c, 0, objArrCopyOf, c2972bN0.f26807a, c2972bN1.f26807a);
        return new C2972bN0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void l(int i10) {
        int[] iArr = this.f26808b;
        if (i10 > iArr.length) {
            int i11 = this.f26807a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f26808b = Arrays.copyOf(iArr, i10);
            this.f26809c = Arrays.copyOf(this.f26809c, i10);
        }
    }

    public final void d() {
        if (this.f26811e) {
            this.f26811e = false;
        }
    }

    final void e() {
        if (!this.f26811e) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2972bN0)) {
            return false;
        }
        C2972bN0 c2972bN0 = (C2972bN0) obj;
        int i10 = this.f26807a;
        if (i10 == c2972bN0.f26807a) {
            int[] iArr = this.f26808b;
            int[] iArr2 = c2972bN0.f26808b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f26809c;
            Object[] objArr2 = c2972bN0.f26809c;
            int i12 = this.f26807a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(InterfaceC4732pN0 interfaceC4732pN0) {
        if (this.f26807a != 0) {
            for (int i10 = 0; i10 < this.f26807a; i10++) {
                int i11 = this.f26808b[i10];
                Object obj = this.f26809c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC4732pN0.h(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC4732pN0.d(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC4732pN0.z(i13, (AbstractC5231tL0) obj);
                } else if (i12 == 3) {
                    interfaceC4732pN0.j(i13);
                    ((C2972bN0) obj).f(interfaceC4732pN0);
                    interfaceC4732pN0.k(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new C3472fM0("Protocol message tag had invalid wire type."));
                    }
                    interfaceC4732pN0.e(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int g() {
        int i10 = this.f26810d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f26807a; i11++) {
            int i12 = this.f26808b[i11] >>> 3;
            AbstractC5231tL0 abstractC5231tL0 = (AbstractC5231tL0) this.f26809c[i11];
            int iB2 = CL0.b(8);
            int iB3 = CL0.b(16) + CL0.b(i12);
            int iB4 = CL0.b(24);
            int iJ = abstractC5231tL0.j();
            iB += iB2 + iB2 + iB3 + iB4 + CL0.b(iJ) + iJ;
        }
        this.f26810d = iB;
        return iB;
    }

    public final int h() {
        int iB;
        int iC;
        int iB2;
        int i10 = this.f26810d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f26807a; i12++) {
            int i13 = this.f26808b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f26809c[i12]).getClass();
                    iB2 = CL0.b(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    AbstractC5231tL0 abstractC5231tL0 = (AbstractC5231tL0) this.f26809c[i12];
                    int iB3 = CL0.b(i16);
                    int iJ = abstractC5231tL0.j();
                    iB2 = iB3 + CL0.b(iJ) + iJ;
                } else if (i15 == 3) {
                    int iB4 = CL0.b(i14 << 3);
                    iB = iB4 + iB4;
                    iC = ((C2972bN0) this.f26809c[i12]).h();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new C3472fM0("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f26809c[i12]).getClass();
                    iB2 = CL0.b(i14 << 3) + 4;
                }
                i11 += iB2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f26809c[i12]).longValue();
                iB = CL0.b(i17);
                iC = CL0.c(jLongValue);
            }
            iB2 = iB + iC;
            i11 += iB2;
        }
        this.f26810d = i11;
        return i11;
    }

    public final int hashCode() {
        int i10 = this.f26807a;
        int i11 = i10 + 527;
        int[] iArr = this.f26808b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f26809c;
        int i15 = this.f26807a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f26807a; i11++) {
            AM0.b(sb, i10, String.valueOf(this.f26808b[i11] >>> 3), this.f26809c[i11]);
        }
    }

    final void j(int i10, Object obj) {
        e();
        l(this.f26807a + 1);
        int[] iArr = this.f26808b;
        int i11 = this.f26807a;
        iArr[i11] = i10;
        this.f26809c[i11] = obj;
        this.f26807a = i11 + 1;
    }

    final C2972bN0 k(C2972bN0 c2972bN0) {
        if (c2972bN0.equals(f26806f)) {
            return this;
        }
        e();
        int i10 = this.f26807a + c2972bN0.f26807a;
        l(i10);
        System.arraycopy(c2972bN0.f26808b, 0, this.f26808b, this.f26807a, c2972bN0.f26807a);
        System.arraycopy(c2972bN0.f26809c, 0, this.f26809c, this.f26807a, c2972bN0.f26807a);
        this.f26807a = i10;
        return this;
    }

    private C2972bN0() {
        this(0, new int[8], new Object[8], true);
    }
}
