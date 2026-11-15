package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class G01 extends I01 {
    protected G01(C2495Uf c2495Uf, int[] iArr, int i10, InterfaceC5312u interfaceC5312u, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List list, InterfaceC3471fM interfaceC3471fM) {
        super(c2495Uf, iArr, 0);
        AbstractC5931yu0.u(list);
    }

    static /* synthetic */ AbstractC5931yu0 a(C3174d[] c3174dArr) {
        int i10;
        int i11;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                break;
            }
            C3174d c3174d = c3174dArr[i13];
            if (c3174d == null || c3174d.f27268b.length <= 1) {
                arrayList.add(null);
            } else {
                int i14 = AbstractC5931yu0.f35482c;
                C5553vu0 c5553vu0 = new C5553vu0();
                c5553vu0.g(new E01(0L, 0L));
                arrayList.add(c5553vu0);
            }
            i13++;
        }
        long[][] jArr2 = new long[2][];
        for (int i15 = 0; i15 < 2; i15++) {
            C3174d c3174d2 = c3174dArr[i15];
            if (c3174d2 == null) {
                jArr2[i15] = new long[0];
            } else {
                int[] iArr = c3174d2.f27268b;
                jArr2[i15] = new long[iArr.length];
                for (int i16 = 0; i16 < iArr.length; i16++) {
                    long j10 = c3174d2.f27267a.a(iArr[i16]).f19924j;
                    long[] jArr3 = jArr2[i15];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr3[i16] = j10;
                }
                Arrays.sort(jArr2[i15]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i17 = 0; i17 < 2; i17++) {
            long[] jArr5 = jArr2[i17];
            jArr4[i17] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        d(arrayList, jArr4);
        InterfaceC2526Uu0 interfaceC2526Uu0C = AbstractC4548nv0.b(AbstractC5051rv0.b()).b(2).c();
        int i18 = 0;
        while (i18 < 2) {
            int length = jArr2[i18].length;
            if (length <= i10) {
                i11 = i12;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i19 = i12;
                while (true) {
                    long[] jArr6 = jArr2[i18];
                    double dLog = 0.0d;
                    if (i19 >= jArr6.length) {
                        break;
                    }
                    int i20 = i12;
                    long[][] jArr7 = jArr2;
                    long j11 = jArr6[i19];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i19] = dLog;
                    i19++;
                    i12 = i20;
                    jArr2 = jArr7;
                }
                i11 = i12;
                jArr = jArr2;
                int i21 = length - 1;
                double d10 = dArr[i21] - dArr[i11];
                int i22 = i11;
                while (i22 < i21) {
                    double d11 = dArr[i22];
                    i22++;
                    interfaceC2526Uu0C.zze(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i22]) * 0.5d) - dArr[i11]) / d10), Integer.valueOf(i18));
                    i10 = i10;
                }
            }
            i18++;
            i12 = i11;
            jArr2 = jArr;
            i10 = i10;
        }
        int i23 = i12;
        long[][] jArr8 = jArr2;
        AbstractC5931yu0 abstractC5931yu0U = AbstractC5931yu0.u(interfaceC2526Uu0C.g());
        for (int i24 = i23; i24 < abstractC5931yu0U.size(); i24++) {
            int iIntValue = ((Integer) abstractC5931yu0U.get(i24)).intValue();
            int i25 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i25;
            jArr4[iIntValue] = jArr8[iIntValue][i25];
            d(arrayList, jArr4);
        }
        for (int i26 = i23; i26 < 2; i26++) {
            if (arrayList.get(i26) != null) {
                long j12 = jArr4[i26];
                jArr4[i26] = j12 + j12;
            }
        }
        d(arrayList, jArr4);
        C5553vu0 c5553vu1 = new C5553vu0();
        while (i23 < arrayList.size()) {
            C5553vu0 c5553vu2 = (C5553vu0) arrayList.get(i23);
            c5553vu1.g(c5553vu2 == null ? AbstractC5931yu0.l() : c5553vu2.j());
            i23++;
        }
        return c5553vu1.j();
    }

    private static void d(List list, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            C5553vu0 c5553vu0 = (C5553vu0) list.get(i11);
            if (c5553vu0 != null) {
                c5553vu0.g(new E01(j10, jArr[i11]));
            }
        }
    }
}
