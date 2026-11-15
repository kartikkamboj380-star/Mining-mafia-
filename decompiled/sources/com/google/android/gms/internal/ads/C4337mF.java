package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.mF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4337mF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f31471a;

    C4337mF(C5011rb0 c5011rb0) {
        AtomicLong atomicLong = new AtomicLong();
        this.f31471a = atomicLong;
        atomicLong.set(c5011rb0.f32990a.f31840a.f35812u.get());
    }

    public final long a() {
        return this.f31471a.get();
    }

    public final void b(long j10) {
        this.f31471a.set(j10);
    }
}
