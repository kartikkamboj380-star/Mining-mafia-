package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class PW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LW f22121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f22122b;

    public PW(LW lw, InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0) {
        this.f22121a = lw;
        this.f22122b = interfaceExecutorServiceC1805Gx0;
    }

    public final void a(InterfaceC4386md0 interfaceC4386md0) {
        final LW lw = this.f22121a;
        Objects.requireNonNull(lw);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.OW
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return lw.getWritableDatabase();
            }
        };
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = this.f22122b;
        AbstractC5685wx0.r(interfaceExecutorServiceC1805Gx0.e0(callable), new NW(this, interfaceC4386md0), interfaceExecutorServiceC1805Gx0);
    }
}
