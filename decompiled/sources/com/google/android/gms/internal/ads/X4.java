package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class X4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U4 f25129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f25131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f25132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f25134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f25135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f25136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f25137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f25138j;

    public X4(U4 u10, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z9, long j10, int i11) {
        int length = iArr.length;
        int length2 = jArr2.length;
        AbstractC2418Ss0.a(length == length2);
        AbstractC2418Ss0.a(jArr.length == length2);
        int length3 = iArr2.length;
        AbstractC2418Ss0.a(length3 == length2);
        this.f25129a = u10;
        this.f25131c = jArr;
        this.f25132d = iArr;
        this.f25133e = i10;
        this.f25134f = jArr2;
        this.f25135g = iArr2;
        this.f25136h = iArr3;
        this.f25138j = z9;
        this.f25137i = j10;
        this.f25130b = i11;
        if (length3 > 0) {
            int i12 = length3 - 1;
            iArr2[i12] = iArr2[i12] | 536870912;
        }
    }

    public final int a(long j10) {
        int i10 = 0;
        if (this.f25138j) {
            return AbstractC4634ob0.I(this.f25134f, j10, true, false);
        }
        int[] iArr = this.f25136h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (this.f25134f[iArr[i12]] <= j10) {
                i10 = i12 + 1;
                i11 = i12;
            } else {
                length = i12 - 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long[] jArr = this.f25134f;
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 > 0) {
                int i13 = i11 - 1;
                if (jArr[iArr[i13]] != j11) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }

    public final int b(long j10) {
        int i10 = 0;
        if (this.f25138j) {
            return AbstractC4634ob0.K(this.f25134f, j10, true, false);
        }
        int[] iArr = this.f25136h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (this.f25134f[iArr[i12]] >= j10) {
                length = i12 - 1;
                i11 = i12;
            } else {
                i10 = i12 + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long[] jArr = this.f25134f;
        long j11 = jArr[iArr[i11]];
        if (j11 == j10) {
            while (i11 < iArr.length - 1) {
                int i13 = i11 + 1;
                if (jArr[iArr[i13]] != j11) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }
}
