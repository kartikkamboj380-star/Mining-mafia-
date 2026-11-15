package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1rSDK {
    private static int getMediationNetwork(int i10, int[][] iArr) {
        return ((iArr[0][i10 >>> 24] + iArr[1][(i10 >>> 16) & 255]) ^ iArr[2][(i10 >>> 8) & 255]) + iArr[3][i10 & 255];
    }

    public static void getRevenue(int i10, int i11, boolean z9, int i12, int[] iArr, int[][] iArr2, int[] iArr3) {
        if (!z9) {
            getRevenue(iArr);
        }
        int i13 = 0;
        while (i13 < i12) {
            int i14 = i10 ^ iArr[i13];
            int mediationNetwork = i11 ^ getMediationNetwork(i14, iArr2);
            i13++;
            i11 = i14;
            i10 = mediationNetwork;
        }
        int i15 = i10 ^ iArr[iArr.length - 2];
        int i16 = i11 ^ iArr[iArr.length - 1];
        if (!z9) {
            getRevenue(iArr);
        }
        iArr3[0] = i16;
        iArr3[1] = i15;
    }

    private static void getRevenue(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length / 2; i10++) {
            int i11 = iArr[i10];
            iArr[i10] = iArr[(iArr.length - i10) - 1];
            iArr[(iArr.length - i10) - 1] = i11;
        }
    }
}
