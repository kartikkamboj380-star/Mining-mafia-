package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3677h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f28775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A01[] f28776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f28777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[][][] f28778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A01 f28779e;

    C3677h(String[] strArr, int[] iArr, A01[] a01Arr, int[] iArr2, int[][][] iArr3, A01 a01) {
        this.f28775a = iArr;
        this.f28776b = a01Arr;
        this.f28778d = iArr3;
        this.f28777c = iArr2;
        this.f28779e = a01;
    }

    public final int a(int i10) {
        return this.f28775a[i10];
    }

    public final A01 b(int i10) {
        return this.f28776b[i10];
    }

    public final int c(int i10, int i11, int i12) {
        return this.f28778d[i10][i11][i12];
    }

    public final int d(int i10, int i11, boolean z9) {
        A01[] a01Arr = this.f28776b;
        int i12 = a01Arr[i10].a(i11).f24070a;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.f28778d[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        String str = null;
        int i16 = 0;
        int iMin = 16;
        boolean z10 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = a01Arr[i10].a(i11).a(iArrCopyOf[i13]).f19929o;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z10 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.f28778d[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z10 ? Math.min(iMin, this.f28777c[i10]) : iMin;
    }

    public final A01 e() {
        return this.f28779e;
    }
}
