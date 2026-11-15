package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3555g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f28541a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f28542b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static C3429f1 a(byte[] bArr) {
        return b(new C4436n10(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c9, code lost:
    
        if (r11 != 3) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.C3429f1 b(com.google.android.gms.internal.ads.C4436n10 r11, boolean r12) throws com.google.android.gms.internal.ads.C2817a9 {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC3555g1.b(com.google.android.gms.internal.ads.n10, boolean):com.google.android.gms.internal.ads.f1");
    }

    private static int c(C4436n10 c4436n10) {
        int iJ = c4436n10.j(5);
        return iJ == 31 ? c4436n10.j(6) + 32 : iJ;
    }

    private static int d(C4436n10 c4436n10) throws C2817a9 {
        int iJ = c4436n10.j(4);
        if (iJ == 15) {
            if (c4436n10.c() >= 24) {
                return c4436n10.j(24);
            }
            throw C2817a9.b("AAC header insufficient data", null);
        }
        if (iJ < 13) {
            return f28541a[iJ];
        }
        throw C2817a9.b("AAC header wrong Sampling Frequency Index", null);
    }
}
