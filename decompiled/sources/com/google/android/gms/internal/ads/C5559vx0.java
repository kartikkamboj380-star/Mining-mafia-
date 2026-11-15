package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5559vx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f34198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC5931yu0 f34199b;

    /* synthetic */ C5559vx0(boolean z9, AbstractC5931yu0 abstractC5931yu0, byte[] bArr) {
        this.f34198a = z9;
        this.f34199b = abstractC5931yu0;
    }

    public final com.google.common.util.concurrent.p a(Callable callable, Executor executor) {
        return new C4174kx0(this.f34199b, this.f34198a, executor, callable);
    }
}
