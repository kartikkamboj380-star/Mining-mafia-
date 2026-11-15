package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractRunnableC1436q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ zaaw f17076a;

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        this.f17076a.zab.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                }
            } catch (RuntimeException e10) {
                this.f17076a.zaa.zam(e10);
            }
        } finally {
            this.f17076a.zab.unlock();
        }
    }
}
