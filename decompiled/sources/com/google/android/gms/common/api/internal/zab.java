package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    zab(C1420a c1420a) {
        this.zaa = new WeakReference(c1420a);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C1420a c1420a = (C1420a) this.zaa.get();
        if (c1420a == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        c1420a.c(runnable);
        return this;
    }
}
