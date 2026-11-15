package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.zV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C6006zV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f35759b;

    public C6006zV(int i10) {
        this.f35759b = new long[i10];
    }

    public final void a(long j10) {
        int i10 = this.f35758a;
        long[] jArr = this.f35759b;
        if (i10 == jArr.length) {
            this.f35759b = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.f35759b;
        int i11 = this.f35758a;
        this.f35758a = i11 + 1;
        jArr2[i11] = 0;
    }

    public final void b(long[] jArr) {
        int i10 = this.f35758a;
        int length = jArr.length;
        int i11 = i10 + length;
        long[] jArr2 = this.f35759b;
        int length2 = jArr2.length;
        if (i11 > length2) {
            this.f35759b = Arrays.copyOf(jArr2, Math.max(length2 + length2, i11));
        }
        System.arraycopy(jArr, 0, this.f35759b, this.f35758a, length);
        this.f35758a = i11;
    }

    public final long c(int i10) {
        if (i10 >= 0 && i10 < this.f35758a) {
            return this.f35759b[i10];
        }
        int i11 = this.f35758a;
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 24 + String.valueOf(i11).length());
        sb.append("Invalid index ");
        sb.append(i10);
        sb.append(", size is ");
        sb.append(i11);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int d() {
        return this.f35758a;
    }
}
