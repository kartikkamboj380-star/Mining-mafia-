package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC2758Zg0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f26273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2886ah0 f26274b;

    RunnableC2758Zg0(C2886ah0 c2886ah0) {
        Objects.requireNonNull(c2886ah0);
        this.f26274b = c2886ah0;
        this.f26273a = c2886ah0.q();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26273a.destroy();
    }
}
