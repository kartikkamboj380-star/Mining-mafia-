package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.t01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5189t01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Random f33296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f33297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f33298c;

    public C5189t01(int i10) {
        this(0, new Random());
    }

    public final int a() {
        return this.f33297b.length;
    }

    public final int b(int i10) {
        int i11 = this.f33298c[i10] + 1;
        int[] iArr = this.f33297b;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    public final int c(int i10) {
        int i11 = this.f33298c[i10] - 1;
        if (i11 >= 0) {
            return this.f33297b[i11];
        }
        return -1;
    }

    public final int d() {
        int[] iArr = this.f33297b;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int e() {
        int[] iArr = this.f33297b;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final C5189t01 f(int i10, int i11) {
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        int i12 = 0;
        while (i12 < i11) {
            Random random = this.f33296a;
            iArr[i12] = random.nextInt(this.f33297b.length + 1);
            int i13 = i12 + 1;
            int iNextInt = random.nextInt(i13);
            iArr2[i12] = iArr2[iNextInt];
            iArr2[iNextInt] = i12;
            i12 = i13;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.f33297b;
        int[] iArr4 = new int[iArr3.length + i11];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < iArr3.length + i11; i16++) {
            if (i14 >= i11 || i15 != iArr[i14]) {
                int i17 = i15 + 1;
                int i18 = iArr3[i15];
                iArr4[i16] = i18;
                if (i18 >= 0) {
                    iArr4[i16] = i18 + i11;
                }
                i15 = i17;
            } else {
                iArr4[i16] = iArr2[i14];
                i14++;
            }
        }
        return new C5189t01(iArr4, new Random(this.f33296a.nextLong()));
    }

    public final C5189t01 g() {
        return new C5189t01(0, new Random(this.f33296a.nextLong()));
    }

    private C5189t01(int i10, Random random) {
        this(new int[0], random);
    }

    private C5189t01(int[] iArr, Random random) {
        this.f33297b = iArr;
        this.f33296a = random;
        this.f33298c = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f33298c[iArr[i10]] = i10;
        }
    }
}
