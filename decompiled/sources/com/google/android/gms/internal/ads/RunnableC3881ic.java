package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3881ic implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4005jc f29474a;

    RunnableC3881ic(C4005jc c4005jc) {
        Objects.requireNonNull(c4005jc);
        this.f29474a = c4005jc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4005jc c4005jc = this.f29474a;
        synchronized (c4005jc.p()) {
            if (c4005jc.q()) {
                return;
            }
            c4005jc.r(true);
            try {
                c4005jc.n();
            } catch (Exception e10) {
                this.f29474a.o().c(2023, -1L, e10);
            }
            C4005jc c4005jc2 = this.f29474a;
            synchronized (c4005jc2.p()) {
                c4005jc2.r(false);
            }
        }
    }
}
