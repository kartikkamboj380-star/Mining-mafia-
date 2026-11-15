package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ff, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3509ff {
    public static void a(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            b(i10, e(strArr, 0, length), c(strArr, 0, length), length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, 6);
        b(i10, jE, c(strArr, 0, 6), 6, priorityQueue);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            long jA = AbstractC3132cf.a(strArr[i12 - 1]);
            long jA2 = AbstractC3132cf.a(strArr[i12 + 5]);
            String strC = c(strArr, i12, 6);
            jE = ((((((jE + 1073807359) - ((d(16785407L, 5) * ((jA + 2147483647L) % 1073807359)) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((jA2 + 2147483647L) % 1073807359)) % 1073807359;
            b(i10, jE, strC, length2, priorityQueue);
            i12++;
        }
    }

    static void b(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        C3383ef c3383ef = new C3383ef(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((C3383ef) priorityQueue.peek()).f28030c <= c3383ef.f28030c && ((C3383ef) priorityQueue.peek()).f28028a <= c3383ef.f28028a)) && !priorityQueue.contains(c3383ef)) {
            priorityQueue.add(c3383ef);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    static String c(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            int i13 = AbstractC0786o0.f2696b;
            L4.p.c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i14 = i12 - 1;
            if (i10 >= i14) {
                sb.append(strArr[i14]);
                return sb.toString();
            }
            sb.append(strArr[i10]);
            sb.append(' ');
            i10++;
        }
    }

    static long d(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        int i11 = i10 >> 1;
        long j11 = (j10 * j10) % 1073807359;
        return ((i10 & 1) == 0 ? d(j11, i11) : j10 * (d(j11, i11) % 1073807359)) % 1073807359;
    }

    private static long e(String[] strArr, int i10, int i11) {
        long jA = (((long) AbstractC3132cf.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            jA = (((jA * 16785407) % 1073807359) + ((((long) AbstractC3132cf.a(strArr[i12])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }
}
