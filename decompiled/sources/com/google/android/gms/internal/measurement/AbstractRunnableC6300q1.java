package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractRunnableC6300q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final long f36839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f36840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f36841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ B1 f36842d;

    AbstractRunnableC6300q1(B1 b10, boolean z9) {
        Objects.requireNonNull(b10);
        this.f36842d = b10;
        this.f36839a = b10.f36247b.currentTimeMillis();
        this.f36840b = b10.f36247b.elapsedRealtime();
        this.f36841c = z9;
    }

    abstract void a();

    protected void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f36842d.m()) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f36842d.k(e10, false, this.f36841c);
            b();
        }
    }
}
