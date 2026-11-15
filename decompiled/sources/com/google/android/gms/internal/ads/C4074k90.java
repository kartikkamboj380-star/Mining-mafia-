package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4074k90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f30710a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f30711b = new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30713d;

    public C4074k90(int i10) {
    }

    private final Object f() {
        AbstractC2418Ss0.i(this.f30713d > 0);
        Object[] objArr = this.f30711b;
        int i10 = this.f30712c;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f30712c = (i10 + 1) % objArr.length;
        this.f30713d--;
        return obj;
    }

    public final synchronized void a(long j10, Object obj) {
        try {
            int i10 = this.f30713d;
            if (i10 > 0) {
                if (j10 <= this.f30710a[((this.f30712c + i10) - 1) % this.f30711b.length]) {
                    b();
                }
            }
            int length = this.f30711b.length;
            if (this.f30713d >= length) {
                int i11 = length + length;
                long[] jArr = new long[i11];
                Object[] objArr = new Object[i11];
                int i12 = this.f30712c;
                int i13 = length - i12;
                System.arraycopy(this.f30710a, i12, jArr, 0, i13);
                System.arraycopy(this.f30711b, this.f30712c, objArr, 0, i13);
                int i14 = this.f30712c;
                if (i14 > 0) {
                    System.arraycopy(this.f30710a, 0, jArr, i13, i14);
                    System.arraycopy(this.f30711b, 0, objArr, i13, this.f30712c);
                }
                this.f30710a = jArr;
                this.f30711b = objArr;
                this.f30712c = 0;
            }
            int i15 = this.f30712c;
            int i16 = this.f30713d;
            Object[] objArr2 = this.f30711b;
            int length2 = (i15 + i16) % objArr2.length;
            this.f30710a[length2] = j10;
            objArr2[length2] = obj;
            this.f30713d = i16 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        this.f30712c = 0;
        this.f30713d = 0;
        Arrays.fill(this.f30711b, (Object) null);
    }

    public final synchronized int c() {
        return this.f30713d;
    }

    public final synchronized Object d() {
        if (this.f30713d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object e(long j10) {
        Object objF;
        objF = null;
        while (this.f30713d > 0 && j10 - this.f30710a[this.f30712c] >= 0) {
            objF = f();
        }
        return objF;
    }
}
