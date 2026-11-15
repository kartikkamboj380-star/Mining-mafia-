package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6120r1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final C6120r1 f36143e = new C6120r1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f36145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f36146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36147d;

    private C6120r1(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f36144a = i10;
        this.f36145b = iArr;
        this.f36146c = objArr;
        this.f36147d = z9;
    }

    public static C6120r1 a() {
        return f36143e;
    }

    static C6120r1 c(C6120r1 c6120r1, C6120r1 c6120r2) {
        int i10 = c6120r1.f36144a + c6120r2.f36144a;
        int[] iArrCopyOf = Arrays.copyOf(c6120r1.f36145b, i10);
        System.arraycopy(c6120r2.f36145b, 0, iArrCopyOf, c6120r1.f36144a, c6120r2.f36144a);
        Object[] objArrCopyOf = Arrays.copyOf(c6120r1.f36146c, i10);
        System.arraycopy(c6120r2.f36146c, 0, objArrCopyOf, c6120r1.f36144a, c6120r2.f36144a);
        return new C6120r1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static C6120r1 d() {
        return new C6120r1(0, new int[8], new Object[8], true);
    }

    private final void i(int i10) {
        int[] iArr = this.f36145b;
        if (i10 > iArr.length) {
            int i11 = this.f36144a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f36145b = Arrays.copyOf(iArr, i10);
            this.f36146c = Arrays.copyOf(this.f36146c, i10);
        }
    }

    final C6120r1 b(C6120r1 c6120r1) {
        if (c6120r1.equals(f36143e)) {
            return this;
        }
        e();
        int i10 = this.f36144a + c6120r1.f36144a;
        i(i10);
        System.arraycopy(c6120r1.f36145b, 0, this.f36145b, this.f36144a, c6120r1.f36144a);
        System.arraycopy(c6120r1.f36146c, 0, this.f36146c, this.f36144a, c6120r1.f36144a);
        this.f36144a = i10;
        return this;
    }

    final void e() {
        if (!this.f36147d) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6120r1)) {
            return false;
        }
        C6120r1 c6120r1 = (C6120r1) obj;
        int i10 = this.f36144a;
        if (i10 == c6120r1.f36144a) {
            int[] iArr = this.f36145b;
            int[] iArr2 = c6120r1.f36145b;
            for (int i11 = 0; i11 < i10; i11++) {
                if (iArr[i11] == iArr2[i11]) {
                }
            }
            Object[] objArr = this.f36146c;
            Object[] objArr2 = c6120r1.f36146c;
            int i12 = this.f36144a;
            for (int i13 = 0; i13 < i12; i13++) {
                if (objArr[i13].equals(objArr2[i13])) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.f36147d) {
            this.f36147d = false;
        }
    }

    final void g(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f36144a; i11++) {
            AbstractC6073b1.b(sb, i10, String.valueOf(this.f36145b[i11] >>> 3), this.f36146c[i11]);
        }
    }

    final void h(int i10, Object obj) {
        e();
        i(this.f36144a + 1);
        int[] iArr = this.f36145b;
        int i11 = this.f36144a;
        iArr[i11] = i10;
        this.f36146c[i11] = obj;
        this.f36144a = i11 + 1;
    }

    public final int hashCode() {
        int i10 = this.f36144a;
        int i11 = i10 + 527;
        int[] iArr = this.f36145b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 * 31) + i12;
        Object[] objArr = this.f36146c;
        int i15 = this.f36144a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return (i14 * 31) + iHashCode;
    }
}
