package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Sf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2392Sf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC2704Yf0 f23281a;

    RunnableC2392Sf0(AbstractC2704Yf0 abstractC2704Yf0) {
        Objects.requireNonNull(abstractC2704Yf0);
        this.f23281a = abstractC2704Yf0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC2704Yf0 abstractC2704Yf0 = this.f23281a;
        if (abstractC2704Yf0.i() != null) {
            C1561Cf0 c1561Cf0I = abstractC2704Yf0.i();
            Clock clockJ = abstractC2704Yf0.j();
            c1561Cf0I.j(clockJ.currentTimeMillis(), abstractC2704Yf0.k(), abstractC2704Yf0.f25665e.f1245d, abstractC2704Yf0.h());
        }
    }
}
