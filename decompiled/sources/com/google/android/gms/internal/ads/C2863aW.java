package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2863aW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f26545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26546e;

    public C2863aW(int i10) {
        int i11 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        this.f26542a = 0;
        this.f26543b = -1;
        this.f26544c = 0;
        long[] jArr = new long[i11];
        this.f26545d = jArr;
        this.f26546e = jArr.length - 1;
    }

    public final void a(long j10) {
        int i10 = this.f26544c;
        long[] jArr = this.f26545d;
        int length = jArr.length;
        if (i10 == length) {
            int i11 = length + length;
            if (i11 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i11];
            int i12 = this.f26542a;
            int i13 = length - i12;
            System.arraycopy(jArr, i12, jArr2, 0, i13);
            System.arraycopy(this.f26545d, 0, jArr2, i13, i12);
            this.f26542a = 0;
            this.f26543b = this.f26544c - 1;
            this.f26545d = jArr2;
            this.f26546e = jArr2.length - 1;
            jArr = jArr2;
        }
        int i14 = (this.f26543b + 1) & this.f26546e;
        this.f26543b = i14;
        jArr[i14] = j10;
        this.f26544c++;
    }

    public final long b() {
        int i10 = this.f26544c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f26545d;
        int i11 = this.f26542a;
        long j10 = jArr[i11];
        this.f26542a = this.f26546e & (i11 + 1);
        this.f26544c = i10 - 1;
        return j10;
    }

    public final long c() {
        if (this.f26544c != 0) {
            return this.f26545d[this.f26542a];
        }
        throw new NoSuchElementException();
    }

    public final boolean d() {
        return this.f26544c == 0;
    }

    public final void e() {
        this.f26542a = 0;
        this.f26543b = -1;
        this.f26544c = 0;
    }
}
