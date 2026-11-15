package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class F4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f37519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f37520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ E4 f37521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f37522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f37523e;

    F4(M4 m10, Bundle bundle, E4 e10, E4 e11, long j10) {
        this.f37519a = bundle;
        this.f37520b = e10;
        this.f37521c = e11;
        this.f37522d = j10;
        Objects.requireNonNull(m10);
        this.f37523e = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37523e.A(this.f37519a, this.f37520b, this.f37521c, this.f37522d);
    }
}
