package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC6308r1 extends C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p136n5.A f36873a;

    BinderC6308r1(p136n5.A a10) {
        this.f36873a = a10;
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final void R0(String str, String str2, Bundle bundle, long j10) {
        this.f36873a.a(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.E0
    public final int b() {
        return System.identityHashCode(this.f36873a);
    }
}
