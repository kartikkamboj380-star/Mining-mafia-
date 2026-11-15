package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class G4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ E4 f37542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E4 f37543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f37544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f37545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ M4 f37546e;

    G4(M4 m10, E4 e10, E4 e11, long j10, boolean z9) {
        this.f37542a = e10;
        this.f37543b = e11;
        this.f37544c = j10;
        this.f37545d = z9;
        Objects.requireNonNull(m10);
        this.f37546e = m10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37546e.B(this.f37542a, this.f37543b, this.f37544c, this.f37545d, null);
    }
}
