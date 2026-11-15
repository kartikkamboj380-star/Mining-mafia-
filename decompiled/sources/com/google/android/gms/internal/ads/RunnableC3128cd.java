package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC3128cd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewOnAttachStateChangeListenerC3379ed f27161a;

    RunnableC3128cd(ViewOnAttachStateChangeListenerC3379ed viewOnAttachStateChangeListenerC3379ed) {
        Objects.requireNonNull(viewOnAttachStateChangeListenerC3379ed);
        this.f27161a = viewOnAttachStateChangeListenerC3379ed;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27161a.d();
    }
}
