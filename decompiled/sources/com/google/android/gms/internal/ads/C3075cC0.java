package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cC0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3075cC0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C3201dC0 f27063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long[] f27064b;

    C3075cC0(C3201dC0 c3201dC0, long[] jArr) {
        this.f27063a = c3201dC0;
        this.f27064b = jArr;
    }

    C3075cC0(C3075cC0 c3075cC0) {
        this.f27063a = new C3201dC0(c3075cC0.f27063a);
        this.f27064b = Arrays.copyOf(c3075cC0.f27064b, 10);
    }
}
