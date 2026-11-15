package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5556vw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f34192a = new AtomicBoolean(false);

    public C5556vw(String str) {
    }

    public final boolean a() {
        return this.f34192a.get();
    }

    public final void b() {
        this.f34192a.set(true);
    }

    public final void c() {
        this.f34192a.set(false);
    }

    public final void d() {
        this.f34192a.set(false);
    }
}
