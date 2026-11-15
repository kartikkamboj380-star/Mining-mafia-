package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2807a4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long[] f26396d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f26397a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26399c;

    public static int d(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = i11 + 1;
            if ((f26396d[i11] & ((long) i10)) != 0) {
                return i12;
            }
            i11 = i12;
        }
        return -1;
    }

    public static long e(byte[] bArr, int i10, boolean z9) {
        long j10 = ((long) bArr[0]) & 255;
        if (z9) {
            j10 &= ~f26396d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public final void a() {
        this.f26398b = 0;
        this.f26399c = 0;
    }

    public final long b(J1 j10, boolean z9, boolean z10, int i10) {
        if (this.f26398b == 0) {
            byte[] bArr = this.f26397a;
            if (!j10.K(bArr, 0, 1, z9)) {
                return -1L;
            }
            int iD = d(bArr[0] & 255);
            this.f26399c = iD;
            if (iD == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f26398b = 1;
        }
        int i11 = this.f26399c;
        if (i11 > i10) {
            this.f26398b = 0;
            return -2L;
        }
        if (i11 != 1) {
            j10.I(this.f26397a, 1, i11 - 1);
        }
        this.f26398b = 0;
        return e(this.f26397a, this.f26399c, z10);
    }

    public final int c() {
        return this.f26399c;
    }
}
