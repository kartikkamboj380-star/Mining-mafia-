package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4692p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f32280a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4566o30 f32281b;

    public final void a(boolean z9) {
        this.f32280a.set(true);
    }

    public final boolean b() {
        return this.f32280a.get();
    }

    final void c(C4566o30 c4566o30) {
        this.f32281b = c4566o30;
    }

    final C4566o30 d() {
        return this.f32281b;
    }
}
