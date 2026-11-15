package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C2824aC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long[] f26449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f26450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long[] f26451c;

    C2824aC0(long[] jArr, long[] jArr2, long[] jArr3) {
        this.f26449a = jArr;
        this.f26450b = jArr2;
        this.f26451c = jArr3;
    }

    void a(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    final void b(C2824aC0 c2824aC0, int i10) {
        ZB0.a(this.f26449a, c2824aC0.f26449a, i10);
        ZB0.a(this.f26450b, c2824aC0.f26450b, i10);
        ZB0.a(this.f26451c, c2824aC0.f26451c, i10);
    }

    C2824aC0(C2824aC0 c2824aC0) {
        this.f26449a = Arrays.copyOf(c2824aC0.f26449a, 10);
        this.f26450b = Arrays.copyOf(c2824aC0.f26450b, 10);
        this.f26451c = Arrays.copyOf(c2824aC0.f26451c, 10);
    }
}
