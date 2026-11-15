package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC6650w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3 f38438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC6657x f38439b;

    RunnableC6650w(AbstractC6657x abstractC6657x, C3 c10) {
        this.f38438a = c10;
        Objects.requireNonNull(abstractC6657x);
        this.f38439b = abstractC6657x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3 c10 = this.f38438a;
        c10.c();
        if (C6527f.a()) {
            c10.b().t(this);
            return;
        }
        AbstractC6657x abstractC6657x = this.f38439b;
        boolean zC = abstractC6657x.c();
        abstractC6657x.e(0L);
        if (zC) {
            abstractC6657x.a();
        }
    }
}
