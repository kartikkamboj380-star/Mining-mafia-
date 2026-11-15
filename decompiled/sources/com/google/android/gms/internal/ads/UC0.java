package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class UC0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UC0 f23944b = new UC0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final TC0 f23945c = new TC0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f23946a = new AtomicReference();

    public static UC0 a() {
        return f23944b;
    }

    public final LC0 b() {
        LC0 lc0 = (LC0) this.f23946a.get();
        return lc0 == null ? f23945c : lc0;
    }
}
