package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes2.dex */
final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1421b f17030a;

    a0(C1421b c1421b) {
        this.f17030a = c1421b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17030a.f17043m.lock();
        try {
            C1421b.p(this.f17030a);
        } finally {
            this.f17030a.f17043m.unlock();
        }
    }
}
