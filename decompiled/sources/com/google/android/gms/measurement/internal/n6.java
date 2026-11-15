package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f38230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f38231b;

    /* synthetic */ n6(q6 q6Var, String str, byte[] bArr) {
        this(q6Var, str);
    }

    private n6(q6 q6Var, String str) {
        Objects.requireNonNull(q6Var);
        this.f38230a = str;
        this.f38231b = q6Var.e().elapsedRealtime();
    }

    /* synthetic */ n6(q6 q6Var, byte[] bArr) {
        this(q6Var, q6Var.N0().l0());
    }
}
